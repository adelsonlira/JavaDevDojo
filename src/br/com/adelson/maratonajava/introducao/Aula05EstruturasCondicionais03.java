package br.com.adelson.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

        //Se salario > 5000 faz doação

        double salario = 5000;
        String vouDoar = "Vou doar para o DevDojo";
        String naoVouDoar = "Ainda não posso doar";

        //operador ternário: (condição) ? verdadeiro : falso;
        String resultado = salario > 5000 ? vouDoar : naoVouDoar;

        System.out.println(resultado);
    }
}
