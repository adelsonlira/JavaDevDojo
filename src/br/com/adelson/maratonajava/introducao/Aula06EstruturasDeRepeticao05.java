package br.com.adelson.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {

    // Dado o valor de um carro, descubra em quantas ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorDoCarro = 30000;
        double condicaoParcela = 1000;

        for (int parcela = (int) valorDoCarro; parcela >= 1 ; parcela--) {

            double valorParcela = valorDoCarro / parcela;

            if(valorParcela < 1000){
                continue;
            }

            System.out.println("Parcela "+parcela+ " R$ "+valorParcela);

        }
    }
}
