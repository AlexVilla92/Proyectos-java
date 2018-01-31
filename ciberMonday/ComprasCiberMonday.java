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

        caballito.agregarVenta("23/20/2017", unaVenta);

        //punto 1
        System.out.println("precio de la heladera es: " + unaVenta.calcularPrecio(heladera) + " pesos");
        System.out.println("precio de la remera es: " + unaVenta.calcularPrecio(remera) + " pesos");
        System.out.println("precio de la silla es: " + unaVenta.calcularPrecio(silla) + " pesos");

        //punto 2
        System.out.println("el precio total de la venta es: " + unaVenta.calcularPrecioVenta() + " pesos");

        //punto 3
        System.out.println("cantidad de ventas con productos en promocion: " + caballito.cantVentasEnPromocion() + " productos");

        //punto 4a
        System.out.println("cantidad de ventas para el dia 23/20/2017: " + caballito.ventasPorFecha("23/20/2017") + " productos");
        System.out.println("cantidad de ventas para el dia 24/20/2017: " + caballito.ventasPorFecha("24/20/2017") + " productos");

        //punto 4b
        System.out.println("dinero ahorrado en local caballito en fecha 23/20/2017: " + caballito.ahorroPorFecha("23/20/2017"));
    
        //punto 5a
        Shopping unShopping = new Shopping();
        unShopping.agregarLocal(caballito);
        System.out.println("cantidad de ventas para el barrio de caballito " + unShopping.cantidadDeVentasPorLugar("caballito"));
        
        //punto 5b
        System.out.println("dinero movido por el shopping " + unShopping.dineroMovido());
        
        //punto 6
        Empresa cymeco = new Empresa();

    }


}
