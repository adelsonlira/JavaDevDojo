package br.com.adelson.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }
    private static String abreConexao(){
        try{
            System.out.println("Abrindo Arquivo");
            System.out.println("Escrevendo dados no aquivo");
            return "conexão aberta";

        }catch (RuntimeException e){
            e.printStackTrace();

        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }
}


