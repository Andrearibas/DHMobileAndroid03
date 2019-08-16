package br.com.digitalhouse.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class main4 {
    public static void main(String[] args) {

        List<Funcionario> listaDeFuncionarios = new ArrayList<>();
        listaDeFuncionarios.add(new Funcionario("Andrea",1234));
        listaDeFuncionarios.add(new Funcionario("Maria",3456));
        listaDeFuncionarios.add(new Funcionario("Karina",6789));
        listaDeFuncionarios.add(new Funcionario("Gil",4567));

        Funcionario joana = new Funcionario("Joana",1234);

        System.out.println("A funcionaria "+joana.getNome()+" já esta na lista de registro? \n"+listaDeFuncionarios.contains(joana.getNumeroDeRegistro()));
    }

}
