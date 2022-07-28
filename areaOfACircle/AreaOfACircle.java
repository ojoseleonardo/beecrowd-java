package br.com.beecrowd.begginer;

import java.util.Locale;
import java.util.Scanner;

//        A fórmula para calcular a área de uma circunferência é definida como A = π . R2. Considerando para este problema que π = 3,14159:
//
//        Calcule a área usando a fórmula dada na descrição do problema.
//
//        Entrada
//        A entrada contém um valor de ponto flutuante (precisão dupla), que é a variável R.
//
//        Saída
//        Apresente a mensagem "A=" seguida do valor da variável, como no exemplo abaixo, com quatro casas após a vírgula.
//        Use todas as variáveis de precisão dupla. Como todos os problemas, não se esqueça de imprimir o final de linha após o resultado,
//        caso contrário você receberá "Erro de apresentação".

public class AreaofaCircle1002 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        double n = 3.14159;
        Scanner ler = new Scanner(System.in);
        double R = ler.nextDouble();

        double A = n * Math.pow(R, 2);

        System.out.printf("A=%.4f%n", A);

        ler.close();
    }
}
