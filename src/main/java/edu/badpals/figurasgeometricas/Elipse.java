package edu.badpals.figurasgeometricas;

public class Elipse extends FiguraGeometrica {
    public double radioA = 0.0;
    public double radioB = 0.0;

    public Elipse() {
        super();
    }

    public Elipse(double radioA, double radioB) {
        super();
        this.radioA = radioA;
        this.radioB = radioB;
    }

    public Elipse(String nombre, double radioA, double radioB) {
        super(nombre);
        this.radioA = radioA;
        this.radioB = radioB;
    }

    @Override
    public void calcularArea() {
        this.area = Math.PI * this.radioA * this.radioB;
    }
}
