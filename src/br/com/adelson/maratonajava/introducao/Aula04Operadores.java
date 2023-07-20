package br.com.adelson.maratonajava.introducao;

import org.w3c.dom.ls.LSOutput;

public class Aula04Operadores {

    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;

        System.out.println(numero02-numero01);
        System.out.println("Valor "+numero02+numero01);
        System.out.println(numero02+numero01+" Valor "+numero02+numero01);
        System.out.println("----------------------------");

        double resultado = numero01 / numero02; //divisão de 2 inteiros resulta em 1 inteiro
        double resultado1 = numero01 /(double)numero02; //uma opção seria fazer casting (resolução feia)

        System.out.println(resultado);
        System.out.println(resultado1);
        System.out.println("----------------------------");

        //Resto %

        System.out.println(20%2);
        System.out.println(21%2);
        System.out.println("----------------------------");

        //Operadores lógicos (boolean) < > <= >= == !=

        boolean isDezMaiorQuevinte = 10 > 20;
        boolean isDezMenorQuevinte = 10 < 20;
        boolean isDezIgualvinte = 10 == 20;
        boolean isDezDiferentevinte = 10 != 20;

        System.out.println("isDezMaiorQuevinte "+isDezMaiorQuevinte);
        System.out.println("isDezMenorQuevinte "+isDezMenorQuevinte);
        System.out.println("isDezIgualvinte "+isDezIgualvinte);
        System.out.println("isDezDiferentevinte "+isDezDiferentevinte);
        System.out.println("----------------------------");

        //Operadores lógicos && (AND), || (OR), ! (NOT)


        int idade = 37;
        float salario = 5000F;

        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);
        System.out.println("----------------------------");

        double valorTotalContaCorrete = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrete >= valorPlaystation || valorTotalContaPoupanca >= valorTotalContaPoupanca;

        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);
        System.out.println("----------------------------");

        //Operadores de atribuição = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000; //bonus = bonus + 1000
        bonus -= 1000; //bonus = bonus - 1000
        bonus *= 2; //bonus = bonus * 2;
        bonus /= 2; //bonus = bonus / 2;
        System.out.println(bonus);
        System.out.println("----------------------------");

        //++ --

        int contador = 0;
        contador ++;
        System.out.println(contador);
        contador--;
        System.out.println(contador);
        System.out.println("----------------------------");

        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);

    }

}
