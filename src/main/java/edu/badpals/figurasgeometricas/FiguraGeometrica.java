package edu.badpals.figurasgeometricas;

import java.util.ArrayList;

public abstract class FiguraGeometrica {
    public String nombre;
    public double area;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public abstract void calcularArea();

    @Override
    public String toString() {
        StringBuilder salida = new StringBuilder();
        salida.append("Figura:")
            .append(this.nombre)
            .append("\t")
            .append("Area: ")
            . append(this.area);
        return salida.toString();
    }

}