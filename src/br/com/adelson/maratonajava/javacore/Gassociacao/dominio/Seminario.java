package br.com.adelson.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private String endereco;
    private Aluno[] alunos;
    private Professor[] professores;

    public Seminario(String titulo, String endereco) {
        this.titulo = titulo;
        this.endereco = endereco;
    }

    public Seminario(String titulo, String endereco, Aluno[] alunos) {
        this.titulo = titulo;
        this.endereco = endereco;
        this.alunos = alunos;
    }

    public Seminario(String titulo, String endereco, Aluno[] alunos, Professor[] professores) {
        this.titulo = titulo;
        this.endereco = endereco;
        this.alunos = alunos;
        this.professores = professores;
    }

    public void imprime(){
        System.out.println("Título do seminário: "+this.titulo);
        System.out.println("Endereço: "+endereco);
        for (Professor professor : professores){
            System.out.println("Professor: "+professor.getNome());
        }
        for (Aluno aluno : alunos){
            System.out.println("Alunos: "+aluno.getNome());
        }
        System.out.println("---------------------------------");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
