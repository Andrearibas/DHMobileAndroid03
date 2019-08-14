package br.digitalhouse.Exercicio;

import java.util.*;

public class Exercicio2 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(5);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(8);
        lista.add(8);

        Set<Integer> listaSet = new HashSet<>();
        listaSet.add(1);
        listaSet.add(5);
        listaSet.add(5);
        listaSet.add(6);
        listaSet.add(7);
        listaSet.add(8);
        listaSet.add(8);
        listaSet.add(8);

        System.out.println("*********LIST******************");
        for (Integer valor:lista){
            System.out.println(valor);
        }

        System.out.println("*********SET******************");
        for (Integer valor:listaSet){
            System.out.println(valor);
        }

        }


}
