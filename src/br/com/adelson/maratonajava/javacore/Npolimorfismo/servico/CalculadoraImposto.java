package br.com.adelson.maratonajava.javacore.Npolimorfismo.servico;

import br.com.adelson.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import br.com.adelson.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import br.com.adelson.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

     public static void calcularImposto(Produto produto){
        System.out.println("Calculando Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+ produto.getNome());
        System.out.println("Preço: "+ produto.getValor());
        System.out.println("Imposto: "+imposto );

    }
}
