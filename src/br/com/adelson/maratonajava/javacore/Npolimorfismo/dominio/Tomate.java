package br.com.adelson.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{

    public static final double PERCENTUAL_IMPOSTO = 0.06;

    private String dataValidade;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto sobre o Tomate");
        return this.valor * PERCENTUAL_IMPOSTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
