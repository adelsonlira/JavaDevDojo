package br.com.adelson.maratonajava.javacore.Npolimorfismo.test;

import br.com.adelson.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import br.com.adelson.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import br.com.adelson.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {

        Computador computador = new Computador("MAC", 23000);
        Tomate tomate = new Tomate("Cereja", 5.50);

       CalculadoraImposto.calcularImpostoComputador(computador);
       System.out.println("----------------------------------");
       CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
