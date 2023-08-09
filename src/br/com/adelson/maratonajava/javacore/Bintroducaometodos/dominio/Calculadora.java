package br.com.adelson.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somarDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(50 - 10);
    }

    public void multiplicaDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0.0;
        }
        return num1 / num2;
    }

}
