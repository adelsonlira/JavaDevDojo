package br.com.adelson.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionário");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Funcionário1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Funcionário2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do contrutor de Funcionário");
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPessoa(){
        System.out.println("O funcionário "+this.nome+" recebeu de salário R$"+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
