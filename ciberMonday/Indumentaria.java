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
        super.precio = this.getTalle() * this.getFactorConversion();
        super.descuento = super.unaPromo.aplicarDescuento(super.precio);

        return (super.precio - super.descuento);
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
