package br.com.adelson.maratonajava.introducao;

import java.util.Random;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = new Random().nextInt(20);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("------------------");

        //Usando foreach

        for (int[] arrayBase : matriz) {
            for (int numerosMatriz:   arrayBase) {
                System.out.print(numerosMatriz+" ");
            }
            System.out.println();
        }
    }
}
