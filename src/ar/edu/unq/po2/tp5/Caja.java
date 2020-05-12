package ar.edu.unq.po2.tp5;

public class Caja
{
    private Stock stock;
    private Double montoTotal;

    public Caja(Stock stock)
    {
        this.setStock(stock);
        this.setMontoTotal(0d);
    }

    private Stock getStock(){
        return this.stock;
    }
    
    private void setStock(Stock stock){
        this.stock = stock;
    }

    public void registrar(Producto producto){
        this.setMontoTotal(this.getMontoTotal() + producto.precioFinal());
        this.getStock().decrementarExistenciaDe(producto);
    }

    private Double getMontoTotal(){
        return this.montoTotal;
    }

    private void setMontoTotal(Double monto){
        this.montoTotal = monto;
    }

    public Double montoTotal()
    {
        return this.getMontoTotal();
    }
}

