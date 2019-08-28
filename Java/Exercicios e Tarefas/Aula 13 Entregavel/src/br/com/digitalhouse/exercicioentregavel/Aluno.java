package br.com.digitalhouse.exercicioentregavel;

import java.util.Objects;

public class Aluno {
    private String nomeAluno;
    private String sobrenome;
    private Integer codigoAluno;

    public Aluno(String nome, String sobrenome, Integer codigoAluno) {
        this.nomeAluno = nome;
        this.sobrenome = sobrenome;
        this.codigoAluno = codigoAluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return codigoAluno.equals(aluno.codigoAluno);
    }

    @Override
    public String toString() {
        return "Aluno(a): " + nomeAluno +" "+ sobrenome;
    }

    public String getNome() {
        return nomeAluno;
    }

    public void setNome(String nome) {
        this.nomeAluno = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(Integer codigoAluno) {
        this.codigoAluno = codigoAluno;
    }
}
