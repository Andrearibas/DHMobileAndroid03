package br.com.digitalhouse.exercicio1;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private Integer rg;

    public Pessoa(String nome, Integer rg){
        this.nome = nome;
        this.rg = rg;

    }

    @Override
    public boolean equals(Object o) {
      //  if (this == o) return true;
      //  if (o == null || getClass() != o.getClass()) return false;
      // Pessoa pessoa = (Pessoa) o;
        return rg.equals(((Pessoa)o).rg); //Comparação do rg da classe Pessoa com o parametro Objeto O, com o cache forçando esse Objeto ser da classe Pessoa)
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }
}
