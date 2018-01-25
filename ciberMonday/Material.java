public class Material {

    private String nombreMaterial;
    private Double costo;

    public Material(String tipo, Double costo) {
        this.nombreMaterial = tipo;
        this.costo = costo;
        //el costo deberia ser una variable de clase de cada tipo de material
    }

    public Double getCostoMaterial() {
        return costo;
    }

    public void setCostoMaterial(Double costo) {
        this.costo = costo;
    }
}
