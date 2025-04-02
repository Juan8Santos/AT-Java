package Questao10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("====== Registro de compras  ======");
        System.out.println("* Registre 3 compras com nome, quantidade e preço. ");

        Scanner scanner = new Scanner(System.in);
        short contadorWhile = 0;
        String texto = "";

        Path path = Path.of("C:\\Users\\juan.santos\\IdeaProjects\\AT-Java\\AT-java\\src\\Questao10\\compras.txt");

        if(Files.notExists(path)){
            Files.createFile(path);
        }

        while(contadorWhile < 3) {

            System.out.println("Digite o nome do produto.");
            String nomeProduto = scanner.nextLine();

            System.out.println("Digite a quantidade da compra.");
            String quantidadeProduto = scanner.nextLine();

            System.out.println("Digite o preço unitário do produto.");
            String precoProduto = scanner.nextLine();

            texto = nomeProduto + " | " + quantidadeProduto + " | " + precoProduto;
            contadorWhile++;
        }



        Files.writeString(path, texto);

        for (String linhas : Files.readAllLines(path)) {
            System.out.println(linhas);
        }

    }
}
