package br.com.adelson.maratonajava.javacore.Bintroducaometodos.dominio;

public class SalarioFuncionario {

    public double mediaSalarios(double[] salario) {

        if (salario == null) {
            return 0;
        }
        double resultado = 0;
        for (double soma : salario) {
            resultado = (resultado + soma);
        }
        return resultado / 3;
    }

    public void imprimirFuncionarios(String nome, int idade, double[] salarios, double resultado) {
        System.out.println("Funcionário: " + nome);
        System.out.println("Idade: " + idade);
        if (salarios == null) {
            return;
        }
        System.out.print("Salários: ");
        for (double salario : salarios) {
            System.out.print("R$" + salario + " ");
        }
        System.out.println("\nMédia do salário: R$" + String.format("%.2f", resultado));
    }

}
