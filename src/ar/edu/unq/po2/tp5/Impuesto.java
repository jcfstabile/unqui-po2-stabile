package ar.edu.unq.po2.tp5;

class Impuesto extends Factura{

    private Double tasa;

    Impuesto(Agencia recaudadora, Double tasa){
        super(recaudadora);
        this.setTasa(tasa);
    }

    private void setTasa(Double tasa){
        this.tasa = tasa;
    }

    private Double getTasa(){
        return this.tasa;
    }

    public Double montoAPagar(){
        return this.getTasa();
    }
}
