package br.com.beecrowd.begginer;

import java.util.Locale;
import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Float r = scanner.nextFloat();

        double resultFormula = (4.0/3) * 3.14159 * Math.pow(r,3);

        System.out.printf("VOLUME = %.3f%n", resultFormula);
    }
}
