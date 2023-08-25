package br.com.adelson.maratonajava.javacore.Gassociacao.test;

import br.com.adelson.maratonajava.javacore.Gassociacao.dominio.Escola;
import br.com.adelson.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Walter");
        Professor professor2 = new Professor("Moreira");
        Professor professor[]= {professor1, professor2};
        Escola escola = new Escola("UFRN", professor);

        escola.imprime();

    }
}
