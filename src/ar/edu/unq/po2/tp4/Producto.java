package ar.edu.unq.po2.tp4;

class Producto{
    private String nombre;
    private Double precio;
    private Boolean precioCuidado = false;

    Producto(String nombre, Double precio){
        this.setNombre(nombre);
        this.setPrecio(precio);
    }

    Producto(String nombre, Double precio, Boolean precioCuidado){
        this(nombre, precio);
        this.setPrecioCuidado(precioCuidado);
    }

    private void setNombre(String nombre) { this.nombre = nombre; }
    
    String getNombre() { return this.nombre; }

    void setPrecio(Double precio) { this.precio = precio; }

    Double getPrecio() { return this.precio; }

    void setPrecioCuidado(Boolean precioCuidado) { this.precioCuidado = precioCuidado; } 

    Boolean esPrecioCuidado() { return this.precioCuidado; }

    void aumentarPrecio(Double aumento) { this.setPrecio(this.getPrecio() + aumento ); }
}
