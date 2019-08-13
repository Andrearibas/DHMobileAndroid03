package br.digitalhouse.tarefa;

public class Contrato implements Imprimivel{
    private String nome = "Contrato";
    private String tipo = "PDF";


    @Override
    public void imprimir() {
        System.out.println("Sou um "+nome+" muito legal, no tipo: "+tipo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
