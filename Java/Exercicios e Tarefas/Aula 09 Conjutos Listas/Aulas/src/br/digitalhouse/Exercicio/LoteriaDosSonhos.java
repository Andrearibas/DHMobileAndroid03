package br.digitalhouse.Exercicio;

import java.util.HashMap;
import java.util.Map;

public class LoteriaDosSonhos {
    public static void main(String[] args) {
        Map<Integer, String> loteria = new HashMap<>();
        loteria.put(0,"Ovos");
        loteria.put(1,"Agua");
        loteria.put(2,"Escopeta ");
        loteria.put(3,"Cavalo");
        loteria.put(4,"Dentista");
        loteria.put(5,"Fogo");

        for (Integer chave:loteria.keySet()){
            String valor = loteria.get(chave);
            System.out.println(valor);

        }

    }
}
