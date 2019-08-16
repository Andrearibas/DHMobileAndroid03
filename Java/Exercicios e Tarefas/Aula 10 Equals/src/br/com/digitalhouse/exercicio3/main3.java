package br.com.digitalhouse.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class main3 {
    public static void main(String[] args) {
        List<Aluno> listaAluno = new ArrayList<>();

        Aluno alunoUm = new Aluno("Joao",123456);
        listaAluno.add(alunoUm);

        Aluno alunoDois = new Aluno("Andrea", 654321);
        listaAluno.add(alunoDois);

        Aluno alunoTres = new Aluno("Maria", 234567);
        listaAluno.add(alunoTres);

        Aluno alunoQuatro = new Aluno("Fernando",123459);

        System.out.println("O numero do aluno "+alunoQuatro.getNome()+" está na lista de matriculados?\n"+listaAluno.contains(alunoQuatro));

    }
}
