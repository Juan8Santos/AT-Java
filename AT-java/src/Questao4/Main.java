package Questao4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validacaoParcelas = false;
        short parcelas = 0;

        System.out.println("====== Simulador de empréstimo ======");
        System.out.println("* Informações.");
        System.out.println("# 3% de juros ao mês.");
        System.out.println("# Mínimo de parcelas 6x");
        System.out.println("# Máximo de parcelas 48x");
        System.out.println("======================================");

        System.out.println("Digite seu nome.");
        String nome = scanner.nextLine();
        System.out.println("Digite o valor do empréstimo.");
        double valorEmprestimo = scanner.nextDouble();

        while(!validacaoParcelas) {
            System.out.println("Digite a quantidade de parcelas.");
            parcelas = scanner.nextShort();

            if(parcelas >= 6 && parcelas <= 48){
                validacaoParcelas = true;
            }
            else {
                System.out.println("Erro! você não pode solicitar menos de 6 parcelas ou mais de 48 parcelas.");
            }
        }

        double valorFinalEmprestimo = valorEmprestimo + (valorEmprestimo * 0.03 * parcelas);
        double valorParcelaMensal = valorFinalEmprestimo / parcelas;

        System.out.printf("Olá %s! O valor final do seu empréstimo será: R$%.2f e o valor das parcelas: R$%.2f.",nome ,valorFinalEmprestimo, valorParcelaMensal);

    }
}
