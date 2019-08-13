package br.digitalhouse.listaexercicios;

public class Exercicios {

    public void maiorDeTresNumeros(Integer umNumeroA, Integer umNumeroB, Integer umNumeroC) {
        if (umNumeroA > umNumeroA && umNumeroA > umNumeroC) {
            System.out.println("O numero maior é: " + umNumeroA);
        } else if (umNumeroB > umNumeroA && umNumeroB > umNumeroC) {
            System.out.println("O numero maior é: " + umNumeroB);
        } else {
            System.out.println("O numero maior é: " + umNumeroC);
        }
    }

    public boolean cadeiaDeTextoDiferentes(String textoA, String textoB){
        if (textoA != textoB){
            System.out.println("O texto é diferente!");
            return true;
        }else
            System.out.println("O texto é igual");
            return false;
    }

    public boolean par(Integer umNumero){
        if (umNumero%2==0){
            System.out.println("O numero é par!");
            return true;
        }else
            System.out.println("O numero é impar");
            return false;
    }

    public void imprimaTela(){
        int contador = 1;

        for (int i = 0;i<200;i++){
            if (i%2!=0 && contador <=100){
                System.out.println(i);
                contador++;
            }
        }
    }

    public boolean algumMaior(Integer numA, Integer numB, Integer numC, Integer numD){
        return  numA>numC&&numA>numD||numB>numC&&numB>numD;

    }

}
