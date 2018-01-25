public class Promocion implements TipoPromocion {

    private Integer porcentajeDescuento;
    static final Double conversorDescuento = 0.01;

    public Promocion(Integer valorDescuento) {
        this.porcentajeDescuento = valorDescuento;
    }

    @Override
    public Double aplicarDescuento(Double unPrecio) {
        Double porcentaje = porcentajeDescuento * conversorDescuento;
        return (unPrecio * porcentaje);
    }

    public Integer getPorcentajeDescuento() {
        return this.porcentajeDescuento;
    }

    public void setPorcentajeDescuento(Integer valorDescuento) {
        this.porcentajeDescuento = valorDescuento;
    }
}
