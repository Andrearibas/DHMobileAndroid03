package br.com.digitalhouse.exercicioentregavel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DigitalHouseManager {
    private Map<Integer, Aluno> listaDeAlunos = new  HashMap<>();
    private Map<Integer, Professor> listaDeProfessores = new HashMap<>();
    private Map<Integer, Curso> listaDeCursos = new HashMap<>();
    private Map<Integer, Matricula> listaDeMatriculas = new HashMap<>();


    public void registrarCurso(String nome, Integer codigoCurso, Integer qtdMaximaAlunos){
        Curso novoCurso = new Curso();
        novoCurso.setNomeCurso(nome);
        novoCurso.setCodigoCurso(codigoCurso);
        novoCurso.setQtdMaximaAluno(qtdMaximaAlunos);

        listaDeCursos.put(novoCurso.getCodigoCurso(),novoCurso);

        System.out.println("O curso "+nome+" foi criado e adicionado na lista. ");
    }

    public void excluirCurso(Integer codigoCurso){
        listaDeCursos.remove(listaDeCursos.get(codigoCurso));
        System.out.println("O curso de codigo "+codigoCurso+" foi excluido da lista.");
    }

    public void registrarProfessorAdjunto(String novoNomeProfAdjunto, String novoSobrenomeProfAdjunto, Integer novoCodProfAdjunto, Integer qtdHoras){
        ProfessoresAjuntos novoProfAdjunto = new ProfessoresAjuntos();
        novoProfAdjunto.setNomeProfessor(novoNomeProfAdjunto);
        novoProfAdjunto.setSobrenomeProfessor(novoSobrenomeProfAdjunto);
        novoProfAdjunto.setCodigoProfessor(novoCodProfAdjunto);
        novoProfAdjunto.setQtdHorasMonitoria(qtdHoras);
        novoProfAdjunto.setQtdHorasMonitoria(0);

        listaDeProfessores.put(novoProfAdjunto.getCodigoProfessor(),novoProfAdjunto);

        System.out.println("O novo Professor Adjunto, "+novoNomeProfAdjunto+" "+novoSobrenomeProfAdjunto+" foi registradp e adicionado na lista de professores.");

    }

    public void registrarProfessorTitular(String novoNomeProfTitular, String novoSobrenomeProfTitular, Integer novoCodigoProfTitutar, String especialidade){
        ProfessoresTitulares novoProfTitular = new ProfessoresTitulares();
        novoProfTitular.setNomeProfessor(novoNomeProfTitular);
        novoProfTitular.setSobrenomeProfessor(novoSobrenomeProfTitular);
        novoProfTitular.setCodigoProfessor(novoCodigoProfTitutar);
        novoProfTitular.setEspecialidade("Formado em Mobile");
        novoProfTitular.setTempoDeCasa(0);

        listaDeProfessores.put(novoProfTitular.getCodigoProfessor(),novoProfTitular);

        System.out.println("O novo Professor Titular, "+novoNomeProfTitular+" "+novoSobrenomeProfTitular+" foi registrado e adicionado na lista de professores.");
    }

    public void excluirProfessor(Integer codigoProfessor){
        listaDeProfessores.remove(codigoProfessor);
        System.out.println("O professor de codigo: "+codigoProfessor+",foi excluido da lista.");
    }

    public void registrarAluno(String novoNomeAluno, String novoSobrenomeAluno, Integer codigoAluno){
        Aluno novoAluno = new Aluno(novoNomeAluno,novoSobrenomeAluno, codigoAluno);
        listaDeAlunos.put(novoAluno.getCodigoAluno(),novoAluno);
        System.out.println("Aluno "+novoNomeAluno+" "+novoSobrenomeAluno+", registrado e adicionado a lista de Alunos com sucesso.");

    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){
       Curso curso = listaDeCursos.get(codigoCurso);
       Aluno aluno = listaDeAlunos.get(codigoAluno);

       curso.adicionarUmAluno(aluno);

    }

    public Map<Integer, Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(Map<Integer, Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public Map<Integer, Professor> getListaDeProfessores() {
        return listaDeProfessores;
    }

    public void setListaDeProfessores(Map<Integer, Professor> listaDeProfessores) {
        this.listaDeProfessores = listaDeProfessores;
    }

    public Map<Integer, Curso> getListaDeCursos() {
        return listaDeCursos;
    }

    public void setListaDeCursos(Map<Integer, Curso> listaDeCursos) {
        this.listaDeCursos = listaDeCursos;
    }

    public Map<Integer, Matricula> getListaDeMatriculas() {
        return listaDeMatriculas;
    }

    public void setListaDeMatriculas(Map<Integer, Matricula> listaDeMatriculas) {
        this.listaDeMatriculas = listaDeMatriculas;
    }
}
