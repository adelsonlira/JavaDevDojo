package br.com.adelson.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1, 2));
    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */
    private static int divisao(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Valor inválido, b tem que ser maior que zero");
        }
        return a / b;
    }
}
