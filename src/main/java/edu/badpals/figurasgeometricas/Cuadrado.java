package edu.badpals.figurasgeometricas;

public class Cuadrado {
    public double lado = 0.0;

    public Cuadrado() {
        super();
    }

    public Cuadrado(double lado) {
        super();
        this.lado = lado;
    }

    public Cuadrado(String nombre, double radio) {
        super(nombre);
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        this.area = Math.PI * Math.pow(this.radio, 2);
    }
}
