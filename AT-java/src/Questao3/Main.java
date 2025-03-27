package Questao3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====== Calculadora de Imposto de Renda ======");

        System.out.println("* Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("* Digite sua renda bruta mensal:");
        double valorBruto = scanner.nextDouble();
        double valorImposto = 0.0;
        double valorLiquido = 0.0;
        String situacaoImposto = "";

        if (valorBruto <= 22847.76) {
            situacaoImposto = "Você está isento de impostos!";
            valorLiquido = valorBruto;

        } else if (valorBruto <= 33919.80) {
            valorImposto = valorBruto * 0.075;
            situacaoImposto = "Você pagou 7,5% em impostos!";
            valorLiquido = valorBruto - valorImposto;

        } else if (valorBruto <= 45012.60) {
            valorImposto = valorBruto * 0.15;
            situacaoImposto = "Você pagou 15% em impostos!";
            valorLiquido = valorBruto - valorImposto;

        } else {
            valorImposto = valorBruto * 0.275;
            situacaoImposto = "Você pagou 27,5% em impostos!";
            valorLiquido = valorBruto - valorImposto;
        }

        System.out.printf("%s seu salário líquido mensal é: R$%.2f. %s\n", nome, valorLiquido, situacaoImposto);
    }
}
