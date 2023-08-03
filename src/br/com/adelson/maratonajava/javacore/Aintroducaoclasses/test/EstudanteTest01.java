package br.com.adelson.maratonajava.javacore.Aintroducaoclasses.test;

import br.com.adelson.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();

        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println("O estudante "+estudante.nome+" tem "+estudante.idade+
                " anos e é do sexo "+estudante.sexo);

    }
}
