package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class CounterTest{
    private Counter counter;

    @BeforeEach
    void setUp() throws Exception {
        counter = new Counter();

        counter.addNumber(1);
        counter.addNumber(3);
        counter.addNumber(5);
        counter.addNumber(7);
        counter.addNumber(9);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(4);
    }

    @Test
    void testEvenNumbers() {
        assertEquals(1, counter.getEvenOcurrences());
    }
    @Test
    void testOddNumbers() {
        assertEquals(9, counter.getOddOcurrences());
    }
    @Test
    void thereAreTenNumbers(){
        assertEquals(10, counter.getCount());
    }
}
