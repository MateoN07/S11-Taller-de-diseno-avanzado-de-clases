package Interfaces;

import Logica.*;

public class PruebaInterfaz {
    public static void main(String[] args) {
        IFigura[] figuras = new IFigura[3];

        figuras[0] = new Punto(1, 2);
        figuras[1] = new Circulo(3, 4, 5.0);
        figuras[2] = new Cilindro(5, 6, 7.0, 10.0);

        for (IFigura figura : figuras) {
            System.out.println("Figura: "+figura.obtenerNombre());
            System.out.println("Área: "+figura.obtenerArea());
            System.out.println("Volumen: "+figura.obtenerVolumen());
            System.out.println("Descripción: "+figura);
            System.out.println("----------------------------------");
        }
    }
}