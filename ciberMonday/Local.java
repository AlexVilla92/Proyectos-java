import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Local {

    private String nombreLocal;
    private List<Venta> ventas;
    private Map<Integer, Producto> productosDelLocal;

    public Local(String unNombre) {
        this.nombreLocal = unNombre;
        this.ventas = new ArrayList<Venta>();
        this.productosDelLocal = new HashMap<Integer, Producto>();
    }

    public void agregarVenta(Venta unaVenta) {
        this.ventas.add(unaVenta);
    }

    public Double calcularPrecio(Integer unCodigo) {

        return 0.0;
    }
}
