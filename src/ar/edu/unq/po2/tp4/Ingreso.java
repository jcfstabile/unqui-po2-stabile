package ar.edu.unq.po2.tp4;

class Ingreso{
    private Integer mes;
    private String concepto;
    private Double monto;
    private Impuesto impuesto;

    Ingreso(Integer mes, String concepto, Double monto){
        this.mes = mes;
        this.concepto = concepto;
        this.monto = monto;
        this.impuesto = new Impuesto();
    }

    Double montoImponible() { return this.getMonto(); }

    Double getMonto() { return this.monto; }

    Double impuesto() { return this.impuesto.aPagarSobre(this.montoImponible());
    }

}

class HorasExtras extends Ingreso{
    private Integer cantidad;

    HorasExtras(Integer mes, String concepto, Double monto, Integer cantidad){
        super(mes, concepto, monto);
        this.cantidad = cantidad;
    }

    @Override 
    Double montoImponible() { return 0d; }
}

