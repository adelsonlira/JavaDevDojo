package br.com.adelson.maratonajava.javacore.Kenum.test;

import br.com.adelson.maratonajava.javacore.Kenum.dominio.Cliente;
import br.com.adelson.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Fulaninho", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Ciclaninho", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO);


        System.out.println(cliente1);
        System.out.println(cliente2);

    }
}
