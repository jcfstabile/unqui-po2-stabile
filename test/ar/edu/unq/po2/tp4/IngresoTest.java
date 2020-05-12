package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

class IngresoTest {

    Ingreso ingreso;
    Ingreso horasExtras;

    @BeforeEach
    void setUp(){
        ingreso = new Ingreso(1, "Sueldo", 199.0d);
        horasExtras = new HorasExtras(1, "Sueldo", 1.0d, 2);
    }

    @DisplayName("Un Ingreso normal de 199 tiene un monto imponible de 199")
    @Test
    void testMontoImponible(){
        assertEquals(199.0d, ingreso.getMonto());
        assertEquals(199.0d, ingreso.montoImponible());
    }

    @DisplayName("Un Ingreso por horas extras de 1.0d tiene un monto imponible de 0.0d")
    @Test
    void testMontoImponibleSobreHorasExtras(){
        assertEquals(1d, horasExtras.getMonto());
        assertEquals(.0d, horasExtras.montoImponible());
    }
}
