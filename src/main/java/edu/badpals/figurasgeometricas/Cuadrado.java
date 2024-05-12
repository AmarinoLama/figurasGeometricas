package edu.badpals.figurasgeometricas;

public class Cuadrado extends FiguraGeometrica implements Drawable {
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

    @Override
    public void draw() {
        System.out.println("Dibujo cuadrado");
    }
}
