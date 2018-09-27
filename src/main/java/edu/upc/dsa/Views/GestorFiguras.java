package edu.upc.dsa.Views;
import edu.upc.dsa.Model.*;
import edu.upc.dsa.Controller.Figuras;

public class Main {

    Figuras[] figuras = new Figuras[]{};
    public static void main(String[] args) {
        double radio = 3;
        double base = 4;
        double altura = 8;
        double lado1 = 15;
        double lado2 = 9;

        Circulo circulo = new Circulo(radio);
        Cuadrado cuadrado = new Cuadrado(lado1);
        Triangulo triangulo = new Triangulo(base, altura);
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);

        Figuras[] figuras = new Figuras[4];
        figuras[0] = cuadrado;
        figuras[1] = circulo;
        figuras[2] = triangulo;
        figuras[4] = rectangulo;

        double suma;

        suma = suma(figuras);
        ordenar(figuras);
        System.out.println("Total de areas son:" + suma + "Y ordenadas son " + Arrays.toString(figuras));


    }

    public class GestorFiguras {
        public static double suma(Figuras[] figuras) {
            double res = 0;
            for (Figuras l : figuras) {
                res += l.area();
            }
            return res;
        }

        public static void ordenar(Figuras[] fig) {
            Figuras.sort(fig);
        }


    }
}

