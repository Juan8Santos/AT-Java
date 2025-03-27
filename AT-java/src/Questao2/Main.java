package Questao2;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validadorSenha = false;

        System.out.println("Crie sua senha (mínimo 8 caracteres / mínimo uma letra maiuscula / mínimo um número 0 a 9 / mínimo um caractere especial [@, #, $, etc.])");
        System.out.println("=================================================");

        while (!validadorSenha){

            System.out.println("Digite sua senha.");
            String senha = scanner.nextLine();

            if (senha.length() < 8) {
                System.out.println("A senha deve ter no mínimo de 8 caracteres!");
            }
            else if (!Pattern.compile("[A-Z]").matcher(senha).find()) {
                System.out.println("A senha deve conter no mínimo uma letra maiúscula!");;
            }
            else if (!Pattern.compile("\\d").matcher(senha).find()) {
                System.out.println("A senha deve conter no mínimo um número!");;
            }
            else if (!Pattern.compile("[%$@!*^#&_]").matcher(senha).find()) {
                System.out.println("A senha deve conter no mínimo um caractere especial (@, #, $, etc.)!");
            }
            else {
                validadorSenha = true;
            }

        }
        System.out.println("Senha registrada com sucesso!");
    }
}
