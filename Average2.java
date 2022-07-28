package br.com.beecrowd.begginer;

import java.util.Locale;
import java.util.Scanner;

//        Leia três valores (variáveis A, B e C), que são as notas dos três alunos.
//        Em seguida, calcule a média, considerando que a nota A tem peso 2,a nota B tem peso 3 e a nota C tem peso 5.
//        Considere que cada nota pode ir de 0 a 10,0, sempre com uma casa decimal.
//
//        Entrada
//        O arquivo de entrada contém 3 valores de pontos flutuantes (duplos) com um dígito após o ponto decimal.
//
//        Saída
//        Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo a seguir, com um espaço em branco antes e depois do sinal de igual.

public class Average2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        double notaA = ler.nextDouble();
        double notaB = ler.nextDouble();
        double notaC = ler.nextDouble();

        double pesoA = 2;
        double pesoB = 3;
        double pesoC = 5;

        double totalPeso = pesoA + pesoB + pesoC;
        double totalNotas = (notaA * pesoA) + (notaB * pesoB) + (notaC * pesoC);

        double mediaFinal = totalNotas / totalPeso;

        System.out.printf("MEDIA = %.1f%n", mediaFinal);




    }
}
