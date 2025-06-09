package EjerFigura1;

public class Circulo extends Figura {
    private double radio;

    public Circulo(Punto origen, String nombre, double radio) {
        super();
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double Perimetro(){
        return 2 * radio * Math.PI;
    }

    @Override
    public double calcularArea(){
        return radio * radio * Math.PI;
    }

    @Override
    public String obtenerNombre() {
        return "";
    }

    @Override
    public String toString(){
        return super.toString() + "\nRadio: " + radio + "\nπ = " + String.format("%.6f", Math.PI) +
                "\nPerímetro: " + String.format("%.2f", Perimetro()) +
                "\nÁrea: " + String.format("%.2f", calcularArea()) + "\n";
    }

}
