package Questao12;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] mensagens = new String[10];

        System.out.println("====== Sistema de Chat ======");

        System.out.print("Digite o nome do primeiro usuário: ");
        String usuario1 = scanner.nextLine();

        System.out.print("Digite o nome do segundo usuário: ");
        String usuario2 = scanner.nextLine();

        for (int i = 0; i < mensagens.length; i++) {
            if(i % 2 == 0) {
                System.out.printf("%s, digite sua mensagem: ",usuario1);
                String mensagemPrompt = scanner.nextLine();
                String mensagemUsuario = usuario1 + ": "+ mensagemPrompt;

                mensagens[i] = mensagemUsuario;
            }
            else{
                System.out.printf("%s, digite sua mensagem: ",usuario2);
                String mensagemPrompt = scanner.nextLine();
                String mensagemUsuario = usuario2 + ": "+ mensagemPrompt;

                mensagens[i] = mensagemUsuario;
            }
        }

        System.out.println("====== Histórico de Mensagens ======");

        for (String mensagem : mensagens) {
            System.out.println(mensagem);
        }

        System.out.println("Obrigado por utilizarem o sistema! Boa sorte para vocês!");
    }
}
