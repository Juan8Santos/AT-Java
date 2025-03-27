package Questao7;

public class Main {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno("Juan", "12345", 7.8, 8.0, 5.5);
        Aluno aluno2 = new Aluno("Lucas", "67890", 2.3, 6.0, 4.1);

        System.out.printf("Media do %s: %.1f\n", aluno1.nome,aluno1.calcularMedia());
        aluno1.verificarAprovacao();

        System.out.println("===========================");

        System.out.printf("Media do %s: %.1f\n", aluno2.nome,aluno2.calcularMedia());
        aluno2.verificarAprovacao();
    }
}
