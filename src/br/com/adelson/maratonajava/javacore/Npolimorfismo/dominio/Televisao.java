package br.com.adelson.maratonajava.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto{

    public static final double PERCENTUAL_IMPOSTO = 0.21;


    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da Televisão");
        return this.valor * PERCENTUAL_IMPOSTO;
    }
}
