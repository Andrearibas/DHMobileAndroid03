package br.com.digitalhouse.exercicioentregavel;

import java.util.Date;
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

        System.out.println("****************************** REGISTRO DE CURSO *********************************");
        System.out.println("Curso de "+nome+", criado e adicionado na lista de cursos. ");
        System.out.println("\n");

    }

    public void excluirCurso(Integer codigoCurso){
        listaDeCursos.remove(listaDeCursos.get(codigoCurso));

        System.out.println("************************** EXCLUIR CURSO ******************************");
        System.out.println("Curso de codigo: "+codigoCurso+", excluido da lista.");
        System.out.println("\n");
    }

    public void registrarProfessorAdjunto(String novoNomeProfAdjunto, String novoSobrenomeProfAdjunto, Integer novoCodProfAdjunto, Integer qtdHoras){
        ProfessoresAjuntos novoProfAdjunto = new ProfessoresAjuntos();
        novoProfAdjunto.setNomeProfessor(novoNomeProfAdjunto);
        novoProfAdjunto.setSobrenomeProfessor(novoSobrenomeProfAdjunto);
        novoProfAdjunto.setCodigoProfessor(novoCodProfAdjunto);
        novoProfAdjunto.setQtdHorasMonitoria(qtdHoras);
        novoProfAdjunto.setQtdHorasMonitoria(0);

        listaDeProfessores.put(novoProfAdjunto.getCodigoProfessor(),novoProfAdjunto);

        System.out.println("************************ REGISTRO DE PROFESSOR ADJUNTO ****************************");
        System.out.println("Professor(a) "+novoNomeProfAdjunto+" "+novoSobrenomeProfAdjunto+", registrado(a) e adicionado(a) na lista de professores Adjuntos.");
        System.out.println("\n");

    }

    public void registrarProfessorTitular(String novoNomeProfTitular, String novoSobrenomeProfTitular, Integer novoCodigoProfTitutar, String especialidade){
        ProfessoresTitulares novoProfTitular = new ProfessoresTitulares();
        novoProfTitular.setNomeProfessor(novoNomeProfTitular);
        novoProfTitular.setSobrenomeProfessor(novoSobrenomeProfTitular);
        novoProfTitular.setCodigoProfessor(novoCodigoProfTitutar);
        novoProfTitular.setEspecialidade(especialidade);
        novoProfTitular.setTempoDeCasa(0);

        listaDeProfessores.put(novoProfTitular.getCodigoProfessor(),novoProfTitular);

        System.out.println("************************ REGISTRO DE PROFESSOR TITULAR ****************************");
        System.out.println("Professor(a) "+novoNomeProfTitular+" "+novoSobrenomeProfTitular+", registrado(a) e adicionado(a) na lista de professores Titulares.");
        System.out.println("\n");
    }

    public void excluirProfessor(Integer codigoProfessor){
        listaDeProfessores.remove(codigoProfessor);
        System.out.println("************************** EXCLUIR PROFESSOR ******************************");
        System.out.println("Professor(a) de codigo: "+codigoProfessor+", excluido(a) da lista.");
        System.out.println("\n");

    }

    public void registrarAluno(String novoNomeAluno, String novoSobrenomeAluno, Integer codigoAluno){
        Aluno novoAluno = new Aluno(novoNomeAluno,novoSobrenomeAluno, codigoAluno);
        listaDeAlunos.put(novoAluno.getCodigoAluno(),novoAluno);
        System.out.println("************************** REGISTRO DE ALUNO ******************************");
        System.out.println("Aluno(a) "+novoNomeAluno+" "+novoSobrenomeAluno+", registrado(a) com sucesso.");
        System.out.println("\n");

    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){
       Curso curso = listaDeCursos.get(codigoCurso);
       Aluno aluno = listaDeAlunos.get(codigoAluno);
       Date data = new Date();

        System.out.println("************************** MATRICULAR ALUNO ******************************");

       if (curso.adicionarUmAluno(aluno)){
           Matricula novaMatricula = new Matricula(aluno,curso,data);
           listaDeMatriculas.put(aluno.getCodigoAluno(),novaMatricula);
           System.out.println("Aluno(a) "+aluno.getNome()+ " "+aluno.getSobrenome()+ ", matriculado(a) no curso de "+curso.getNomeCurso()+".");
           System.out.println("\n");
       }else {
           System.out.println("Matricula não pode ser realizada, curso com vagas esgotadas.");
           System.out.println("\n");
       }

    }

    public void alocarProfessores(Integer codigoCurso, Integer codProfTitular, Integer codProfAdjunto){
        ProfessoresTitulares novoProfTitular = (ProfessoresTitulares) getListaDeProfessores().get(codProfTitular);
        ProfessoresAjuntos novoProfessoresAjuntos = (ProfessoresAjuntos) getListaDeProfessores().get(codProfAdjunto);
        Curso curso = listaDeCursos.get(codigoCurso);

        curso.setProfessoresTitulares(novoProfTitular);
        curso.setProfessoresAjuntos(novoProfessoresAjuntos);

        System.out.println("***************************** ALOCAR PROFESSORES ********************************");

        System.out.println("Professor Titular "+novoProfTitular.getNomeProfessor()+" e Professor Adjunto "+novoProfessoresAjuntos.getNomeProfessor()+", alocado no "+curso.toString()+", com sucesso.");
        System.out.println("\n");

    }

    public void consultarAluno(Integer codigoAluno){
        System.out.println("**************************CONSULTAR ALUNO*******************************");

        try {Matricula alunoMatriculado = getListaDeMatriculas().get(codigoAluno);
            System.out.println(alunoMatriculado.getAluno()+", matriculado(a) no "+alunoMatriculado.getCurso());
            System.out.println("\n");

        } catch (Exception e){
            System.out.println("Aluno(a) não matriculado(a).");
            System.out.println("\n");
        }

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
