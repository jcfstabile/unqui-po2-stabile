package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class StockTest{
    @Test
    void hayUnStock(){
        Stock stock = new Stock();
        assertEquals(stock.getClass(), (new Stock()).getClass());
    }

    @Test
    void hayUnProductoConEntradaEnElStock(){
        Stock stock = new Stock();
        Producto manzana = new Tradicional(10d);

        assertEquals(0, stock.getProductos().size() );
        stock.agregarProducto(manzana, 0);
        assertEquals(1, stock.getProductos().size() );
    }

    @Test
    void hayUnProductoConEntradaEnElStockAlQueLeDecrementoElStock(){
        Stock stock = new Stock();
        Producto manzana = new Tradicional(10d);

        stock.agregarProducto(manzana, 1);
        assertEquals(1, stock.getProductos().get(manzana));
        stock.decrementarExistenciaDe(manzana);
        assertEquals(0, stock.getProductos().get(manzana));
    }

    void hayDosProductosConEntradasElStockAlQueLeDecrementoElStock(){
        Stock stock = new Stock();
        Producto manzana = new Tradicional(10d);
        Producto yerba   = new DeCooperativa(32d);

        stock.agregarProducto(manzana, 1);
        stock.agregarProducto(yerba, 2);
        assertEquals(1, stock.getProductos().get(manzana));
        assertEquals(2, stock.getProductos().get(yerba));
        stock.decrementarExistenciaDe(manzana);
        stock.decrementarExistenciaDe(yerba);
        stock.decrementarExistenciaDe(yerba);
        assertEquals(0, stock.getProductos().get(manzana));
        assertEquals(0, stock.getProductos().get(yerba));
    }

}
