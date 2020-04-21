package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

class Ej2Tests {

    String a = "abc";
    String s = a;
    String t;
    @BeforeEach
    void setUp(){
    }

    @DisplayName(" a.substring(1,3).equals(\"bc\") is True ")
    @Test
    void testSubstringEqualEqualss(){
        assertTrue( a.substring(1,3).equals("bc") );
    }

    @DisplayName(" s == a is True")
    @Test
    void testSisEqualtoA(){
        assertTrue( s == a );
    }

    @DisplayName("(a.length() + a).startsWith(\"a\") es False")
    @Test
    void teststartWith(){
        assertFalse( (a.length() + a).startsWith("a") );
    }

    @DisplayName("\"Quilmes\".substring(2,4); es \"il\"")
    @Test
    void testSubstring(){
        assertEquals("il", "Quilmes".substring(2,4));
    }

    @DisplayName("\"Universidad\".lastIndexOf('i'); es 7")
    @Test
    void testLastIndex(){
        assertEquals(7, "Universidad".lastIndexOf('i'));
    }

    @DisplayName("\"Libertad\".indexOf(\"r\"); es 4")
    @Test
    void testIndexRDeLibertad(){
        assertEquals(4, "Libertad".indexOf("r"));
    }
        // a.toUpperCase();
    @DisplayName("a.toUpperCase() es \"Abc\" con a = \"abc\"")
    @Test
    void testUpperCase(){
        assertEquals("abc" , a);
        a.toUpperCase();
        assertEquals("abc" , a);
        assertEquals("ABC" , a.toUpperCase());
    }

    @DisplayName("1 + a (String var with \"abc\") = 1abc")
    @Test
    void testNumeroMasStringVar(){
        assertEquals("1abc" , 1 + a);
    }

    @DisplayName("testeando que s.length() sea 3")
    @Test
    void elLargoDe_s_EsTres(){
        assertEquals(3, s.length());
    }

    @DisplayName("test de var no inicializada")
    @Test
    void tNoEstaInicializada(){
        Exception exception = assertThrows(RuntimeException.class, () -> { 
            t.length();
        } );
        assertEquals(null, exception.getMessage());
    }
}

class Ej3Tests{

}
