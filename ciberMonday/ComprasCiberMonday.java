import javax.swing.plaf.synth.SynthScrollBarUI;

public class ComprasCiberMonday {

    public static void main(String[] args) {

        Local caballito = new Local("caballito");
        //hacer que la madera sea singleton
        Material madera = new Madera("madera", 10.00);
        Producto heladera = new Electronica(1213, "heladera whirlpool");
        Producto remera = new Indumentaria(243, "remera nike", 45, 8.70);
        Producto silla = new Decoracion(4546, "silla de madera", 4.00, 1.00, 2.00, madera);
        Venta unaVenta = new Venta("caballito");

        remera.ponerEnPromocion(20);
        heladera.ponerEnPromocion(30);

        unaVenta.agregarProducto(remera);
        unaVenta.agregarProducto(heladera);
        unaVenta.agregarProducto(silla);


        System.out.println("precio de la heladera es: " + unaVenta.calcularPrecio(heladera) + " pesos");
        System.out.println("precio de la remera es: " + unaVenta.calcularPrecio(remera) + " pesos");
        System.out.println("precio de la silla es: " + unaVenta.calcularPrecio(silla) + " pesos");

        System.out.println("el precio total de la venta es: " + unaVenta.calcularPrecioVenta() + " pesos");

        System.out.println("cantidad de ventas con productos en promocion: " + unaVenta.cantidadVentasPromocion() + " productos");

    }


}
