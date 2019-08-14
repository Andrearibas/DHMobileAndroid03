package br.digitalhouse.collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();
        conjunto.add("Erika");
        conjunto.add("Andrea");
        conjunto.add("João");

        for (String  lista:conjunto){
            System.out.println(lista);
        }

        System.out.println("***********************************");
        System.out.println("Map / HashMap");

        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(4, "Fizemos 3 gols contra você");
        mapa.put(1, "Fizemos 2 gols contra você");
        mapa.put(2, "Fizemos 2 gols contra você");
        mapa.put(4, "Fizemos 4 gols contra você");

        mapa.remove(1);

        for (Integer chave:mapa.keySet()){
            String valor = mapa.get(chave);
            System.out.println(valor);
        }

        System.out.println("***********************************");
        System.out.println("List / ArrayList");

        List<String> lista = new ArrayList<>();
        lista.add("Andrea");
        lista.add("Joao");
        lista.add("Maria");
        lista.add("Fernando");

        lista.remove(2);


        for (String valor:lista){
          System.out.println(valor);
        }
        System.out.println("*****************");
        String valor = lista.get(1);
        System.out.println(valor);
    }

}
