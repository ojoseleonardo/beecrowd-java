package br.com.beecrowd.begginer;

import java.util.Scanner;

//        Leia 2 variáveis, denominadas A e B e faça a soma dessas duas variáveis, atribuindo seu resultado à variável X.
//        Imprima X conforme mostrado abaixo. Imprima a linha final após o resultado, caso contrário você receberá “Erro de apresentação”.
//
//        Entrada
//        O arquivo de entrada conterá 2 números inteiros.
//
//        Saída
//        Imprima a letra X (maiúscula) com um espaço em branco antes e depois do sinal de igual seguido do valor de X, conforme exemplo a seguir.
//
//        Obs.: afinal não se esqueça da linha final

public class ExtremelyBasic1001 {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            int a = ler.nextInt();
            int b = ler.nextInt();
            int x = a + b;
            System.out.println("X = " + x);


            }

        }

