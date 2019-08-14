package br.digitalhouse.Exercicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Apelidos {
    public static void main(String[] args) {
        Map<String, List<String>> apelidos = new HashMap<>();
        List<String> listaJoao = new ArrayList<>();
        listaJoao.add("Juan");
        listaJoao.add("Fissura");
        listaJoao.add("Maromba");
        apelidos.put("Joao",listaJoao);

        List<String> listaMiguel = new ArrayList<>();
        listaMiguel.add("Night Watch");
        listaMiguel.add("Bruce Wayne");
        listaMiguel.add("Tampinha ");
        apelidos.put("Miguel",listaMiguel);

        List<String> listaMaria = new ArrayList<>();
        listaMaria.add("Wonder Woma");
        listaMaria.add("Mary");
        listaMaria.add("Marilene");
        apelidos.put("Maria",listaMaria);

        List<String> listaLucas = new ArrayList<>();
        listaLucas.add("Lukinha");
        listaLucas.add("Jorge");
        listaLucas.add("George");
        apelidos.put("Lucas",listaLucas);

        for (String chave:apelidos.keySet()) {
            List nome = apelidos.get(chave);
            System.out.println(chave +" "+nome);
        }
    }


}
