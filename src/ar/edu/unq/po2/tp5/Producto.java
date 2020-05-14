package ar.edu.unq.po2.tp5;


public abstract class Producto implements Cobrable
{
    private Double precio;
    private Stock stock;

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
    
    public abstract Double montoAPagar();

    public void registrarPago(){
        this.getStock().decrementarExistenciaDe(this);
    }
    
    public void asociarStock(Stock stock){
        this.setStock(stock);
    }

    private void setStock(Stock stock){
        this.stock = stock;
    }

    private Stock getStock(){
        return this.stock;
    }
}
