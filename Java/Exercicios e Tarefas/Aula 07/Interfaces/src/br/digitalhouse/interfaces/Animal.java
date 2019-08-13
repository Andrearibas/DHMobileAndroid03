package br.digitalhouse.interfaces;

public abstract class Animal implements Brincavel{

    private String raca;
    private int idade;
    private String cor;

    public Animal(String novaRaca){
        raca = novaRaca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
