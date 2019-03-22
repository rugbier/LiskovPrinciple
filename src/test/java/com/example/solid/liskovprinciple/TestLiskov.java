package com.example.solid.liskovprinciple;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestLiskov {
    private Forma forma;

    @Test
    public void TestRectangulo(){
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setAltura(3);
        rectangulo.setAncho(7);

        forma = rectangulo;

        assertEquals(21, forma.area());
    }

    @Test
    public void TestCuadrado(){
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(3);

        forma  = cuadrado;

        assertEquals(9, forma.area());
    }
}


