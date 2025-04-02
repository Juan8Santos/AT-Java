package Questao10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("====== Registro de compras ======");
        System.out.println("* Registre 3 compras com nome, quantidade e preço. ");

        Scanner scanner = new Scanner(System.in);
        short contadorWhile = 1;
        StringBuilder texto = new StringBuilder();

        Path path = Path.of("AT-java/src/Questao10/compras.txt");

        if(Files.notExists(path)){
            Files.createFile(path);
        }

        while(contadorWhile <= 3) {

            System.out.println("=================================");
            System.out.printf("* Cadastre o %dº produto.\n",contadorWhile);

            System.out.println("Digite o nome do produto.");
            String nomeProduto = scanner.nextLine();

            System.out.println("Digite a quantidade da compra.");
            int quantidadeProduto = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite o preço unitário do produto.");
            double precoProduto = scanner.nextDouble();
            scanner.nextLine();

            texto.append("Produto: ").append(nomeProduto).append(" | Quantidade: ").append(quantidadeProduto).append(" | Preço: R$").append(precoProduto).append("\n");
            contadorWhile++;
        }

        Files.writeString(path, texto);

        System.out.println("====== Lista de produtos ======");

        for (String linhas : Files.readAllLines(path)) {
            System.out.println(linhas);
        }

    }
}
