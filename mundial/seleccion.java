class Seleccion {
	private String name;
	private int ranking;
	private int bombo;
	private int confederation;

	public Seleccion(int bombo, String name, int conf, int ranking) {
		this.name = name;
		this.ranking = ranking;
		this.bombo = bombo;
		this.confederation = conf;
	}

	public int getNumberBombo() {
		return this.bombo;
	}
}