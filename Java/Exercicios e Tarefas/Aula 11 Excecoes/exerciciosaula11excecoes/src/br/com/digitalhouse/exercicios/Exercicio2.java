package br.com.digitalhouse.exercicios;

import java.util.ArrayList;

public class Exercicio2 {
    public static void main(String[] args) {
        try {
            ArrayList<String> lista = new ArrayList<>();
            lista.add("Pato");
            lista.add("Cachorro");
            lista.add("Gato");

            System.out.println(lista.get(5));

        }catch (Exception ex){
            System.out.println("Ocorreu um erro: "+ex.getMessage());
            ex.printStackTrace();
        }


    }
}
