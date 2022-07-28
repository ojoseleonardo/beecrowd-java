package br.com.beecrowd.begginer;

//        In this problem, the task is to read a code of a product 1, the number of units of product 1,
//        the price for one unit of product 1, the code of a product 2,
//        the number of units of product 2 and the price for one unit of product 2.After this,calculate and show the amount to be paid.

import java.util.Locale;
import java.util.Scanner;

public class SimpleCalculate {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int codProduct1 = scanner.nextInt();
        int qntProduct1 = scanner.nextInt();
        float productPrice1 = scanner.nextFloat();
        int codProduct2 = scanner.nextInt();
        int qntProduct2 = scanner.nextInt();
        float productPrice2 = scanner.nextFloat();

        float finalProductPrice1 = productPrice1 * qntProduct1;
        float finalProductPrice2 = productPrice2 * qntProduct2;
        float amountToPaid = finalProductPrice1 + finalProductPrice2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", amountToPaid);

    }
}
