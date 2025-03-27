package Questao6;

public class Main {
    public static void main(String[] args){
        Veiculo Porsche = new Veiculo("AAAA-0000", "Taycan", 2024, 10000.0);
        Veiculo Ferrari = new Veiculo("BBBB-1111", "LaFerrari", 2013, 25000.0);

        Porsche.exibirDetalhes();
        Ferrari.exibirDetalhes();

        Porsche.registrarViagem(23000.0);
        Ferrari.registrarViagem(9000.0);

        Porsche.exibirDetalhes();
        Ferrari.exibirDetalhes();
    }
}
