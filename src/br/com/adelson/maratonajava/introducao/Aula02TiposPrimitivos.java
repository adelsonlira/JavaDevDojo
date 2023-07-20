package br.com.adelson.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // 8 tipos primitivos: int, double, float, char, byte, short, long, boolean

        int age = 10;
        long numeroGrande = 100000;
        double salarioDouble = 6000;
        float salarioFloat = 7500;
        byte idadeByte = 37;
        short idadeShort = 127;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 87;
        char caractereUnicode = '\u0041';

        //Casting

        long numeroExemplo = (long) 250.50;
        int inteiroExemplo = (int) 10000000000D;

        //String é uma classe

        String nome = "Adelson Lira de Olivera";

        System.out.println("A idade é "+age+" anos");
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println(caractereUnicode);
        System.out.println("");

        //Casting
        System.out.println(numeroExemplo);
        System.out.println(inteiroExemplo);
        System.out.println("");

        //String
        System.out.println(nome);
    }
}
