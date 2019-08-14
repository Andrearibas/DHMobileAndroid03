package br.digitalhouse.Exercicio;

import java.util.Set;

public class Prova {

    public void somaTotal(Set<Integer> conjuntoDeInteiros) {
        Integer somaConjuntos = 0;
        for (Integer numero:conjuntoDeInteiros) {
            somaConjuntos = somaConjuntos + numero;

        }
        System.out.println("A soma do conjuto de numeros é: "+somaConjuntos);
    }

}
