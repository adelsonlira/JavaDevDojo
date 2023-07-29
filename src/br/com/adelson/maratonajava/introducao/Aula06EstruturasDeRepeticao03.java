package br.com.adelson.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    // Imprima os primeiros 25 numeros de um dado valor. Por exemplo, 50

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
            if (i >= 25){
                break;
            }

        }
    }
}
