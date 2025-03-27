package Questao6;

public class Veiculo {
    String placa;
    String modelo;
    int anoDeFabricacao;
    double quilometragem;

    public Veiculo(String placa, String modelo, int anoDeFabricacao, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.quilometragem = quilometragem;
    }

    public void exibirDetalhes(){
        System.out.printf("Placa: %s / Modelo: %s / Ano de Fabricação: %d / Quilometragem: %.0fKm.\n", this.placa, this.modelo, this.anoDeFabricacao, this.quilometragem);
    }

    public void registrarViagem(double quilometragemExtra){
        this.quilometragem += quilometragemExtra;
    }
}
