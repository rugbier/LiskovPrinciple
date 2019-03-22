package com.example.solid.liskovprinciple;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestLiskov {
    @Test
    public void TestRectangulo(){
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setAltura(3);
        rectangulo.setAncho(7);

        assertEquals(21, rectangulo.area());
    }

    @Test
    public void TestCuadrado(){
        Rectangulo rectangulo = new Cuadrado();
        rectangulo.setAltura(3);
        rectangulo.setAncho(7);

        assertEquals(21, rectangulo.area());
    }
}


