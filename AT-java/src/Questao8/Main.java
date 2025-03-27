package Questao8;

public class Main {
    public static void main(String[] args){
        Gerente gerente1 = new Gerente("juan", 9000);
        Estagiario estagiario1 = new Estagiario("Pablo", 1500);

        System.out.printf("Salário do gerente %s: R$%.2f\n", gerente1.nome, gerente1.salarioBase);
        System.out.printf("Salário do estagiário %s: R$%.2f\n", estagiario1.nome, estagiario1.salarioBase);
    }
}
