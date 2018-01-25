import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class Venta {

    //private List<Producto> productos;
    //private DateTime fechaDeVenta;
    private String lugar;
    private Map<Integer, Producto> productos;

    public Venta(String lugar) {
        this.productos = new HashMap<Integer, Producto>();
        //this.fecha = new DateTime();
        this.lugar = lugar;
    }

    public Double calcularVenta() {
        return 0.00;
    }

    public void agregarProducto(Producto unProducto) {
        this.productos.put(unProducto.getCodigo(), unProducto);
    }

    public Double calcularPrecio(Producto unProducto) {
        return unProducto.calcularPrecio();
    }

    public Double calcularPrecioVenta() {
        Double precioVenta = 0.0;

        for (Map.Entry<Integer, Producto> entry : this.productos.entrySet()) {
             precioVenta += this.calcularPrecio(entry.getValue());
        }

        return precioVenta;
    }

    public boolean tieneProductoEnPromocion() {
        for (Map.Entry<Integer, Producto> entry : this.productos.entrySet()) {
            Producto unProducto = entry.getValue();
            if (unProducto.tienePromocion()) return true;
        }

        return false;
    }

    public Double ahorroDeVenta() {
        Double descuentos = 0.0;
        
        for (Map.Entry<Integer, Producto> entry : this.productos.entrySet()) {
            Producto unProducto = entry.getValue();
            descuentos = descuentos + unProducto.getDescuento();
        }

        return descuentos; 
    }
}
