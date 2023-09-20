package br.com.adelson.maratonajava.javacore.Npolimorfismo.servico;

import br.com.adelson.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvado no banco de dados");
    }
}
