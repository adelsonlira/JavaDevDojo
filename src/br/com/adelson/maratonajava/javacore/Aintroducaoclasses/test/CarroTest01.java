package br.com.adelson.maratonajava.javacore.Aintroducaoclasses.test;

import br.com.adelson.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {

    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();

        carro.nome = "T-Cross";
        carro.modelo = "Sense";
        carro.ano = 2020;

        carro1.nome = "Ka";
        carro1.modelo = "Techno";
        carro1.ano = 2019;

        System.out.println("O primeiro carro é "+carro.nome+" modelo "+carro.modelo+" ano "+carro.ano);
        System.out.println("---------------------------------");
        System.out.println("O segundo carro é "+carro1.nome+" modelo "+carro1.modelo+" ano "+carro1.ano);
    }
}
