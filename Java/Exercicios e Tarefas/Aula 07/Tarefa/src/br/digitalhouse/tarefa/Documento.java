package br.digitalhouse.tarefa;

public class Documento implements Imprimivel {
    private String nome = "Documento";
    private String tipo = "Word";


    @Override
    public void imprimir() {
        System.out.println("Sou um "+nome+" no formato em "+tipo);

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
