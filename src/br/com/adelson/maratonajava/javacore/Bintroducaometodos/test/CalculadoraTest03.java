package br.com.adelson.maratonajava.javacore.Bintroducaometodos.test;

import br.com.adelson.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideDoisNumeros(20, 0);
        System.out.println(result);

        System.out.println("-------------------");

        double result2 = calculadora.divideDoisNumeros(55.5, 2);
        System.out.println(result2);
    }
}
