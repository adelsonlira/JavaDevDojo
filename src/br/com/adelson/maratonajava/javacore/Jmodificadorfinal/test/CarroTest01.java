package br.com.adelson.maratonajava.javacore.Jmodificadorfinal.test;

import br.com.adelson.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.COMPRADOR.setNome("Kuririn");

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
    }
}
