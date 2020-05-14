package ar.edu.unq.po2.tp5;


public class Tradicional extends Producto
{
    Tradicional(Double precio){
        super(precio);
    }

    public Double montoAPagar() {
        return this.getPrecio();
    }


}

