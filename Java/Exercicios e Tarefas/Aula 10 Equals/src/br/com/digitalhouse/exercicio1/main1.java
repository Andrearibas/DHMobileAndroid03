package br.com.digitalhouse.exercicio1;

public class main1 {

    public static void main(String[] args) {
        Pessoa pessoaUm = new Pessoa("Andrea",444861);
        Pessoa pessoaDois = new Pessoa("Joao",444861);

        System.out.println(pessoaUm.equals(pessoaDois));

    }
}
