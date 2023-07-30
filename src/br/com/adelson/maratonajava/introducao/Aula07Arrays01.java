package br.com.adelson.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        //Somente tipos referencia podem ser iniciados com null (arrays, String..)
        //tipos primitivos não podem iniciar como null (int, char, double...)
        //Um array é sempre um objeto

        int [] ages = new int[3];

        ages[0] = 21;
        ages[1] = 11;
        ages[2] = 25;

        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        System.out.println("-------------------");

        /* caso tente colocar um novo valor em uma posição que não existe a exception
        "ArrayIndexOutBoundsException" será lançada.*/

        //ages[3] = 99;
    }
}
