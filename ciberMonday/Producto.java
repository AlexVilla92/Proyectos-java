public abstract class Producto {

    private Integer codigo;
    private Double precio;
    private String nombre;
    private boolean estaEnPromocion;//sacar
    protected TipoPromocion unaPromo;

    public Producto(Integer codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estaEnPromocion = false;
        this.unaPromo = new Normal();
    }

    public abstract Double calcularPrecio();

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public boolean tienePromocion() {
        return estaEnPromocion;
    }

    public void ponerEnPromocion(Integer unPorcentaje) {
        if (unPorcentaje > 0 && unPorcentaje <= 70) {
            this.estaEnPromocion = true;
            this.unaPromo = new Promocion(unPorcentaje);
        } else  {//poner excepcion
            System.out.println("porcentaje de descuento invalido");
        }
    }
}
