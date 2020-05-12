package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class ImpuestoTest {
    @Test
    void testImpuestoSobreIngresoDer300Pesos(){
        Impuesto impuesto = new Impuesto();

        assertEquals(6.0d, impuesto.aPagarSobre(300d));
    }
}
