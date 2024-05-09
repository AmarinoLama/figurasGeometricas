package edu.badpals.figurasgeometricas;

import java.util.ArrayList;

public abstract class  FigurasGeometricas {
    private ArrayList<FigurasGeometricas> figuras = new ArrayList<FigurasGeometricas>();

    public FigurasGeometricas() {
    }

    public void addFigura(FigurasGeometricas figura) {
        figuras.add(figura);
    }

    @Override
    public String toString() {
        StringBuilder salida = new StringBuilder();
        for (FigurasGeometricas figura : figuras) {
            salida.append("Figura:")
                    .append(figura.toString())
                    .append("\t")
                    .append("Area: ")
                    .append(figura.area());
        }
        return salida.toString();
    }

}