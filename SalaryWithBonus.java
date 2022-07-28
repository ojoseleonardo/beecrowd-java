package br.com.beecrowd.begginer;

import java.util.Locale;
import java.util.Scanner;

//        Faça um programa que leia o nome de um vendedor, seu salário fixo e o total da venda feita por ele mesmo no mês (em dinheiro).
//        Considerando que este vendedor recebe 15% sobre todos os produtos vendidos, escreva o salário final (total) deste vendedor ao final do mês, com duas casas decimais.
//
//        - Não esqueça de imprimir o final da linha após o resultado, caso contrário você receberá “Erro de apresentação”.
//        - Não se esqueça dos espaços em branco.

public class SalaryWithBonus {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        String nomeVendedor = ler.nextLine();
        double salarioFixoVendedor = ler.nextDouble();
        double dinheiroMensalDasVendas = ler.nextDouble();

        double totalDeDinheiroMensalRecebidoPelasVendas = dinheiroMensalDasVendas/100 * 15;
        double somaDoTotalDeDinheroRecebidoNoMes = salarioFixoVendedor + totalDeDinheiroMensalRecebidoPelasVendas;

        System.out.printf("TOTAL = R$ %.2f%n", somaDoTotalDeDinheroRecebidoNoMes);


    }
}
