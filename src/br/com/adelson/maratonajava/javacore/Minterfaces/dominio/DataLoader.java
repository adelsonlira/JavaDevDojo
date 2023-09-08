package br.com.adelson.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {

    //Pode criar atributos na interface, mas elas serão publicas, estaticas e final (são constantes) por padrão.

    public static final int MAX_DATA_SIZE = 10;

    /* Por padrão um método dentro de uma interface é pública e abstrata, sendo necessário apenas o tipo
    de retorno e o nome do método. */

    //public abstract void load();
    void load();

    default void CheckPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    // Também existe a possibilidade de criar metodos estaticos, públicos por padrão, porém n é possível sobreescrever

    static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
