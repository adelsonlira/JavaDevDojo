package br.com.adelson.maratonajava.javacore.Npolimorfismo.test;

import br.com.adelson.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import br.com.adelson.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import br.com.adelson.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import br.com.adelson.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();

        Repositorio repositorio1 = new RepositorioMemoria();
        repositorio1.salvar();

        Repositorio repositorio2 = new RepositorioBancoDeDados();
        repositorio2.salvar();




    }
}
