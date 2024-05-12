package edu.badpals.figurasgeometricas;

public class Circulo extends FiguraGeometrica implements Drawable {

    public double radio = 0.0;

    public Circulo() {
        super();
    }

    public Circulo(double radio) {
        super();
        this.radio = radio;
    }

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        this.area = Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    public void draw() {
        System.out.println("Dibujo círculo");
    }
}
