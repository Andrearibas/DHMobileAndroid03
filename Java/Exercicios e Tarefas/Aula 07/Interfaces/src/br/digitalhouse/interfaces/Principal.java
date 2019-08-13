package br.digitalhouse.interfaces;

public class Principal {
    public static void main(String[] args) {

        Cachorro novoCachorro = new Cachorro("Golden");

        novoCachorro.animalSaudavel("deu bom!");

        novoCachorro.setIdade(10);

        int idadeAnimal = novoCachorro.calculoIdadeAnimal(90);
        System.out.println("A idade é "+idadeAnimal);
    }
}
