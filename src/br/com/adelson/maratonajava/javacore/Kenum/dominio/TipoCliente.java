package br.com.adelson.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private int Valor;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.Valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public int getValor() {
        return Valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
