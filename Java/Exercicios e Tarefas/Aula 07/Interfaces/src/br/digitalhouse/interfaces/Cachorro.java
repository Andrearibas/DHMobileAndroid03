package br.digitalhouse.interfaces;

public class Cachorro extends Animal implements Saudavel {

    public Cachorro(String novaRaca){
        super(novaRaca);
    }


    @Override
    public boolean animalSaudavel(String diagnostico) {

        System.out.println("O cachoro "+getRaca()+ "está com o seguinte diagnostico "+diagnostico);

        return false;
    }

    @Override
    public int calculoIdadeAnimal(int novaIdade) {
        System.out.println("Estamos somando as idades");
        return getIdade() + novaIdade;
    }

    @Override
    public void seDivertir() {

    }
}
