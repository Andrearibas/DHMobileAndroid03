package br.digitalhouse.tarefa;

public class Foto implements Imprimivel {
    private String nome = "Foto";
    private String tipo = "Jpeg";


    @Override
    public void imprimir() {
        System.out.println("Sou uma selfie em "+nome+" do tipo "+tipo);
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
