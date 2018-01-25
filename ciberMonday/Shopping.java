import java.util.List;
import java.util.ArrayList;

public class Shopping implements Establecimiento {

	private List<Local> locales;

	public Shopping() {
		this.locales = new ArrayList<Local>();
	}

	public void agregarLocal(Local unLocal) {
		this.locales.add(unLocal);
	}

	public Integer cantidadDeVentasPorLugar(String unLugar) {
		Integer ventasEnLugar = 0;

		for (Local unLocal: this.locales) {
			ventasEnLugar += unLocal.cantidadDeVentasPorLugar(unLugar); 
		}

        return ventasEnLugar;
    }

    public Double dineroMovido() {
        Double dinero = 0.0;

        for (Local unLocal: this.locales) {
        	dinero = dinero + unLocal.dineroMovido();
        }

        return dinero;
    }
}