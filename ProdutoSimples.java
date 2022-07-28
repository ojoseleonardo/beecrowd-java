package br.com.beecrowd.begginer;

import java.util.Scanner;

//        Leia dois valores inteiros. Após isso, calcule o produto entre eles e armazene o resultado em uma variável denominada PROD.
//        Imprima o resultado como no exemplo abaixo. Não se esqueça de imprimir o final da linha após o resultado, caso contrário você receberá “Erro de apresentação”.
//
//        Entrada
//        O arquivo de entrada contém 2 números inteiros.
//
//        Saída
//        Imprima a mensagem "PROD" e PROD conforme o exemplo a seguir, com um espaço em branco antes e depois do sinal de igual.

public class ProdutoSimples {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        int a = ler.nextInt();
        int b = ler.nextInt();

        int PROD = a * b;

        System.out.println("PROD = " + PROD);
    }
}
