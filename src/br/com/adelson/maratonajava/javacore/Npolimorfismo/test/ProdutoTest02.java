package br.com.adelson.maratonajava.javacore.Npolimorfismo.test;

import br.com.adelson.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import br.com.adelson.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import br.com.adelson.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {

        Produto produto = new Computador("Ryzen 5 5600G", 1200);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("---------------------");

        Produto produto2 = new Tomate("Santa Adelia", 5);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());


    }
}
