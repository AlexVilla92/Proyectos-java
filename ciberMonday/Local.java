import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Local {

    private String nombreLocal;
    private Map<String, List<Venta>> ventas;//refactoring usar JodaTime en lugar de string
    private Map<Integer, Producto> productosDelLocal;

    public Local(String unNombre) {
        this.nombreLocal = unNombre;
        this.ventas = new HashMap<String, List<Venta>>();
        this.productosDelLocal = new HashMap<Integer, Producto>();
    }

    public void agregarVenta(String unaFecha, Venta unaVenta) {
        if (this.ventas.containsKey(unaFecha)) {
            List<Venta> unaListaVenta = this.ventas.get(unaFecha);
            unaListaVenta.add(unaVenta);
        } else {
            List<Venta> listaVenta = new ArrayList<Venta>();
            listaVenta.add(unaVenta);
            this.ventas.put(unaFecha, listaVenta);
        }
    }

    public Double calcularPrecio(Integer unCodigo) {

        return 0.0;
    }

    public Integer cantVentasEnPromocion() {
        Integer cantidadVentas = 0;

        for (Map.Entry<String, List<Venta>> entry : this.ventas.entrySet()) {
            List<Venta> unaListaVenta = entry.getValue();
            cantidadVentas += this.huboPromocionEnVenta(unaListaVenta);
        }

        return cantidadVentas;
    }

    private Integer huboPromocionEnVenta(List<Venta> listaVenta) {
        Integer cantidadVentas = 0;

        for(Venta unaVenta : listaVenta) {
            if (unaVenta.tieneProductoEnPromocion()) cantidadVentas++;
        }

        return cantidadVentas;
    }

    public Integer ventasPorFecha(String unaFecha) {
        if (this.ventas.containsKey(unaFecha)) {
            List<Venta> listaVenta = this.ventas.get(unaFecha);
            return listaVenta.size();
        } else { //excepcion
            System.out.println("no hubo ventas en esa fecha");
            return 0;
        }
    }

    public Double ahorroPorFecha(String unaFecha) {
        if (this.ventas.containsKey(unaFecha)) {
            List<Venta> listaVenta = this.ventas.get(unaFecha);
            return this.ahorroPorVentas(listaVenta);
        } else { //excepcion
            System.out.println("no se registro venta en esa fecha");
            return 0.0;
        }
    }

    private Double ahorroPorVentas(List<Venta> listaVenta) {
        Double ahorro = 0.0;

        for (Venta unaVenta: listaVenta) {
            ahorro = ahorro + unaVenta.ahorroDeVenta();
        }

        return ahorro;
    }
}
