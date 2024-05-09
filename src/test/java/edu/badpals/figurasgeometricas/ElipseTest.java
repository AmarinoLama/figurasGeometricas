package edu.badpals.figurasgeometricas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElipseTest {

    @Test
    void testCalcularArea() {
        Elipse elipse = new Elipse(3, 4);
        elipse.calcularArea();
        assertEquals(37.7, elipse.area, 0.1);
    }

    @Test
    void testNombreFiguraUno() {
        Elipse elipse = new Elipse(3, 4);
        assertEquals("alguna figura" , elipse.nombre);
    }

    @Test
    void testNombreFiguraDos() {
        Elipse elipse = new Elipse("elipse", 3, 4);
        assertEquals("elipse" , elipse.nombre);
    }

    @Test
    void testConstructorVacio() {
        Elipse elipse = new Elipse();
        assertEquals(0, elipse.radioA);
        assertEquals("alguna figura", elipse.nombre);
    }
}