package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

class TrabajadorTest {
    Trabajador trabajador;
    
    void trabajadorTieneIngresosPorMilCientoOchentaPesos(){
        Ingreso ingresoDeQuinientosPesos1 = new Ingreso(1, "Sueldo", 500d);
        Ingreso ingresoDeQuinientosPesos2 = new Ingreso(2, "Sueldo", 500d);
        Ingreso ingresoPorHorasExtrasPesos1 = new HorasExtras(1, "HorasExtras", 100d, 30);
        Ingreso ingresoPorHorasExtrasPesos2 = new HorasExtras(2, "HorasExtras", 80d, 20);
        trabajador.agregarIngreso(ingresoDeQuinientosPesos1);
        trabajador.agregarIngreso(ingresoDeQuinientosPesos2);
        trabajador.agregarIngreso(ingresoPorHorasExtrasPesos1);
        trabajador.agregarIngreso(ingresoPorHorasExtrasPesos2);
    }

    @BeforeEach
    void setUp(){
        trabajador = new Trabajador();
    }

    @Test
    void hayUnTrabajadorConCeroPercibido(){
        assertEquals(0d, trabajador.getTotalPercibido());
    }

    @Test
    void hayUnTrabajadorConMilcientoochentaPesosPercibidos(){
        this.trabajadorTieneIngresosPorMilCientoOchentaPesos();

        assertEquals(1180d, trabajador.getTotalPercibido());
    }

    @Test
    void elMontoImponibleDelTrabajadorEsDeMilPesos(){
        this.trabajadorTieneIngresosPorMilCientoOchentaPesos();
        assertEquals(1000d, trabajador.getMontoImponible());
    }

    @Test
    void elImpuestoDelTrabajadorEsDeVeintePesos(){
        this.trabajadorTieneIngresosPorMilCientoOchentaPesos();
        assertEquals(20d, trabajador.getImpuestoAPagar());
    }
}
