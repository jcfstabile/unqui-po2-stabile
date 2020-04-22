package ar.edu.unq.po2.tp3;

import java.time.LocalDate;

class Persona{
    private String nombre;
    private LocalDate fechaDeNacimiento;

    public Persona(String nombre, LocalDate fechaDeNacimiento){
        this.setNombre(nombre);
        this.setFechaDeNacimiento(fechaDeNacimiento);
    }

//     public Tipo getAttr(){
//         return this.attr;
//     }
//     public void setAttr(Tipo valor){
//         this.attr = valor;
//     }
     
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String valor){
        this.nombre = valor;
    }

    public LocalDate getFechaDeNacimiento(){
        return this.fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate valor){
        this.fechaDeNacimiento = valor;
    }

    public Integer edad(){
        return LocalDate.now().compareTo(this.getFechaDeNacimiento());
    }

    public Boolean menorQue(Persona persona){
        return this.getFechaDeNacimiento().isAfter(persona.getFechaDeNacimiento());
    }
}
