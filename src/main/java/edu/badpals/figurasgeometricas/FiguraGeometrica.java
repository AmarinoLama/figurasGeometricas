package edu.badpals.figurasgeometricas;

import java.util.ArrayList;

public abstract class FiguraGeometrica {
    private String nombre;
    private double area;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double getArea() {
        return area;
    }

    public abstract void calcularArea();

    @Override
    public String toString() {
        StringBuilder salida = new StringBuilder();
        salida.append("Figura:")
            .append(getNombre())
            .append("\t")
            .append("Area: ")
            . append(getArea());
        return salida.toString();
    }

}