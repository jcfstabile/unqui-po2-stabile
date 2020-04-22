package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

class Ej7Tests {

    Rectangulo rectangulo2x5;
    Rectangulo rectangulo7x3;

    @BeforeEach
    void setUp(){
        rectangulo2x5 = new Rectangulo(0.0f, 0.0f, 2.0f, 5.0f);
        rectangulo7x3 = new Rectangulo(1.0f, 2.0f, 7.0f, 3.0f);
    }

    @DisplayName(" Hay un Rectangulo con area 10 y otro de area 21")
    @Test
    void testRectanguloArea(){
        assertEquals(10, rectangulo2x5.area());
        assertEquals(21, rectangulo7x3.area());
    }
    @DisplayName(" Hay un rectangulo con perimetro 14 y otro de 20")
    @Test
    void testRectanguloPerimetro(){
        assertEquals(14, rectangulo2x5.perimetro());
        assertEquals(20, rectangulo7x3.perimetro());
    }
    @DisplayName(" Hay un rectangulo horizontal y otro no")
    @Test
    void testRectanguloHorizontal(){
        assertTrue(rectangulo2x5.esHorizontal());
        assertFalse(rectangulo7x3.esHorizontal());
    }
    @DisplayName(" Hay un rectangulo vertical y otro no")
    @Test
    void testRectanguloVertical(){
        assertFalse(rectangulo2x5.esVertical());
        assertTrue(rectangulo7x3.esVertical());
    }
    @DisplayName(" Hay un cuadrado de area 25 perimerto 20 y que no es rectangulo ni horizontal ni vertical")
    @Test
    void testCuadrado(){
        Cuadrado cuadrado = new Cuadrado(0.0f, 0.0f, 5.0f);
        assertEquals(25, cuadrado.area());
        assertEquals(20, cuadrado.perimetro());
        assertFalse(cuadrado.esHorizontal());
        assertFalse(cuadrado.esVertical());
    }
}

