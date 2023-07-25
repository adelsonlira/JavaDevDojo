package br.com.adelson.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {

    public static void main(String[] args) {
        //idade < 15 Categoria infantil
        //idade >= 15 && idade <18 Categoria Juvenil
        //idade >= 18 Categoria Adulto

        int idade = 18;
        String categoria;

        if(idade < 15){
            categoria = "Idade "+idade+" anos = Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Idade "+idade+" anos = Categoria Juvenil";
        } else {
            categoria = "Idade "+idade+" anos = Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
