public class Electronica extends Producto {

    static final Integer constanteElectronica = 1000;
    private static final Double constanteConversion = 30.00;

    public Electronica(Integer codigo, String nombre) {
        super(codigo, nombre);
    }

    @Override
    public Double calcularPrecio() {
        Double costo = constanteConversion * constanteElectronica;
        Double miDescuento = super.unaPromo.aplicarDescuento(costo);

        return (costo - miDescuento);
    }
}
