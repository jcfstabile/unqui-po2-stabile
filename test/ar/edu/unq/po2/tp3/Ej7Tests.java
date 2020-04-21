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

    Rectangulo rectangulo;
    Rectangulo rectanguloVertical;

    @BeforeEach
    void setUp(){
        rectanguloVertical = new Rectangulo(0.0f, 0.0f, 5.0f, 2.0f);
        rectangulo = new Rectangulo(0.0f, 0.0f, 2.0f, 5.0f);
    }

    @DisplayName(" Hay un Rectangulo con area 10")
    @Test
    void testRectanguloArea(){
        assertEquals(10, rectangulo.area());
    }
    @DisplayName(" Hay un rectangulo con perimetro 14")
    @Test
    void testRectanguloPerimetro(){
        assertEquals(14, rectangulo.perimetro());
    }
    @DisplayName(" Hay un rectangulo horizontal")
    @Test
    void testRectanguloHorizontal(){
        assertTrue(rectangulo.esHorizontal());
    }
    @DisplayName(" Hay un rectangulo vertical")
    @Test
    void testRectanguloVertical(){
        assertTrue(rectanguloVertical.esVertical());
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

