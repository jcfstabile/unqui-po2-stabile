package ar.edu.unq.po2.tp5;

public abstract class Factura implements Cobrable{
    private Agencia agencia; // de recaudación

    Factura(Agencia recaudadora){
        super();
        this.setAgencia(recaudadora);
    }

    public void registrarPago(){
        this.getAgencia().registrarPago(this);
    }

    private Agencia getAgencia(){
        return this.agencia;
    }

    private void setAgencia(Agencia agencia){
        this.agencia = agencia;
    }
}
