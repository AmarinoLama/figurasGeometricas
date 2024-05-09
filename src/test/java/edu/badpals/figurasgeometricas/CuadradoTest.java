package edu.badpals.figurasgeometricas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuadradoTest {

    @Test
    void testCalcularArea() {
        Cuadrado cuadrado = new Cuadrado(2);
        cuadrado.calcularArea();
        assertEquals(4, cuadrado.area);
    }

    @Test
    void testNombreFiguraUno() {
        Cuadrado cuadrado = new Cuadrado(2);
        assertEquals("alguna figura" , cuadrado.nombre);
    }

    @Test
    void testNombreFiguraDos() {
        Cuadrado cuadrado = new Cuadrado("cuadrado", 2);
        assertEquals("cuadrado" , cuadrado.nombre);
    }

    @Test
    void testConstructorVacio() {
        Cuadrado cuadrado = new Cuadrado();
        assertEquals(0, cuadrado.lado);
        assertEquals("alguna figura", cuadrado.nombre);
    }
}