package Questao9;

public class ContaBancaria {
    public String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double deposito){
        if(deposito >= 0) {
            this.saldo += deposito;
            System.out.println("======================");
            System.out.println("Depósito realizado com sucesso!");
            System.out.printf("Saldo: R$%.2f.\n",this.saldo);
        }
        else {
            System.out.println("======================");
            System.out.println("Depósito negado! Utilize um valor válido.");
        }
    }

    public void sacar(double saque){

        if(saque <= 0){
            System.out.println("======================");
            System.out.println("Saque negado! Utilize um valor válido.");
        }
        else if (saque > this.saldo){
            System.out.println("======================");
            System.out.println("Saldo insuficiente!");
            System.out.printf("Saldo: R$%.2f.\n",this.saldo);
        }
        else{
            this.saldo -= saque;
            System.out.println("======================");
            System.out.println("Saque realizado com sucesso!");
            System.out.printf("Saldo: R$%.2f.\n",this.saldo);
        };
    }

    public void exibirSaldo(){
        System.out.println("======================");
        System.out.printf("Titular: %s.\n",this.titular);
        System.out.printf("Saldo: R$%.2f.\n",this.saldo);
    }
}
