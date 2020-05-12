package ar.edu.unq.po2.tp5;


public class DeCooperativa extends Producto

{
    private Double descuento = 10d/100d;

    DeCooperativa(Double precio){
        super(precio);
    }

    public Double precioFinal()
    {
        return this.precioConDescuento();
    }

    private Double precioConDescuento(){
        return this.getPrecio() * ( 1d - this.getDescuento());
    }

    private Double getDescuento(){
        return this.descuento;
    }
}

