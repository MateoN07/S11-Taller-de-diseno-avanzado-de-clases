package EjerFigura1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Figura> figuras = new ArrayList<>();
        System.out.println("Comience creando figuras geometricas.\n");



        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch(opcion) {
                case 1:
                    crearCirculo(scanner, figuras);
                    break;
                case 2:
                    crearRectangulo(scanner, figuras);
                    break;
                case 3:
                    crearTriangulo(scanner, figuras);
                    break;
                case 4:
                    mostrarTodasLasFiguras(figuras);
                    break;
                case 5:
                    mostrarResumenCalculos(figuras);
                    break;
                case 6:
                    System.out.println("¡Gracias por usar el programa!");
                    break;
                default:
                    System.out.println("Opción invalida.");
            }
        } while(opcion != 6);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n--- MENU PRINCIPAL ---");
        System.out.println("1. Crear Circulo");
        System.out.println("2. Crear Rectangulo");
        System.out.println("3. Crear Triangulo");
        System.out.println("4. Mostrar todas las figuras");
        System.out.println("5. Mostrar resumen de calculos");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opcion: ");
    }



    private static void crearCirculo(Scanner scanner, ArrayList<Figura> figuras) {
        System.out.println("\n--- CREAR CIRCULO ---");
        System.out.print("Ingrese el nombre del circulo: ");
        scanner.nextLine();
        String nombre = scanner.nextLine();

        System.out.print("Ingrese coordenada X del origen: ");
        double x = scanner.nextDouble();
        System.out.print("Ingrese coordenada Y del origen: ");
        double y = scanner.nextDouble();

        System.out.print("Ingrese el radio: ");
        double radio = scanner.nextDouble();

        if(radio <= 0) {
            System.out.println("Error: El radio debe ser positivo.");
            return;
        }

        Punto punto = new Punto(x, y);
        Circulo circulo = new Circulo(punto, nombre, radio);
        figuras.add(circulo);

        System.out.println("Circulo creado exitosamente!");
        System.out.println(circulo.toString());
    }

    private static void crearRectangulo(Scanner scanner, ArrayList<Figura> figuras) {
        System.out.println("\n--- CREAR RECTANGULO ---");
        System.out.print("Ingrese el nombre del rectangulo: ");
        scanner.nextLine();
        String nombre = scanner.nextLine();

        System.out.print("Ingrese coordenada X del origen: ");
        double x = scanner.nextDouble();
        System.out.print("Ingrese coordenada Y del origen: ");
        double y = scanner.nextDouble();

        System.out.print("Ingrese el ancho: ");
        double ancho = scanner.nextDouble();
        System.out.print("Ingrese el largo: ");
        double largo = scanner.nextDouble();

        if(ancho <= 0 || largo <= 0) {
            System.out.println("Error: El ancho y largo deben ser positivos.");
            return;
        }

        Punto punto = new Punto(x, y);
        Rectangulo rectangulo = new Rectangulo(punto, nombre, ancho, largo);
        figuras.add(rectangulo);

        System.out.println("Rectangulo creado exitosamente!");
        System.out.println(rectangulo.toString());
    }

    private static void crearTriangulo(Scanner scanner, ArrayList<Figura> figuras) {
        System.out.println("\n=== CREAR TRIANGULO ===");
        System.out.print("Ingrese el nombre del triangulo: ");
        scanner.nextLine();
        String nombre = scanner.nextLine();

        System.out.print("Ingrese coordenada X del origen: ");
        double x = scanner.nextDouble();
        System.out.print("Ingrese coordenada Y del origen: ");
        double y = scanner.nextDouble();

        System.out.print("Ingrese el lado A: ");
        double ladoA = scanner.nextDouble();
        System.out.print("Ingrese el lado B: ");
        double ladoB = scanner.nextDouble();
        System.out.print("Ingrese el lado C: ");
        double ladoC = scanner.nextDouble();

        if(ladoA <= 0 || ladoB <= 0 || ladoC <= 0) {
            System.out.println("Error: Todos los lados deben ser positivos.");
            return;
        }

        if(ladoA + ladoB <= ladoC || ladoA + ladoC <= ladoB || ladoB + ladoC <= ladoA) {
            System.out.println("Error: Los lados ingresados no pueden formar un triangulo valido.");
            return;
        }

        Punto punto = new Punto(x, y);
        Triangulo triangulo = new Triangulo(punto, nombre, ladoA, ladoB, ladoC);
        figuras.add(triangulo);

        System.out.println("Triangulo creado exitosamente!");
        System.out.println(triangulo.toString());
    }

    private static void mostrarTodasLasFiguras(ArrayList<Figura> figuras) {
        System.out.println("\n--- TODAS LAS FIGURAS ---");
        if(figuras.isEmpty()) {
            System.out.println("No hay figuras creadas.");
            return;
        }

        for(int i = 0; i < figuras.size(); i++) {
            System.out.println("--- Figura " + (i + 1) + " ---");
            System.out.println(figuras.get(i).toString());
        }
    }

    private static void mostrarResumenCalculos(ArrayList<Figura> figuras) {
        System.out.println("\n=== RESUMEN DE CÁLCULOS ===");
        if(figuras.isEmpty()) {
            System.out.println("No hay figuras para calcular.");
            return;
        }

        double totalPerimetros = 0;
        double totalAreas = 0;
        int cantCirculos = 0, cantRectangulos = 0, cantTriangulos = 0;

        System.out.printf("%-20s %-12s %-12s %-12s%n", "FIGURA", "TIPO", "PERIMETRO", "AREA");
        System.out.println("--------------------------------------------------------");

        for(Figura figura : figuras) {
            String tipo = "";
            if(figura instanceof Circulo) {
                tipo = "Circulo";
                cantCirculos++;
            } else if(figura instanceof Rectangulo) {
                tipo = "Rectangulo";
                cantRectangulos++;
            } else if(figura instanceof Triangulo) {
                tipo = "Triangulo";
                cantTriangulos++;
            }

            double perimetro = figura.Perimetro();
            double area = figura.calcularArea();

            System.out.printf("%-20s %-12s %-12.2f %-12.2f%n",
                    figura.getNombre(), tipo, perimetro, area);

            totalPerimetros += perimetro;
            totalAreas += area;
        }

        System.out.println("--------------------------------------------------------");
        System.out.printf("TOTALES: %d figuras - Perímetro: %.2f - Area: %.2f%n",
                figuras.size(), totalPerimetros, totalAreas);
        System.out.printf("Distribucion: %d circulos, %d rectangulos, %d triangulos%n",
                cantCirculos, cantRectangulos, cantTriangulos);
    }

}
