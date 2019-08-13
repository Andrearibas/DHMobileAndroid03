package br.digitalhouse.revisao;

public abstract class Pessoa {

    private String nome;
    private Data nascimento;

    public Pessoa(String novoNome, Data novaNascimento){
        nome = novoNome;
        nascimento = novaNascimento;

    }


    public abstract void imprimeDados();


    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data novoNascimento) {
        nascimento = novoNascimento;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +", nascimento " + nascimento;
    }
}
