package br.com.adelson.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

            System.out.println("Digite seu nome abaixo");
            String nome = entrada.nextLine();

            System.out.println("Informe sua idade");
            int idade = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Informe M para Masculino ou F para Feminino");
            char sexo = entrada.next().charAt(0);

            System.out.println("--------------------");
            System.out.println("Nome " + nome);
            System.out.println("Idade " + idade);
            System.out.println("Sexo " + sexo);
            System.out.println("--------------------");


    }
}
