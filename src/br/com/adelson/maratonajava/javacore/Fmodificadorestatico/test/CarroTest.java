package br.com.adelson.maratonajava.javacore.Fmodificadorestatico.test;

import br.com.adelson.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro("DMW", 280);
        Carro carro2 = new Carro("Mercedes", 275);
        Carro carro3 = new Carro("Audi", 290);

        Carro.setVelocidadeLimite(175);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }

}
