package br.com.adelson.maratonajava.javacore.Bintroducaometodos.test;

import br.com.adelson.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {5, 6, 7, 8, 9};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(numeros);
        calculadora.somaVarArgs(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }
}
