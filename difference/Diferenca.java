package br.com.beecrowd.begginer;

import java.util.Scanner;

//        Leia quatro valores inteiros chamados A, B, C e D. Calcule e imprima a diferença do produto A e B pelo produto de C e D (A * B - C * D).
//
//        Entrada
//        O arquivo de entrada contém 4 valores inteiros.
//
//        Saída
//        Imprima DIFERENCA com todas as letras maiúsculas, conforme exemplo a seguir, com um espaço em branco antes e depois do sinal de igual.

public class Diferenca {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a = ler.nextInt();
        int b = ler.nextInt();
        int c = ler.nextInt();
        int d = ler.nextInt();

        int dif = (a * b) - (c * d);

        System.out.println("DIFERENCA = " + dif);
    }
}
