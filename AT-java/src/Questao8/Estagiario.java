package Questao8;

public class Estagiario extends Funcionario{
    double salarioBase;

    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
        this.salarioBase = super.salarioBase * 1.1;
    }
}
