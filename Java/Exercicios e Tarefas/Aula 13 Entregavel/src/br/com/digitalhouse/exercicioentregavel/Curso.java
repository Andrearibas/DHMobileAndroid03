package br.com.digitalhouse.exercicioentregavel;

import java.util.List;
import java.util.Objects;

public class Curso {
    private String nomeCurso;
    private Integer codigoCurso;
    private ProfessoresTitulares professoresTitulares;
    private ProfessoresAjuntos professoresAjuntos;
    private Integer qtdMaximaAluno;
    private List<Aluno> listaAlunosMatriculados;

    public boolean adicionarUmAluno(Aluno umAluno){

        if (listaAlunosMatriculados.size()<qtdMaximaAluno){
            listaAlunosMatriculados.add(umAluno);
            return true;
        }else{
            return false;
        }
    }

    public void excluirAluno(Aluno umAluno){
        try {
            listaAlunosMatriculados.remove(umAluno);
            System.out.println("Aluno removido da lista de matriculados.");
        }catch (Exception e){
            System.out.println("Aluno não encontrado na lista.");
        }

    }

    @Override
    public String toString() {
        return "Curso "+ nomeCurso + ", de codigo: " + codigoCurso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return codigoCurso.equals(curso.codigoCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoCurso);
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public ProfessoresTitulares getProfessoresTitulares() {
        return professoresTitulares;
    }

    public void setProfessoresTitulares(ProfessoresTitulares professoresTitulares) {
        this.professoresTitulares = professoresTitulares;
    }

    public ProfessoresAjuntos getProfessoresAjuntos() {
        return professoresAjuntos;
    }

    public void setProfessoresAjuntos(ProfessoresAjuntos professoresAjuntos) {
        this.professoresAjuntos = professoresAjuntos;
    }

    public Integer getQtdMaximaAluno() {
        return qtdMaximaAluno;
    }

    public void setQtdMaximaAluno(Integer qtdMaximaAluno) {
        this.qtdMaximaAluno = qtdMaximaAluno;
    }

    public List<Aluno> getListaAlunosMatriculados() {
        return listaAlunosMatriculados;
    }

    public void setListaAlunosMatriculados(List<Aluno> listaAlunosMatriculados) {
        this.listaAlunosMatriculados = listaAlunosMatriculados;
    }
}
