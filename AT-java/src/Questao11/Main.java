package Questao11;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numerosSorteados = new ArrayList<>();
        ArrayList<Integer> numerosEscolhidos = new ArrayList<>();
        ArrayList<Integer> numerosAcertados = new ArrayList<>();
        int contadorDeAcertos = 0;

        for(int i = 0; i < 6; i++) {
            int numeroGerado = random.nextInt(1, 60);
            if (!numerosSorteados.contains(numeroGerado)) {
                numerosSorteados.add(numeroGerado);
            }
            else {
                i--;
            }
        }

        System.out.println("====== Simulação de Loteria ======");
        System.out.println("* digite 6 números e veja quantos acertou.");

        for(int i = 1; i <= 6; i++){
            try {
                scanner = new Scanner(System.in);
                System.out.printf("Digite o %dº palpite: \n", i);
                int palpite = scanner.nextInt();
                if (palpite > 60 || palpite < 1) {
                    System.out.println("Valor inválido! O palpite deve estar nem um intervalo de 1 a 60.");
                    i--;
                } else if (!numerosEscolhidos.contains(palpite)) {
                    numerosEscolhidos.add(palpite);
                } else {
                    System.out.println("Você já escolheu esse valor! Dê um palpite diferente.");
                    i--;
                }
            }
            catch (Exception e){
                System.out.println("Utilize valores válidos! O palpite deve estar nem um intervalo de 1 a 60.");
                i--;
            }
        }

        for(int i : numerosSorteados){
            for(int j : numerosEscolhidos){
                if (i == j){
                    numerosAcertados.add(i);
                    contadorDeAcertos++;
                }
            }
        }

        System.out.println("====== Resultado ======");

        System.out.printf("Números sorteados: %s.\n",numerosSorteados);

        System.out.printf("Números escolhidos: %s.\n",numerosEscolhidos);

        System.out.println("=======================");


        System.out.printf("* Quantidade de acertos: %d.\n",contadorDeAcertos);

        if(contadorDeAcertos == 0) {
            System.out.println("* Números sorteados que acertou: nenhum.");
        }
        else {
            System.out.printf("* Números sorteados que acertou: %s.\n", numerosAcertados);
        }
    }
}
