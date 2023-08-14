package br.com.adelson.maratonajava.javacore.Bintroducaometodos.dominio;

public class SalarioFuncionario {

    public double mediaSalarios(double[] salario){

        double resultado = 0;
        for (double media : salario) {
            resultado  =  media;
        }
        return resultado;
    }

    public void imprimirFuncionarios(String nome, int idade, double resultado){
        System.out.println("Funcionário: "+nome);
        System.out.println("Idade: "+idade);
        //System.out.println("Salários R$"+salario1+" R$"+salario2+" R$"+salario3);
        System.out.println("Média do salário: R$"+resultado);
    }

}
