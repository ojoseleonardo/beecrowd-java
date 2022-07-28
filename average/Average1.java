package br.com.beecrowd.begginer;

import java.util.Locale;
import java.util.Scanner;

//        Leia os valores de dois pontos flutuantes de precisão dupla A e B, correspondentes às notas de dois alunos.
//        Após isso, calcule a média do aluno, considerando que a nota A tem peso 3,5 e B tem peso 7,5. Cada nota pode ser de zero a dez,
//        sempre com um dígito após a vírgula. Não se esqueça de imprimir o final da linha após o resultado, caso contrário você receberá “Erro de apresentação”.
//        Não se esqueça do espaço antes e depois do sinal de igual.
//
//        Entrada
//        O arquivo de entrada contém valores de 2 pontos flutuantes com um dígito após o ponto decimal.
//
//        Saída
//        Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo a seguir, com 5 dígitos após a vírgula e com um espaço em branco antes e depois do sinal de igual.

public class Average1 {
    public static void main(String[] args) {
        Locale. setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        double notaA = ler.nextDouble();
        double notaB = ler.nextDouble();

        double pesoA = 3.5;
        double pesoB = 7.5;

        double totalPeso = pesoA + pesoB;
        double totalNotas = (notaA * pesoA) + (notaB * pesoB);

        double mediaFinal = totalNotas / totalPeso;

        System.out.printf("MEDIA = %.5f%n", mediaFinal);




    }
}
