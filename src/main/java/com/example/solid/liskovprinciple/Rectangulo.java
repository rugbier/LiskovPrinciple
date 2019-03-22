package com.example.solid.liskovprinciple;

public class Rectangulo {
    protected int altura;
    protected int ancho;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int area(){
        return altura * ancho;
    }
}
