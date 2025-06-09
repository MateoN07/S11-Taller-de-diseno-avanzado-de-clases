package EjerFigura4;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- SISTEMA DE FIGURAS GEOMETRICAS ---\n");

        Figura[] figuras = {
                new Punto(3.0, 4.0),
                new Circulo(5.0),
                new Cilindro(3.0, 7.0)
        };

        for (int i = 0; i < figuras.length; i++) {
            Figura figura = figuras[i];

            System.out.println("FIGURA " + (i + 1) + ":");
            System.out.println("Descripcion: " + figura.toString());
            System.out.println("Nombre: " + figura.obtenerNombre());
            System.out.printf("Area: %.2f\n", figura.obtenerArea());
            System.out.printf("Volumen: %.2f\n", figura.obtenerVolumen());

            if (figura instanceof FiguraBidimensional) {
                FiguraBidimensional fig2D = (FiguraBidimensional) figura;
                System.out.printf("Area (interfaz 2D): %.2f\n", fig2D.calcularArea());
            }

            if (figura instanceof FiguraTridimensional) {
                FiguraTridimensional fig3D = (FiguraTridimensional) figura;
                System.out.printf("Area total (interfaz 3D): %.2f\n", fig3D.calcularArea());
                System.out.printf("Volumen (interfaz 3D): %.2f\n", fig3D.calcularVolumen());
            }

            System.out.println("----------------------------------------");
        }
    }
}
