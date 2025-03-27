package Questao8;

public class Gerente extends Funcionario{
    double salarioBase;

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
        this.salarioBase = super.salarioBase * 1.2;
    }
}
