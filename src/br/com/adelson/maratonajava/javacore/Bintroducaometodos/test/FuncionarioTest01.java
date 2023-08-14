package br.com.adelson.maratonajava.javacore.Bintroducaometodos.test;

import br.com.adelson.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;
import br.com.adelson.maratonajava.javacore.Bintroducaometodos.dominio.SalarioFuncionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        SalarioFuncionario imprime = new SalarioFuncionario();

        funcionario.nome = "João";
        funcionario.idade = 28;
        funcionario.salarios = new double[]{2560, 3780, 7500};

        double resultado = imprime.mediaSalarios(funcionario.salarios);

        imprime.imprimirFuncionarios(funcionario.nome, funcionario.idade, funcionario.salarios, resultado);
    }
}
