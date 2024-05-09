package edu.badpals.figurasgeometricas;

public class Circulo extends FiguraGeometrica {

    private double radio;

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
}
