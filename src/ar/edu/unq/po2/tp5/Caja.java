package ar.edu.unq.po2.tp5;

public class Caja
{
    private Double montoTotal;

    public Caja()
    {
        this.setMontoTotal(0d);
    }

    public void registrar(Cobrable cobrable){
        this.setMontoTotal(this.getMontoTotal() + cobrable.montoAPagar());
        cobrable.registrarPago();
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

