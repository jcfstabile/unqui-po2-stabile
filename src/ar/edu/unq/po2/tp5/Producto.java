package ar.edu.unq.po2.tp5;



public abstract class Producto
{
    private Double precio;

    Producto(Double precio){
        super();
        this.setPrecio(precio);
    }

    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(Double precio){
        this.precio = precio;
    }
    
    public abstract Double precioFinal();
}
