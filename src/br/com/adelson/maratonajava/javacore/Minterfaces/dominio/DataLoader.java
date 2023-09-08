package br.com.adelson.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {

    /* Por padrão um método dentro de uma interface é pública e abstrata, sendo necessário apenas o tipo
    de retorno e o nome do método. */

    //public abstract void load();
    void load();

    default void CheckPermission(){
        System.out.println("Fazendo checagem de permissões");
    }
}
