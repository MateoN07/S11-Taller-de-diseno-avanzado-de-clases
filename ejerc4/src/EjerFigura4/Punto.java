package EjerFigura4;

public class Punto extends Figura {
    private double x, y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this(0.0, 0.0);
    }

    @Override
    public String obtenerNombre() {
        return "Punto";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("Punto(%.1f, %.1f)", x, y);
    }
}
