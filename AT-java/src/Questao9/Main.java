package Questao9;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaJuan = new ContaBancaria("Juan", 500);

        contaJuan.exibirSaldo();

        contaJuan.depositar(1000);

        contaJuan.depositar(-200);

        contaJuan.sacar(350);

        contaJuan.sacar(2000);

        contaJuan.sacar(-500);

        contaJuan.exibirSaldo();
    }
}
