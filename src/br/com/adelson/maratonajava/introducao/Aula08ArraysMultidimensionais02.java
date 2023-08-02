package br.com.adelson.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        int[] array = {1, 2, 3};

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{6, 5, 4, 3, 2, 1};

        for (int[] arrayBase : arrayInt) {
            for (int num :
                    arrayBase) {
                System.out.print(num + " ");

            }
            System.out.println("\n-------------");
        }
        System.out.println("\n-------------");


        int[][] arrayInt2 = {{2, 2}, {3, 3, 3}, {6, 6, 6, 6, 6, 6}};

        for (int[] arrayBase : arrayInt2) {
            for (int num :
                    arrayBase) {
                System.out.print(num + " ");

            }
            System.out.println("\n-------------");
        }
    }

}
