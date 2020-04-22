package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.time.LocalDate;

class Ej8Tests {

    Persona pedro = new Persona("Pedro", LocalDate.of(1970,1,1));
    Persona juan  = new Persona("Juan", LocalDate.of(1980,1,1));
    Persona maria = new Persona("Maria", LocalDate.of(1990,1,1));

    @BeforeEach
    void setUp(){
    }

    @DisplayName("Una persona tiene 40 años")
    @Test
    void testJuanTiene40Años(){
        assertEquals(40, juan.edad());
    }

    @DisplayName(" Juan es menor que Pedro y mayor que Maria")
    @Test
    void testJuanEsMenorQuePedro(){
        assertTrue( juan.menorQue(pedro) );
        assertFalse( juan.menorQue(maria) );
    }
}
