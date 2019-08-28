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

        System.out.println("Curso "+nome+", criado e adicionado na lista. ");
        System.out.println("******************************************");
    }

    public void excluirCurso(Integer codigoCurso){
        listaDeCursos.remove(listaDeCursos.get(codigoCurso));
        System.out.println("Curso de codigo: "+codigoCurso+", excluido da lista.");
        System.out.println("******************************************");
    }

    public void registrarProfessorAdjunto(String novoNomeProfAdjunto, String novoSobrenomeProfAdjunto, Integer novoCodProfAdjunto, Integer qtdHoras){
        ProfessoresAjuntos novoProfAdjunto = new ProfessoresAjuntos();
        novoProfAdjunto.setNomeProfessor(novoNomeProfAdjunto);
        novoProfAdjunto.setSobrenomeProfessor(novoSobrenomeProfAdjunto);
        novoProfAdjunto.setCodigoProfessor(novoCodProfAdjunto);
        novoProfAdjunto.setQtdHorasMonitoria(qtdHoras);
        novoProfAdjunto.setQtdHorasMonitoria(0);

        listaDeProfessores.put(novoProfAdjunto.getCodigoProfessor(),novoProfAdjunto);

        System.out.println("Professor(a) Adjunto "+novoNomeProfAdjunto+" "+novoSobrenomeProfAdjunto+", foi registradp(a) e adicionado(a) na lista de professores.");
        System.out.println("******************************************");

    }

    public void registrarProfessorTitular(String novoNomeProfTitular, String novoSobrenomeProfTitular, Integer novoCodigoProfTitutar, String especialidade){
        ProfessoresTitulares novoProfTitular = new ProfessoresTitulares();
        novoProfTitular.setNomeProfessor(novoNomeProfTitular);
        novoProfTitular.setSobrenomeProfessor(novoSobrenomeProfTitular);
        novoProfTitular.setCodigoProfessor(novoCodigoProfTitutar);
        novoProfTitular.setEspecialidade("Formado em Mobile");
        novoProfTitular.setTempoDeCasa(0);

        listaDeProfessores.put(novoProfTitular.getCodigoProfessor(),novoProfTitular);

        System.out.println("Professor(a) Titular "+novoNomeProfTitular+" "+novoSobrenomeProfTitular+", foi registrado(a) e adicionado(a) na lista de professores.");
        System.out.println("******************************************");
    }

    public void excluirProfessor(Integer codigoProfessor){
        listaDeProfessores.remove(codigoProfessor);
        System.out.println("Professor(a) de codigo: "+codigoProfessor+",foi excluido(a) da lista.");
        System.out.println("******************************************");
    }

    public void registrarAluno(String novoNomeAluno, String novoSobrenomeAluno, Integer codigoAluno){
        Aluno novoAluno = new Aluno(novoNomeAluno,novoSobrenomeAluno, codigoAluno);
        listaDeAlunos.put(novoAluno.getCodigoAluno(),novoAluno);
        System.out.println("Aluno(a) "+novoNomeAluno+" "+novoSobrenomeAluno+", registrado e adicionado na lista de Alunos.");
        System.out.println("******************************************");

    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){
       Curso curso = listaDeCursos.get(codigoCurso);
       Aluno aluno = listaDeAlunos.get(codigoAluno);
       Date data = new Date();

       if (curso.adicionarUmAluno(aluno)){
           Matricula novaMatricula = new Matricula(aluno,curso,data);
           listaDeMatriculas.put(aluno.getCodigoAluno(),novaMatricula);
           System.out.println("O Aluno(a) "+aluno.getNome()+", foi matriculado(a) no curso de "+curso.getNomeCurso()+".");
           System.out.println("******************************************");
       }else {
           System.out.println("Matricula não pode ser realizada, limite de vagas esgotado.");
           System.out.println("******************************************");
       }

    }

    public void alocarProfessores(Integer codigoCurso, Integer codProfTitular, Integer codProfAdjunto){
        ProfessoresTitulares novoProfTitular = (ProfessoresTitulares) getListaDeProfessores().get(codProfTitular);
        ProfessoresAjuntos novoProfessoresAjuntos = (ProfessoresAjuntos) getListaDeProfessores().get(codProfAdjunto);
        Curso curso = listaDeCursos.get(codigoCurso);

        curso.setProfessoresTitulares(novoProfTitular);
        curso.setProfessoresAjuntos(novoProfessoresAjuntos);

        System.out.println("Professor Titular "+novoProfTitular.getNomeProfessor()+" e Adjunto "+novoProfessoresAjuntos.getNomeProfessor()+", alocado no "+curso.toString()+", com sucesso.");
        System.out.println("******************************************");

    }

    public void consultarAluno(Integer codigoAluno){
        if (listaDeAlunos.containsKey(codigoAluno)){
            int num = 0;

            for (int i = 0; i<listaDeMatriculas.size();i++){

                if (listaDeMatriculas.get(i).getAluno().getCodigoAluno().equals(codigoAluno)){
                    System.out.println("Aluno "+listaDeMatriculas.get(i).getAluno().getNome()+"esta matriculado no curso: "+listaDeMatriculas.get(i).getCurso().getNomeCurso());
                    num = num +1;

                }
            }if (num ==0){
                System.out.println("Aluno "+listaDeAlunos.get(codigoAluno).getNome()+" com o codigo "+codigoAluno+" não está matriculado em nenhum curso");
            }else {
                System.out.println("Aluno não encontrado no sistema!");
            }
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
