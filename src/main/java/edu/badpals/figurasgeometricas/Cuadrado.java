package edu.badpals.figurasgeometricas;

public class Cuadrado extends FiguraGeometrica {
    public double lado = 0.0;

    public Cuadrado() {
        super();
    }

    public Cuadrado(double lado) {
        super();
        this.lado = lado;
    }

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        this.area = Math.pow(this.lado, 2);
    }
}
