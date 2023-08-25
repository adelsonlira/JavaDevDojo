package br.com.adelson.maratonajava.javacore.Gassociacao.test;

import br.com.adelson.maratonajava.javacore.Gassociacao.dominio.Jogador;
import br.com.adelson.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cafú");
        Jogador jogador2 = new Jogador("RC");
        Time time = new Time("SPFC");

        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador1.imprime();
        jogador2.imprime();

        System.out.println("--- Time ---");
        time.imprime();
    }
}
