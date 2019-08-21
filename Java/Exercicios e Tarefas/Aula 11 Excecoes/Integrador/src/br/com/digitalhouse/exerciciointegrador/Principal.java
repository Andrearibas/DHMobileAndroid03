package br.com.digitalhouse.exerciciointegrador;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        SistemaLivraria livraria = new SistemaLivraria();

        Scanner qtdCadastrado = new Scanner(System.in);

        Scanner scannerCodigo = new Scanner(System.in);
        Scanner scannerPreco = new Scanner(System.in);
        Scanner scannerQtd = new Scanner(System.in);
        Scanner scannerTitulo = new Scanner(System.in);
        Scanner scannerAutor = new Scanner(System.in);
        Scanner scannerAnoLancamento = new Scanner(System.in);
        Scanner scannerCodISBN= new Scanner(System.in);

        int opcaoMenu = livraria.menu();

        if (opcaoMenu == 1 || opcaoMenu ==2 || opcaoMenu ==3){
            if (opcaoMenu ==1){
                System.out.println("Quantos livros você deseja cadastra? ");
                int qtdCadastrada = qtdCadastrado.nextInt();

                for (int i = 0; i<qtdCadastrada; i++){
                    System.out.println("Forneça as informações do "+(i+1)+"º livro: \n");

                    System.out.println("Digite o codigo do livro: ");
                    int codigoIn = scannerCodigo.nextInt();

                    System.out.println("Digite o Preço do livro: ");
                    int precoIn = scannerPreco.nextInt();

                    System.out.println("Digite a quantidade de livros: ");
                    int qtdIn = scannerQtd.nextInt();

                    System.out.println("Digite o titulo de livros: ");
                    String tituloIn = scannerTitulo.next();

                    System.out.println("Digite o nome do autor de livros: ");
                    String autorIn = scannerAutor.next();

                    System.out.println("Digite o ano de lançamento do livro: ");
                    int anoLancamentoInt = scannerAnoLancamento.nextInt();

                    System.out.println("Digite o codigo ISBN do livro: ");
                    int codISBNIn = scannerCodISBN.nextInt();

                    Livro novoLivro = new Livro(codigoIn,precoIn,qtdIn,tituloIn,autorIn,anoLancamentoInt,codISBNIn);

                    livraria.cadastrarLivro(novoLivro);

                }
                livraria.menu();
            } if (opcaoMenu == 2){
                System.out.println("Digite o codigo do produto que deseja consultar: ");
                int codigoIn = scannerCodigo.nextInt();
                livraria.consultarLivro(codigoIn);
                livraria.menu();
            }
            if (opcaoMenu ==3){
                System.out.println("Digite o codigo do produto que desejar realizar a venda: ");
                int codigoIn = scannerCodigo.nextInt();
                livraria.efetuarVenda(codigoIn);
                livraria.menu();
            }
        } else {
            System.out.println("A opção escolhida não é valida, tente novamente!");
            livraria.menu();
        }


    }
}
