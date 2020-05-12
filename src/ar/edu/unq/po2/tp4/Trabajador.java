package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

class Trabajador{
    private ArrayList<Ingreso> ingresos;

    Trabajador(){
        ingresos = new ArrayList<Ingreso>();
    }

    void agregarIngreso(Ingreso ingreso){
        this.ingresos.add(ingreso);
    }

    Double getTotalPercibido(){
        return ingresos.stream().mapToDouble(Ingreso::getMonto).sum();
    }

    Double getMontoImponible(){
        return ingresos.stream().mapToDouble(Ingreso::montoImponible).sum();
    }

    Double getImpuestoAPagar(){ 
        return ingresos.stream().mapToDouble(Ingreso::impuesto).sum();
    }

}
