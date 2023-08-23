package br.com.adelson.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    // 0 - Bloco de inicialização é executado quando a JVM carregar classe
    // 1 - Alocado espaço e memória pro objeto
    // 2 - Cada atributo de calsse é criado e incializado com valores default ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    private String nome;
    private static int[] episodios;

    static {
        System.out.println("Dentro do bloco de inicializacao estático 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicializacao estático 2");
    }

    static {
        System.out.println("Dentro do bloco de inicializacao estático 3");
    }

    {
        System.out.println("Dentro do bloco de inicializacao não estático");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodio : this.episodios) {
            System.out.print(episodio+ " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
