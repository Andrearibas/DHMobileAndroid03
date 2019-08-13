package br.digitalhouse.tarefa;

import java.util.ArrayList;
import java.util.List;

public class Impressora {
    private List<Imprimivel> imprimiveis = new ArrayList<>();

    public void imprimirTudo(){
        for (Imprimivel imprimivel : imprimiveis) {
            imprimivel.imprimir();
        }
    }

    public void adicionarImprimivel(Imprimivel umImprimivel){
        imprimiveis.add(umImprimivel);
    }

    public List<Imprimivel> getImprimiveis() {
        return imprimiveis;
    }

    public void setImprimiveis(List<Imprimivel> imprimiveis) {
        this.imprimiveis = imprimiveis;
    }
}
