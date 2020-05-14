package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;

class ColeccionadorDeObjetos{

    public Object getFirstFrom(List collection){
        return collection.get(0);
    }

    public void addLast (Object element, List collection){
        collection.add(element);
    }
    
    public Collection getSubCollection(List collection, int from, int to){
        return collection.subList(from, to);
    }

    public Boolean containsElement(List collection, Object element){
        return collection.contains(element);
    }
}

class ColeccionadorDeObjetosTest{
    ColeccionadorDeObjetos co;
    List sutL, sutA;

    @BeforeEach
    void setUp(){
        co = new ColeccionadorDeObjetos();
        sutA = new ArrayList<Integer>();
        sutL = new LinkedList<Integer>();
    }

    @Test
    void CrearColeccion(){
        assertNotNull(sutA, "No se creeo el objeto");
        assertNotNull(sutL, "No se creeo el objeto");
    }

    @Test
    void NoEstaElElemento(){
        assertFalse(co.containsElement(sutA, 42), "Que raro. ¿Quien lo metio ahi?");
        assertFalse(co.containsElement(sutL, 42), "Que raro. ¿Quien lo metio ahi?");
    }

    @Test
    void AgregarAlFinal(){
        co.addLast(42, sutA);
        assertTrue(co.containsElement(sutA, 42));

        co.addLast(42, sutL);
        assertTrue(co.containsElement(sutL, 42));
    }

    @Test
    void ElPrimeroDeLaColeccion(){
        co.addLast(42, sutA);
        co.addLast(17, sutA);
        co.addLast(7, sutA);
        assertEquals(42, co.getFirstFrom(sutA));

        co.addLast(42, sutL);
        co.addLast(17, sutL);
        co.addLast(7, sutL);
        assertEquals(42, co.getFirstFrom(sutL));
    }
}
