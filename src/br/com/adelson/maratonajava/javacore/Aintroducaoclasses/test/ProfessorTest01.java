package br.com.adelson.maratonajava.javacore.Aintroducaoclasses.test;

import br.com.adelson.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Astrogildo";
        professor.idade = 45;
        professor.sexo = 'M';

        String sexo;

        if(professor.sexo == 'M'){
            sexo = "Masculino";
        }else {
            sexo = "Feminino";
        }

        System.out.println("O professor " + professor.nome + " tem " + professor.idade +
                " anos e é do sexo " + sexo);
    }
}
