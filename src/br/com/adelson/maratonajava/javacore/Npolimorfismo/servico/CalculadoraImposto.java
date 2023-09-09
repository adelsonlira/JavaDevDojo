package br.com.adelson.maratonajava.javacore.Npolimorfismo.servico;

import br.com.adelson.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import br.com.adelson.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){

        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: "+computador.getNome());
        System.out.println("Valor: R$"+computador.getValor());
        System.out.println("Imposto cobrado: R$"+imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){

        System.out.println("Relatório de imposto do computador");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate: "+tomate.getNome());
        System.out.println("Valor: R$"+tomate.getValor());
        System.out.println("Imposto cobrado: R$"+imposto);
    }
}
