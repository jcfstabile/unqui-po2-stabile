package ar.edu.unq.po2.tp3;

import java.util.List;
import java.util.ArrayList;

class EquipoDeTrabajo{
    private String nombre;
    private ArrayList<Persona> personas;

    public EquipoDeTrabajo(String nombre){
        this.setNombre(nombre);
        this.setPersonas();
    }

//     public Tipo getAttr(){
//         return this.attr;
//     }
//     public void setAttr(Tipo valor){
//         this.attr = valor;
//     }
    private void setPersonas(){
        personas = new ArrayList<Persona>(); 
    }
     
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String valor){
        this.nombre = valor;
    }

    public void add(Persona persona){
        personas.add(persona);
    }

    public Integer promedioDeEdad(){
        return this.sumaDeEdades() / this.cantidadDePersonas();
    }

    private Integer cantidadDePersonas(){
        return personas.size();
    }

    private Integer sumaDeEdades(){
        return personas.stream().mapToInt(Persona::edad).sum();
    }

}
