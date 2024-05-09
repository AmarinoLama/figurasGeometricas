package edu.badpals.figurasgeometricas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    @Test
    void testCalcularArea() {
        Circulo circulo = new Circulo(5);
        circulo.calcularArea();
        assertEquals(78.54, circulo.area, 0.01);
    }

    @Test
    void testCalcularAreaRadioCero() {
        Circulo circulo = new Circulo(0);
        circulo.calcularArea();
        assertEquals(0, circulo.area, 0.01);
    }

    @Test
    void testNombreFiguraUno() {
        Circulo circulo = new Circulo(-5);
        assertEquals("alguna figura" , circulo.nombre);
    }

    @Test
    void testNombreFiguraDos() {
        Circulo circulo = new Circulo("Circulo", -5);
        assertEquals("Circulo" , circulo.nombre);
    }

    @Test
    void testConstructorVacio() {
        Circulo circulo = new Circulo();
        assertEquals(0, circulo.radio);
        assertEquals("alguna figura", circulo.nombre);
    }
}