package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

class Supermercado{
    private String nombre;
    private String direccion;
    private ArrayList<Producto> productos;

    Supermercado(String nombre, String direccion){
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setProductos();
    }

    void agregarProducto(Producto producto){ this.getProductos().add(producto); }

    ArrayList<Producto> getProductos() { return productos; }

    Double getPrecioTotal() { return this.getProductos().stream().mapToDouble(Producto::getPrecio).sum(); }

    Integer getCantidadDeProductos() { return productos.size(); }

    void setProductos() { this.productos = new ArrayList<Producto>(); }

    void setNombre(String nombre) { this.nombre = nombre; }
    
    String getNombre() { return this.nombre; }

    void setDireccion(String direccion) { this.direccion = direccion; }
    
    String getDireccion() { return this.direccion; }
}
