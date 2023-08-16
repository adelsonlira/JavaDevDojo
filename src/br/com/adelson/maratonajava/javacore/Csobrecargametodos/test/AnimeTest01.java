package br.com.adelson.maratonajava.javacore.Csobrecargametodos.test;

import br.com.adelson.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Akuna Drive", "TV", 12, "Ação" );
        anime.imprime();
    }

}
