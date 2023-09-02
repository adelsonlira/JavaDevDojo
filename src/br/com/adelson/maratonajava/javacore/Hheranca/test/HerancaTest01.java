package br.com.adelson.maratonajava.javacore.Hheranca.test;

import br.com.adelson.maratonajava.javacore.Hheranca.dominio.Endereco;
import br.com.adelson.maratonajava.javacore.Hheranca.dominio.Funcionario;
import br.com.adelson.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();

        endereco.setRua("Rua 3");
        endereco.setCep("00013-021");

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Astrogildo");
        pessoa.setCpf("123456789-00");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("----------------------------");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Aderson");
        funcionario.setCpf("255366788-99");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(10000);

        funcionario.imprime();
        System.out.println("--------------------");
        funcionario.relatorioPessoa();
    }
}
