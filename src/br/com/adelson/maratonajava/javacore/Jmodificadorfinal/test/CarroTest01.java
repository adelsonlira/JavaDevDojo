package br.com.adelson.maratonajava.javacore.Jmodificadorfinal.test;

import br.com.adelson.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import br.com.adelson.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
        System.out.println("--------------");
        ferrari.imprime();

    }
}
