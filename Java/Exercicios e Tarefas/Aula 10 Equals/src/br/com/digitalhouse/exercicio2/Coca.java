package br.com.digitalhouse.exercicio2;

import java.util.Objects;

public class Coca {
    private Integer tamanho;
    private Double preco;

    public Coca(Integer tamanho, Double preco){
        this.tamanho = tamanho;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coca coca = (Coca) o;
        return Objects.equals(tamanho, coca.tamanho) &&
                Objects.equals(preco, coca.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tamanho, preco);
    }
     //*Simplificando o Override (Sobrescrevendo) o Equals
    // @Override
   // public boolean equals(Object o) {
   //     return tamanho.equals(((Coca)o).tamanho) && preco.equals(((Coca)o).preco);
   // }
//
   // @Override
   // public int hashCode() {
   //     return Objects.hash(tamanho, preco);
   // }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
