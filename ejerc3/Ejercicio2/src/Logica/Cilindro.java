package Logica;

public class Cilindro extends Circulo {
    private double altura;

    public Cilindro() {
        this(0, 0, 0.0, 0.0);
    }

    public Cilindro(int x, int y, double radio, double altura) {
        super(x, y, radio);
        this.altura = altura;
    }

    public void establecerAltura(double altura) {
        this.altura = altura;
    }

    public double obtenerAltura() {
        return altura;
    }

    @Override
    public double obtenerArea() {
        return 2 * Math.PI * radio * altura + 2 * Math.PI * radio * radio;
    }

    @Override
    public double obtenerVolumen() {
        return Math.PI * radio * radio * altura;
    }

    @Override
    public String obtenerNombre() {
        return "Cilindro";
    }

    @Override
    public String toString() {
        return super.toString() + "; Altura = " + altura;
    }
}