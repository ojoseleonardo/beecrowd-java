package br.com.beecrowd.begginer;

import java.util.Scanner;

//        Leia dois valores inteiros, neste caso, as variáveis A e B. Após isso, calcule a soma entre eles e atribua-a à variável SOMA. Escreva o valor desta variável.
//
//        Entrada
//        O arquivo de entrada contém 2 números inteiros.
//
//        Saída
//        Imprima a mensagem "SOMA" com todas as letras maiúsculas, com um espaço em branco antes e depois do sinal de igual seguido do valor correspondente à soma de A e B.
//        Como todos os problemas, não esqueça de imprimir o final da linha , caso contrário, você receberá "Erro de apresentação"

public class SomaSimples {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a = ler.nextInt();
        int b = ler.nextInt();

        int soma = a + b;

        System.out.println("SOMA = " + soma);
    }
}
