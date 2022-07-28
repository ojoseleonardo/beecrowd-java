package br.com.beecrowd.begginer;

import java.util.Locale;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double areaRectangleTriangle = (A * C) / 2;
        double areaRadiusCircle = 3.14159 * Math.pow(C, 2);
        double areaTrapezium = (A + B) * (C / 2);
        double areaSquare = B * B;
        double areaRectangle = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaRectangleTriangle);
        System.out.printf("CIRCULO: %.3f%n", areaRadiusCircle);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezium);
        System.out.printf("QUADRADO: %.3f%n", areaSquare);
        System.out.printf("RETANGULO: %.3f%n", areaRectangle);
    }
}
