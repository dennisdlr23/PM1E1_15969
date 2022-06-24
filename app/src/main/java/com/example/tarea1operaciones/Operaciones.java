package com.example.tarea1operaciones;

public class Operaciones {
    private Integer n1;
    private Integer n2;
    private Integer suma;
    private Integer resta;
    private Integer multiplicacion;
    private Integer division;

    public Operaciones(int i, int parseInt){}

    public Operaciones(Integer a, Integer b, Integer suma, Integer resta, Integer division, Integer multiplicacion){
        this.n1 = a;
        this.n2 = b;
    }
    public Integer getN1() { return n1; }
    public void setN1(Integer n1){
        this.n1 = n1;
    }

    public Integer getN2(){
        return n2;
    }
    public void setN2(Integer n2){
        this.n2 = n2;
    }

    //Operaciones
    public Integer suma (Integer a, Integer b){
        return suma = a + b;
    }

    public Integer resta (Integer a, Integer b){
        return resta = a - b;
    }

    public Integer division (Integer a, Integer b){
        return division = a / b;
    }

    public Integer multiplicacion (Integer a, Integer b){
        return multiplicacion = a * b;
    }


}
