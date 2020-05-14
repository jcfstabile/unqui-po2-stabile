package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.HashMap;
import java.util.Map;

class StockTest{
    class EStock extends Stock{
        public Map<Producto, Integer> productos(){
            return this.getProductos();
        }
    }

    @Test
    void hayUnStock(){
        Stock stock = new Stock();
        assertEquals(stock.getClass(), (new Stock()).getClass());
    }

    @Test
    void hayUnProductoConEntradaEnElStock(){
        EStock stock = new EStock();
        Producto manzana = new Tradicional(10d);

        assertEquals(0, stock.productos().size() );
        stock.agregarProducto(manzana, 0);
        assertEquals(1, stock.productos().size() );
    }

    @Test
    void hayUnProductoConEntradaEnElStockAlQueLeDecrementoElStock(){
        EStock stock = new EStock();
        Producto manzana = new Tradicional(10d);

        stock.agregarProducto(manzana, 1);
        assertEquals(1, stock.productos().get(manzana));
        stock.decrementarExistenciaDe(manzana);
        assertEquals(0, stock.productos().get(manzana));
    }

    @Test
    void hayDosProductosConEntradasElStockAlQueLeDecrementoElStock(){
        EStock stock = new EStock();
        Producto manzana = new Tradicional(10d);
        Producto yerba   = new DeCooperativa(32d);

        stock.agregarProducto(manzana, 1);
        stock.agregarProducto(yerba, 2);
        assertEquals(1, stock.productos().get(manzana));
        assertEquals(2, stock.productos().get(yerba));
        stock.decrementarExistenciaDe(manzana);
        stock.decrementarExistenciaDe(yerba);
        stock.decrementarExistenciaDe(yerba);
        assertEquals(0, stock.productos().get(manzana));
        assertEquals(0, stock.productos().get(yerba));
    }

}
