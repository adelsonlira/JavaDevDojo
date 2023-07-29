package br.com.adelson.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {

        //Imprima o dia da semana, considerando 1 como domingo

        System.out.println("1 - Domingo");
        System.out.println("2 - Segunda-feira");
        System.out.println("3 - Terça-feira");
        System.out.println("4 - Quarta-feira");
        System.out.println("5 - Quinta-feira");
        System.out.println("6 - Sexta-feira");
        System.out.println("7 - Sabado");
        System.out.print("Digite o dia da semana correspondente com a numeração: ");

        Scanner scanner = new Scanner(System.in);

        String resultado = " ";

        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                resultado = "Domingo";
                break;
            case 2:
                resultado = "Segunda-feira";
                break;
            case 3:
                resultado = "Terça-feira";
                break;
            case 4:
                resultado = "Quarta-feira";
                break;
            case 5:
                resultado = "Quinta-feira";
                break;
            case 6:
                resultado = "Sexta-feira";
                break;
            case 7:
                resultado = "Sabado";
                break;
            default:
                resultado = "Opção inválida";
        }

        System.out.println("O dia da semana é " + resultado);

    }
}
