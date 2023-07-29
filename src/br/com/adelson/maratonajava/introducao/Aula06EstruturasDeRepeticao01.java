package br.com.adelson.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for

        int count = 0;
        while (count < 10){
            System.out.println("while "+ ++count);
        }

        System.out.println("------------------------------");

        count = 0;
        do {
            System.out.println("do - while: "+ count);
            count++;
        }while (count < 10);

        System.out.println("------------------------------");


        for (count = 0; count < 10; count++){
            System.out.println("for "+ count);
        }
    }
}
