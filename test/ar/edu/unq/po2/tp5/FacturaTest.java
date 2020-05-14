package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class FacturaTest{
    @Test
    void hayFacturaDeServicio(){
        Factura factura = new Servicio(null, 120d, 1);
        assertNotNull(factura);
        assertEquals(Servicio.class, factura.getClass());
    }
    @Test
    void hayFacturaDeInpuesto(){
        Factura factura = new Impuesto(null, 120d);
        assertNotNull(factura);
        assertEquals(Impuesto.class, factura.getClass());
    }
    @Test
    void hayFacturaDeServicioPorTreinticincoPesos(){
        Factura factura = new Servicio(null, 7d, 5);
        assertEquals(35.0d, factura.montoAPagar());
    }

    @Test
    void hayFacturaDeServicioPorSeisPesos(){
        Factura factura = new Servicio(null, 3d, 2);
        assertEquals(6.0d, factura.montoAPagar());
    }

    @Test
    void hayFacturaDeImpuestoConTasaDeCientoOncePesos(){
        Factura factura = new Impuesto(null, 112d);
        assertEquals(112.0d, factura.montoAPagar());
    }

    @Test
    void hayRecaudadorEnCero(){
        EmpresaDeCobro recaudador = new EmpresaDeCobro();
        assertNotNull(recaudador);
        assertEquals(0d, recaudador.getRecaudacion());
    }

    
    @Test
    void hayUnaSecuenciaDeRegistrosEnCajaYRegistrosEnUnaAgenciaRecaudadora(){
        EmpresaDeCobro recaudador = new EmpresaDeCobro();
        Stock stock = new Stock();
        Factura impuesto   = new Impuesto(recaudador, 112d);
        Factura servicio   = new Servicio(recaudador, 3d, 2);
        Producto scon      = new DeCooperativa(14d);
        Producto manzana   = new Tradicional(12.0d);
        Caja caja          = new Caja();

        assertEquals(0.0d, caja.montoTotal());
        caja.registrar(impuesto);

        assertEquals(112.0d, recaudador.getRecaudacion());
        caja.registrar(servicio);
        assertEquals(118.0d, recaudador.getRecaudacion());
        assertEquals(118.0d, caja.montoTotal());
        
        assertEquals(14d,    scon.getPrecio());
        assertEquals(12.6d, scon.montoAPagar());

        stock.agregarProducto(manzana, 2);
        stock.agregarProducto(scon, 2);
        caja.registrar(manzana);
        caja.registrar(manzana);
        caja.registrar(scon);
        
        assertEquals(118.0d, recaudador.getRecaudacion());
        assertEquals(118.0d + 24.0d + 12.6d, caja.montoTotal());
    }
}

