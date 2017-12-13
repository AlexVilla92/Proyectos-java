import java.util.List;
import java.util.ArrayList;

class Bolillero {
	private List<Seleccion> bombo1;
	private List<Seleccion> bombo2;
	private List<Seleccion> bombo3;
	private List<Seleccion> bombo4;

	public Bolillero() {
		this.bombo1 = new ArrayList<Seleccion>();
		this.bombo2 = new ArrayList<Seleccion>();
		this.bombo3 = new ArrayList<Seleccion>();
		this.bombo4 = new ArrayList<Seleccion>();
	}

	public void cargarBombo(Seleccion pais) {
		int numberBombo = pais.getNumberBombo();

		switch (numberBombo) {
			case 1: this.bombo1.add(pais); break;
			case 2: this.bombo2.add(pais); break;
			case 3: this.bombo3.add(pais); break;
			default: this.bombo4.add(pais); break;
		}
	}

	public void getSizeBombos() {
		System.out.println("n paises bombo 1: " + this.bombo1.size());
		System.out.println("n paises bombo 2: " + this.bombo2.size());
		System.out.println("n paises bombo 3: " + this.bombo3.size());
		System.out.println("n paises bombo 4: " + this.bombo4.size());
	}
}