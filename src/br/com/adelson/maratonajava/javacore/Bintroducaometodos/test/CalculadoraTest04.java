package br.com.adelson.maratonajava.javacore.Bintroducaometodos.test;

import br.com.adelson.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int numero1 = 2;
        int numero2 = 5;

        calculadora.alteraDoisNumeros(numero1, numero2);

        System.out.println("-------------------");
        System.out.println("Dentro da classe CalculadoraTest04");
        System.out.println("Numero 1 = " + numero1);
        System.out.println("Numero 2 = " + numero2);
    }
}

