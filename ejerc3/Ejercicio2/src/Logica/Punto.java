package Logica;

public class Punto implements IFigura {
    protected int x;
    protected int y;

    public Punto() {
        this(0, 0);
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int obtenerX() {
        return x;
    }

    public int obtenerY() {
        return y;
    }

    public void establecerX(int x) {
        this.x = x;
    }

    public void establecerY(int y) {
        this.y = y;
    }

    @Override
    public double obtenerArea() {
        return 0.0;
    }

    @Override
    public double obtenerVolumen() {
        return 0.0;
    }

    @Override
    public String obtenerNombre() {
        return "Punto";
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}