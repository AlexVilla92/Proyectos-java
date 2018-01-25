public abstract class Producto {

    private Integer codigo;
    protected Double precio;
    protected Double descuento;
    private String nombre;
    private boolean estaEnPromocion;
    protected TipoPromocion unaPromo;

    public Producto(Integer codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estaEnPromocion = false;
        this.precio = 0.0;
        this.descuento = 0.0;
        this.unaPromo = new Normal();//poner singleton
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

    public Double getDescuento() {
        return this.descuento;
    }

    public boolean tienePromocion() {
        return estaEnPromocion;
    }

    public void ponerEnPromocion(Integer unPorcentaje) {
        if (unPorcentaje > 0 && unPorcentaje <= 70) {
            this.estaEnPromocion = true;
            this.unaPromo = new Promocion(unPorcentaje);//ponere singleton
        } else  {//poner excepcion
            System.out.println("porcentaje de descuento invalido");
        }
    }

    public void sacarPromocion() {
        this.estaEnPromocion = false;
        this.unaPromo = new Normal();//ponere singleton
    }
}
