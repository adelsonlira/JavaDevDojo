package br.com.adelson.maratonajava.javacore.Npolimorfismo.dominio;

public class Computador extends Produto{

    public static final double PERCENTUAL_IMPOSTO = 0.21;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Computador");
        return this.valor * PERCENTUAL_IMPOSTO;
    }
}
