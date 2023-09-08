package br.com.adelson.maratonajava.javacore.Lclassesabstratas.test;

import br.com.adelson.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import br.com.adelson.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);

        gerente.imprime();
        desenvolvedor.imprime();
    }
}
