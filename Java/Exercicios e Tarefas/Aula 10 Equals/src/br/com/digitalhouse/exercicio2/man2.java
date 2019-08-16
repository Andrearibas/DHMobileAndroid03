package br.com.digitalhouse.exercicio2;

public class man2 {
    public static void main(String[] args) {

        Coca cocaUm = new Coca(4,4.5);
        Coca cocaDois = new Coca(4,4.6);

        System.out.println(cocaUm.equals(cocaDois));
    }
}
