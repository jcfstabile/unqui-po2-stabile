package ar.edu.unq.po2.tp4;

class ProductoPrimeraNecesidad extends Producto{

    ProductoPrimeraNecesidad(String nombre, Double precio, Boolean precioCuidado){
        super(nombre, precio, precioCuidado);
    }

    @Override
    Double getPrecio() { return super.getPrecio() * 0.9d; }

}
