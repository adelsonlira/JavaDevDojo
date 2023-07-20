package br.com.adelson.maratonajava.introducao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicios {

    public static void main(String[] args) {

        String nome = "Adelson";
        String endereco = "Rua que não existe";
        double salario = 25000;
        String data = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println("Eu "+nome+", morando no endereço "+endereco+"," +
                " confirmo que recebi o salário de "+salario+", na data "+data);
    }

}
