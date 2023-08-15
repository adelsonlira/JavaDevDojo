package br.com.adelson.maratonajava.javacore.Bintroducaometodos.test;

import br.com.adelson.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;
import br.com.adelson.maratonajava.javacore.Bintroducaometodos.dominio.SalarioFuncionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        SalarioFuncionario imprime = new SalarioFuncionario();

        funcionario.setNome("João");
        funcionario.setIdade(28);
        funcionario.setSalarios(new double[]{2560, 3780, 7500});

        double resultado = imprime.mediaSalarios(funcionario.getSalarios());

        imprime.imprimirFuncionarios(funcionario.getNome(), funcionario.getIdade(), funcionario.getSalarios(), resultado);
    }
}
