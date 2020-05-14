package ar.edu.unq.po2.tp5;

class EmpresaDeCobro implements Agencia{
    public Double recaudacion;

    EmpresaDeCobro(){
        super();
        this.recaudacion = 0d;
    }

    public void registrarPago(Factura factura){
        this.recaudacion += factura.montoAPagar();
    }

    private void setRecaudacion(Double recaudacion){
        this.recaudacion = recaudacion;
    }

    public Double getRecaudacion(){
        return this.recaudacion;
    }
}

