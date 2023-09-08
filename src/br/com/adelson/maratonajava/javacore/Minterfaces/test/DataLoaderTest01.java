package br.com.adelson.maratonajava.javacore.Minterfaces.test;

import br.com.adelson.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import br.com.adelson.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();
        System.out.println("----------------------");
        databaseLoader.remove();
        fileLoader.remove();
        System.out.println("----------------------");
        databaseLoader.CheckPermission();
        fileLoader.CheckPermission();
    }
}
