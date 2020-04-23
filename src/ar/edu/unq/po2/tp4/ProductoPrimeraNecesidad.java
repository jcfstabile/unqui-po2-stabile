package ar.edu.unq.po2.tp4;

class ProductoPrimeraNecesidad extends Producto{

    private Double descuento;

    ProductoPrimeraNecesidad(String nombre, Double precio, Boolean precioCuidado, Double descuento){
        super(nombre, precio, precioCuidado);
        this.setDescuento(descuento);
    }

    void setDescuento(Double descuento){
        this.descuento = 1d - (descuento / 100d);
    }

    Double getDescuento(){
        return this.descuento;
    }

    @Override
    Double getPrecio() { return super.getPrecio() * this.getDescuento(); }

}
