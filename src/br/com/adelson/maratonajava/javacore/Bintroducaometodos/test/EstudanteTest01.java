package br.com.adelson.maratonajava.javacore.Bintroducaometodos.test;


import br.com.adelson.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import br.com.adelson.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        ImpressoraEstudante imprimir = new ImpressoraEstudante();

        estudante01.nome = "Astrogildo";
        estudante01.idade = 80;
        estudante01.sexo = 'M';

        estudante02.nome = "Severina";
        estudante02.idade = 78;
        estudante02.sexo = 'F';

        imprimir.imprime(estudante01);
        imprimir.imprime(estudante02);

//        System.out.println("Nome Alterado!!");
//        System.out.println("----------------");
//
//        imprimir.imprime(estudante01);
//        imprimir.imprime(estudante02);

    }
}
