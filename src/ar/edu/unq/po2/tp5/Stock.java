package ar.edu.unq.po2.tp5;

import java.util.HashMap;
import java.util.Map;

public class Stock
{
    private Map<Producto, Integer> productos;

    Stock(){
        productos = new HashMap<>();
    }

    protected Map<Producto, Integer> getProductos() {
        return this.productos;
    }

    public void agregarProducto(Producto producto, Integer cantidad){
        this.productos.put(producto, cantidad);
        producto.asociarStock(this);
    }

    public void decrementarExistenciaDe ( Producto producto )
    {
        this.getProductos().replace(producto, this.getProductos().get(producto) - 1);
    }
}

