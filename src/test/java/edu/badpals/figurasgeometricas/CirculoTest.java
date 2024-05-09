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
}