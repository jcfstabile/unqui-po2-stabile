package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter{

    ArrayList<Integer> numeros;

    public Counter(){
        this.numeros = new ArrayList<Integer>();
    }

    private ArrayList<Integer> getNumeros(){
        return this.numeros;
    }

    public void addNumber(Integer value){
        this.getNumeros().add(value);
    }

    public Integer getEvenOcurrences(){
        return this.getMultiplesOf_Ocurrences(2);
    }
    
    public Integer getOddOcurrences(){
        return this.getNumeros().size() - this.getMultiplesOf_Ocurrences(2);
    }

    public Integer getMultiplesOf_Ocurrences(Integer m){
        return (int) this.getNumeros().stream().filter(n -> n % m == 0 ).count();
    }

    public Integer getCount(){
        return this.getNumeros().size();
    }
    
}
