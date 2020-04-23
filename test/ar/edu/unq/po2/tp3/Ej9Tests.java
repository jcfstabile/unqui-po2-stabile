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

class Ej9Tests {

    Persona pedro;
    Persona juan ;
    Persona maria;
    Persona marta;
    Persona marla;
    EquipoDeTrabajo equipo;

    @BeforeEach
    void setUp(){
        pedro = new Persona("Pedro", LocalDate.of(1970,1,1));
        juan  = new Persona("Juan", LocalDate.of(1980,1,1));
        maria = new Persona("Maria", LocalDate.of(1990,1,1));
        marta = new Persona("Marta", LocalDate.of(1985,1,1));
        marla = new Persona("Marla", LocalDate.of(1995,1,1));
        equipo = new EquipoDeTrabajo("Objetosos");
        equipo.add(pedro);
        equipo.add(juan );
        equipo.add(maria);
        equipo.add(marta);
        equipo.add(marla);
    }

    @DisplayName("Un Equipo de trabajo tiene nombre")
    @Test
    void testEquipoTieneNombre(){
        assertEquals("Objetosos", equipo.getNombre());
    }

    @DisplayName("Un Equipo de trabajo tiene un promedio de edad")
    @Test
    void testPromedioDeEdadDePersonalEnElEquipoDeTrabajo(){
        assertEquals(36, equipo.promedioDeEdad());
    }
}
