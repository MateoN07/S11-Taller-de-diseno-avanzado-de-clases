package EjerFigura1;

public class Rectangulo extends Figura{
    private double ancho;
    private double largo;

    public Rectangulo(Punto origen, String nombre, double ancho, double largo) {
        super();
        this.ancho = ancho;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public double Perimetro() {
        return 2 * ancho + 2 * largo;
    }

    @Override
    public double calcularArea() {
        return ancho * largo;
    }

    @Override
    public String obtenerNombre() {
        return "";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAncho: " + ancho +
                "\nLargo: " + largo +
                "\nPerímetro: " + String.format("%.2f", Perimetro()) +
                "\nÁrea: " + String.format("%.2f", calcularArea()) + "\n";
    }

}
