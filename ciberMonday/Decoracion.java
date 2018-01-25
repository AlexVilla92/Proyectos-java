import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Decoracion extends Producto {

    private Double peso;
    private Double ancho;
    private Double alto;
    private Set<Material> materiales;

    public Decoracion(Integer codigo, String nombre, Double peso, Double ancho, Double alto, Material unMaterial) {
        super(codigo, nombre);
        this.peso = peso;
        this.ancho = ancho;
        this.alto = alto;
        //hacer logica para deducir el material del cual es el producto
        this.materiales = new HashSet<Material>();
        this.materiales.add(unMaterial);
    }

    public void agregarMaterial(Material unMaterial) {
        this.materiales.add(unMaterial);
    }

    @Override
    public Double calcularPrecio() {
        super.precio = (this.getAlto() * this.getAncho() * this.getPeso()) + this.getPrecioMateriales();
        super.descuento = super.unaPromo.aplicarDescuento(super.precio);

        return (super.precio - super.descuento);
    }

    private Double getPrecioMateriales() {
        Double precioMateriales = 0.00;

        Iterator<Material> iterator = this.materiales.iterator();
        while(iterator.hasNext()) {
            Material unMaterial = iterator.next();
            precioMateriales += unMaterial.getCostoMaterial();
        }

        return precioMateriales;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }
}
