package br.com.adelson.maratonajava.javacore.Kenum.dominio;



public class Cliente {

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento credito) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome = '" + nome + '\'' +
                ", tipoCliente = " + tipoCliente.getNomeRelatorio() +
                ", tipoClienteInt = " + tipoCliente.getValor() +
                '}';
    }
}
