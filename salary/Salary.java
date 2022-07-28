package br.com.beecrowd.begginer;

import java.util.Locale;
import java.util.Scanner;

//        Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas em um mês e o valor que ele recebeu por hora.
//        Imprima o número do funcionário e o salário que ele receberá no final do mês, com duas casas decimais.
//
//        Não se esqueça de imprimir o final da linha após o resultado, caso contrário você receberá “Erro de apresentação”.
//
//        Não se esqueça do espaço antes e depois do sinal igual e depois do U$.
//
//        Entrada
//        O arquivo de entrada contém 2 números inteiros e 1 valor de ponto flutuante, representando o número, a quantidade de horas trabalhadas e a quantidade que o funcionário recebe por hora trabalhada.
//
//        Saída
//        Imprima o número e o salário do funcionário, conforme o exemplo dado, com um espaço em branco antes e depois do sinal de igual.

public class Salary {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        int funcNumero = ler.nextInt();
        int funcHorasTrabalhadas = ler.nextInt();
        double funcDinheiroPorHora = ler.nextDouble();
        ler.close();

        double funcSalarioFinal = funcDinheiroPorHora * funcHorasTrabalhadas;

        System.out.printf("NUMBER =     " + funcNumero + "\nSALARY = U$ %.2f%n" , funcSalarioFinal);
    }
}
