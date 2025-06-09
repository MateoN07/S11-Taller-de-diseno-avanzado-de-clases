package EjerFigura4;

public class Circulo extends Figura implements FiguraBidimensional {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
        this(1.0);
    }

    @Override
    public double obtenerArea() {
        return calcularArea();
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String obtenerNombre() {
        return "Círculo";
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return String.format("%s con radio %.2f", obtenerNombre(), radio);
    }
}