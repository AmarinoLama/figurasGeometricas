package edu.badpals.figurasgeometricas;

public class Circulo extends FiguraGeometrica {

    private double radio;

    public Circulo(double radio) {
        super("Circulo");
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        this.area = Math.PI * Math.pow(this.radio, 2);
    }
}
