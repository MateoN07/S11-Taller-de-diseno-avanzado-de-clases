package EjerFigura2;

public class Main {
    public static void main(String[] args) {

        Circunferencia circulo = new Circunferencia(5.0);
        Rectangulo rectangulo = new Rectangulo(4.0, 6.0);
        TriaEquilatero triangulo = new TriaEquilatero(3.0);

        System.out.println("--- CIRCUNFERENCIA ---");
        System.out.println("Radio: " + circulo.getRadio());
        System.out.printf("Area: %.2f%n", circulo.calcularArea());
        System.out.printf("Perimetro: %.2f%n", circulo.calcularPerimetro());

        System.out.println("\n--- RECTANGULO ---");
        System.out.println("Base: " + rectangulo.getBase());
        System.out.println("Altura: " + rectangulo.getAltura());
        System.out.printf("Area: %.2f%n", rectangulo.calcularArea());
        System.out.printf("Perimetro: %.2f%n", rectangulo.calcularPerimetro());

        System.out.println("\n=== TRIANGULO EQUILATERO ===");
        System.out.println("Lado: " + triangulo.getLado());
        System.out.printf("Area: %.2f%n", triangulo.calcularArea());
        System.out.printf("Perimetro: %.2f%n", triangulo.calcularPerimetro());
    }

}
