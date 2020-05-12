package ar.edu.unq.po2.tp4;

class Impuesto{
    final Double alicuota = 2d/100d;

    Double aPagarSobre(Double monto){
        return monto * this.getAlicuota();
    }

    private Double getAlicuota(){
        return this.alicuota;
    }
}
