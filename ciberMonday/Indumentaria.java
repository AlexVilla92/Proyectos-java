public class Indumentaria extends Producto{

    private Integer talle;
    private Double factorConversion;

    public Indumentaria(Integer codigo, String nombre, Integer unTalle, Double factor) {
        super(codigo, nombre);
        this.talle = unTalle;
        this.factorConversion = factor;
    }

    @Override
    public Double calcularPrecio() {
        Double costo = this.getTalle() * this.getFactorConversion();
        Double miDescuento = super.unaPromo.aplicarDescuento(costo);

        return (costo - miDescuento);
    }

    public Integer getTalle() {
        return talle;
    }

    public void setTalle(Integer talle) {
        this.talle = talle;
    }

    public Double getFactorConversion() {
        return factorConversion;
    }

    public void setFactorConversion(Double factorConversion) {
        this.factorConversion = factorConversion;
    }
}
