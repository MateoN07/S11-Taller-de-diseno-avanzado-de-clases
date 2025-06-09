package EjerFigura4;

public class Cilindro extends Circulo implements FiguraTridimensional {
    private double altura;

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    public Cilindro() {
        super();
        this.altura = 1.0;
    }

    @Override
    public double obtenerVolumen() {
        return calcularVolumen();
    }

    @Override
    public double calcularVolumen() {
        // Volumen = área base * altura
        return super.calcularArea() * altura;
    }

    @Override
    public double calcularArea() {
        return 2 * super.calcularArea() + 2 * Math.PI * getRadio() * altura;
    }

    @Override
    public String obtenerNombre() {
        return "Cilindro";
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return String.format("%s con radio %.2f y altura %.2f",
                obtenerNombre(), getRadio(), altura);
    }
}