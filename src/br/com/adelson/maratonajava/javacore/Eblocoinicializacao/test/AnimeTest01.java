package br.com.adelson.maratonajava.javacore.Eblocoinicializacao.test;

import br.com.adelson.maratonajava.javacore.Eblocoinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime();

        System.out.println("\n"+anime.getEpisodios());

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio+" ");
        }
    }
}
