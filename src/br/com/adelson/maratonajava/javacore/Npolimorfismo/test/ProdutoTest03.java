package br.com.adelson.maratonajava.javacore.Npolimorfismo.test;

import br.com.adelson.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import br.com.adelson.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import br.com.adelson.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import br.com.adelson.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {

        Produto produto = new Computador("Ryzen 5 5600G", 1200);


        Tomate produto2 = new Tomate("Santa Adelia", 5);

        produto2.setDataValidade("22/09/2023");

        CalculadoraImposto.calcularImposto(produto2);

        System.out.println("---------------------");

        CalculadoraImposto.calcularImposto(produto);



    }
}
