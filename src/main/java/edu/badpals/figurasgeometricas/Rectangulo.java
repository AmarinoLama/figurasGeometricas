package edu.badpals.figurasgeometricas;

public class Rectangulo extends FiguraGeometrica {

    public double base;
    public double altura;

    public Rectangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {

    }
}
