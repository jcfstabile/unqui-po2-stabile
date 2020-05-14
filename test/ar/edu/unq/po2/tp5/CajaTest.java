package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class CajaTest{

    @Test
    void hayUnaCajaEnCero(){
        Stock stock = new Stock();
        Caja caja   = new Caja();

        assertEquals(0.0d, caja.montoTotal());
    }

    @Test
    void hayUnaCajaQueRegistraDosManzanasTradicionalesDeDocePesosYDaUnTotalDeVeinticuatroPesos(){
        Stock stock      = new Stock();
        Caja caja        = new Caja();
        Producto manzana = new Tradicional(12.0d);
        stock.agregarProducto(manzana,2);

        caja.registrar(manzana);
        caja.registrar(manzana);
        assertEquals(24.0d, caja.montoTotal());
    }

    @Test
    void hayUnaCajaQueRegistraTresManzanasTradicionalesYCincoAjosDeCooperativaSumaSesentaYUnPesos(){
        Stock stock      = new Stock();
        Caja caja        = new Caja();
        Producto manzana = new Tradicional(12.0d);
        Producto ajo     = new DeCooperativa(6.0d);
        stock.agregarProducto(manzana,3);
        stock.agregarProducto(ajo,5);

        for (int i = 0; i < 3; i++)     { caja.registrar(manzana); }
        for (int i = 0; i < 5; i++)     { caja.registrar(ajo); }
        assertEquals(63.0d, caja.montoTotal(), 0.01);
    }
    
}
