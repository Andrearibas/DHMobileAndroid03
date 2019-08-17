package br.com.digitalhouse.atividadesaula;

public class main2 {
    public static void main(String[] args) {
        try {
            Pessoa pessoa = new Pessoa();
            System.out.println(pessoa.getRg()+0000);

        }catch (Exception ex){
            System.out.println("Ocorreu um erro: "+ex.getMessage());
            ex.printStackTrace();
        } finally { //*Esse bloco sempre acontece independete do try / catch, lembrando que é opcional.
            System.out.println("Aconteceu o print dentro do bloco finally");
        }




    }
}
