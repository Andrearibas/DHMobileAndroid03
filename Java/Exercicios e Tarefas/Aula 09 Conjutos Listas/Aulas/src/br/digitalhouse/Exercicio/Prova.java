package br.digitalhouse.Exercicio;

import java.util.Set;

public class Prova {
    private float soma = 0;

    public void somaTotal(Set<Integer> conjuntoDeInteiros) {
        for (int i = 0; i < conjuntoDeInteiros.size(); i++) {
            soma = soma + i;
        }
    }

}
