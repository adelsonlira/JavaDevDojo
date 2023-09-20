package br.com.adelson.maratonajava.javacore.Npolimorfismo.servico;

import br.com.adelson.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvado em Memória");
    }
}
