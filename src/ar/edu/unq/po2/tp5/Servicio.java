package ar.edu.unq.po2.tp5;

class Servicio extends Factura{

    private Double valorUnitario;
    private Integer cantidad;

    Servicio(Agencia recaudadora, Double valorUnitario, Integer cantidad){
        super(recaudadora);
        this.setValorUnitario(valorUnitario);
        this.setCantidad(cantidad);
    }

    private void setValorUnitario(Double valorUnitario){
        this.valorUnitario = valorUnitario;
    }

    private void setCantidad(Integer cantidad){
        this.cantidad = cantidad;
    }

    private Double getValorUnitario(){
        return this.valorUnitario;
    }

    private Integer getCantidad(){
        return this.cantidad;
    }

    public Double montoAPagar(){
        return this.getCantidad() * this.getValorUnitario();
    }
}

