package com.example.solid.liskovprinciple;

public class Cuadrado implements Forma{
    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int area(){
        return lado * lado;
    }

}
