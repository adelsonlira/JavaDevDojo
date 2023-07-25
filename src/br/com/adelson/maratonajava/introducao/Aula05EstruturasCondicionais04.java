package br.com.adelson.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {

        // 0 a 34712 9,70%
        // 34713 a 68507 37,35%
        // 68508 49,50%

        double salarioAnual = 45000;
        double valorImposto;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * 9.7/100;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * 37.35/100;
        } else {
            valorImposto = salarioAnual * 49.50/100;
        }
        System.out.println("O valor do imposto será: "+valorImposto);
    }
}
