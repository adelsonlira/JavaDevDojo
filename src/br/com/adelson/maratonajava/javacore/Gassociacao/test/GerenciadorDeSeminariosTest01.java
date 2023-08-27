package br.com.adelson.maratonajava.javacore.Gassociacao.test;

import br.com.adelson.maratonajava.javacore.Gassociacao.dominio.Aluno;
import br.com.adelson.maratonajava.javacore.Gassociacao.dominio.Professor;
import br.com.adelson.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class GerenciadorDeSeminariosTest01 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Fulano", 19);
        Aluno aluno2 = new Aluno("Ciclano", 18);
        Aluno aluno3 = new Aluno("Beltrano", 19);
        Aluno aluno[] = {aluno1, aluno2, aluno3};

        Professor professor1 = new Professor("Walter", "Geofísica rasa");
        Professor professor2 = new Professor("Moreira", "Geodinâmica");
        Professor professor[]= {professor1, professor2};

        Seminario seminario1 = new Seminario("Conscientização Política", "Rua do meio, 0", new Aluno[]{aluno1, aluno2}, professor);
        Seminario seminario2 = new Seminario("Desenvolvendo com DevDojo", "Rua de cima, 100", new Aluno[]{aluno3}, new Professor[]{professor1});


//        aluno1.setSeminario(seminario1);
//        aluno2.setSeminario(seminario1);
//        aluno3.setSeminario(seminario2);
//
//        seminario1.setAlunos(new Aluno[]{aluno1, aluno2});
//        seminario2.setAlunos(new Aluno[]{aluno3});
//
//        professor1.setSeminarios(seminario);
//        professor2.setSeminarios(new Seminario[]{seminario1});
//
//        seminario1.setProfessores(professor);
//        seminario2.setProfessores(new Professor[]{professor1});

        seminario1.imprime();
        seminario2.imprime();


    }
}
