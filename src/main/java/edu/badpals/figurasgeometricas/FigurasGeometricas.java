package edu.badpals.figurasgeometricas;

import java.util.ArrayList;

public abstract class  FigurasGeometricas {
    private ArrayList<FigurasGeometricas> figuras = new ArrayList<FigurasGeometricas>();
    private String nombre;
    private double area;

    public FigurasGeometricas() {
    }

    public FigurasGeometricas(String nombre) {
        this.nombre = nombre;
    }

    public void addFigura(FigurasGeometricas figura) {
        figuras.add(figura);
    }

    public String getNombre() {
        return nombre;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        StringBuilder salida = new StringBuilder();
        for (FigurasGeometricas figura : figuras) {
            salida.append("Figura:")
                    .append(getNombre())
                    .append("\t")
                    .append("Area: ")
                    .append(getArea());
        }
        return salida.toString();
    }

}