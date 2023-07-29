package br.com.adelson.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas ele pode ser parcelado
    // Condição valorParcela >= 1000

    public static void main(String[] args) {

        double valorDoCarro = 30000;
        double condicaoParcela = 1000;

        for (int parcela = 1; parcela <= valorDoCarro; parcela++){
            double valorParcela = valorDoCarro / parcela;
            if (valorParcela < condicaoParcela){
                break;
            }
            System.out.println("Parcela "+parcela+" R$ "+ valorParcela);
        }
    }
}
