package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class ProductoTest{
    @Test
    void hayUnProductoTradicionalConPrecioDoceYPrecioFinalDoce(){
        Producto pera = new Tradicional(12d);
        assertEquals(12.0d, pera.getPrecio());
        assertEquals(12.0d, pera.montoAPagar());
    }

    @Test
    void hayUnProductoDeCooperativaConPrecioCatorceYPrecioFinalDoceSesenta(){
        Producto scon = new DeCooperativa(14d);
        assertEquals(14d, scon.getPrecio());
        assertEquals(12.6d, scon.montoAPagar());
    }
}
