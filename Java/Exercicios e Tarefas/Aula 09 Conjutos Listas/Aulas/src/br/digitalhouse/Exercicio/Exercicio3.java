package br.digitalhouse.Exercicio;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exercicio3 {
    public static void main(String[] args) {
        Prova prova = new Prova();

        Set<Integer> numeros = new HashSet<>();
        numeros.add(4);
        numeros.add(6);
        numeros.add(12);
        numeros.add(7);
        numeros.add(9);
        numeros.add(2);

        prova.somaTotal(numeros);


    }
}
