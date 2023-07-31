package br.com.adelson.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        /*A inicialização das variáveis primitivas não declaradas são 0 quando:
        byte, short, int, long, float e double

        char = '\u0000'
        boolean = false

        Inicialização de variáveis reference não declaradas são null:
        String = null
         */

        short[] x = new short[2];
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println("------------------------");

        double[] y = new double[2];
        System.out.println(y[0]);
        System.out.println(y[1]);
        System.out.println("------------------------");

        String[] z = new String[2];
        System.out.println(z[0]);
        System.out.println(z[1]);
        System.out.println("------------------------");

        ///Utilização de estrutura de repetição para impressão de um array

        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";
        nomes[3] = "Hinata";

        //nomes = new String[4];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        System.out.println("------------------------");

        //outras formas de inicializar um array

        int[] numeros = new int[5];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{5, 4, 3, 2, 1};

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }
    }
}
