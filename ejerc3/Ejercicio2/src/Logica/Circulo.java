package Logica;

public class Circulo extends Punto {
    protected double radio;

    public Circulo() {
        this(0, 0, 0.0);
    }

    public Circulo(int x, int y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    public void establecerRadio(double radio) {
        this.radio = radio;
    }

    public double obtenerRadio() {
        return radio;
    }

    @Override
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double obtenerVolumen() {
        return 0.0;
    }

    @Override
    public String obtenerNombre() {
        return "Círculo";
    }

    @Override
    public String toString() {
        return "Centro = " + super.toString() + "; Radio = " + radio;
    }
}