package EjerFigura1;

public class Triangulo extends Figura {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(Punto origen, String nombre, double ladoA, double ladoB, double ladoC) {
        super();
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public double Perimetro() {
        return ladoA + ladoB + ladoC;
    }

    @Override
    public double calcularArea() {

        double s = Perimetro() / 2;
        return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
    }

    @Override
    public String obtenerNombre() {
        return "";
    }

    public double getSemiperimetro() {
        return Perimetro() / 2;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLado A: " + ladoA +
                "\nLado B: " + ladoB +
                "\nLado C: " + ladoC +
                "\nSemiperímetro: " + String.format("%.2f", getSemiperimetro()) +
                "\nPerímetro: " + String.format("%.2f", Perimetro()) +
                "\nÁrea: " + String.format("%.2f", calcularArea()) + "\n";
    }

}
