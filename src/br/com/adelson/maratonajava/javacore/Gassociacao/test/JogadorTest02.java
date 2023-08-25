package br.com.adelson.maratonajava.javacore.Gassociacao.test;

import br.com.adelson.maratonajava.javacore.Gassociacao.dominio.Jogador;
import br.com.adelson.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pelé");
        Time time = new Time("Santos");

        jogador.setTime(time);

        jogador.imprime();
    }
}
