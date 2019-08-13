package br.digitalhouse.listaexercicios;

public class Principal {
    public static void main(String[] args) {
        Exercicios exercicios = new Exercicios();

        exercicios.imprimaTela();
        System.out.println("*****************************");

        exercicios.cadeiaDeTextoDiferentes("AB","BC");
        System.out.println("*****************************");

        exercicios.par(5);
        System.out.println("*****************************");

        exercicios.maiorDeTresNumeros(5,2,7);
        System.out.println("*****************************");


        boolean exec =  exercicios.algumMaior(10,8,6,7);
        System.out.println(exec);

    }
}
