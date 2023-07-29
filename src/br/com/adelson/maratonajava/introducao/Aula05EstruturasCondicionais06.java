package br.com.adelson.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

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
                resultado = "Domingo - Fim de semana";
                break;
            case 2:
                resultado = "Segunda - Dia útil";
                break;
            case 3:
                resultado = "Terça - Dia útil";
                break;
            case 4:
                resultado = "Quarta - Dia útil";
                break;
            case 5:
                resultado = "Quinta - Dia útil";
                break;
            case 6:
                resultado = "Sexta - Dia útil";
                break;
            case 7:
                resultado = "Sábado - Fim de semana";
                break;
            default:
                resultado = "Opção inválida";
        }
        System.out.println("O dia da semana é " + resultado);

        System.out.println("----------------------------");
        byte diax = 5;

        switch (diax) {
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
