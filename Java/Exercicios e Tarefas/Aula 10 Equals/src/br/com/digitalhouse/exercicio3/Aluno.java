package br.com.digitalhouse.exercicio3;

import java.util.Objects;

public class Aluno {
    private String nome;
    private Integer numeroDeAluno;

    public Aluno(String nome, Integer numeroDeAluno) {
        this.nome = nome;
        this.numeroDeAluno = numeroDeAluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return numeroDeAluno.equals(((Aluno)o).numeroDeAluno);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroDeAluno() {
        return numeroDeAluno;
    }

    public void setNumeroDeAluno(Integer numeroDeAluno) {
        this.numeroDeAluno = numeroDeAluno;
    }
}
