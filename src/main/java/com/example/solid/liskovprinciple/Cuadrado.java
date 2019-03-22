package com.example.solid.liskovprinciple;

public class Cuadrado extends Rectangulo{
    @Override
    public void setAltura(int altura){
        this.altura = altura;
        this.ancho = altura;
    }

    @Override
    public void setAncho(int ancho){
        this.ancho = ancho;
        this.altura = ancho;
    }


}
