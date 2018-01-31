public class Empresa {
	private List<Establecimiento> establecimientos;
	private List<String> lugares;

	public Empresa() {
		this.establecimientos = new ArrayList<Establecimiento>();
		this.lugares = new ArrayList<String>();
	}

	public String lugarConMasVentas() {

	}

	public boolean existeLugarConClientesTacanios() {

	}

	public void agregarEstablecimiento(Establecimiento e) {
		this.establecimientos.add(e);
	}

	public void agregarLuagar(String unLugar) {
		this.lugares.add(unLugar);
	}
}