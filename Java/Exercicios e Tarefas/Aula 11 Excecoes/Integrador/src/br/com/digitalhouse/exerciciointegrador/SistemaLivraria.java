package br.com.digitalhouse.exerciciointegrador;

import java.util.*;

public class SistemaLivraria {
    private Map<Integer,Produto> estoque = new HashMap<>();
    private List<Produto> colecao = new ArrayList<>();
    Scanner scannerMenu = new Scanner(System.in);




    public SistemaLivraria() {

        Livro l1 = new Livro(25914,23.54F,5,"A Cabana","Young,William P.",1992,2591423);
        estoque.put(l1.getCodigo(),l1);

        Livro l2 = new Livro(25916,35.50F,10,"Amanhecer","Meyer,Stephenie",2015,2644004);
        estoque.put(l2.getCodigo(),l2);

        Livro l3 = new Livro(25917,42.50F,5,"Harry Potter e A Câmara Secreta","Rowling,J. K",1972,9738751);
        estoque.put(l3.getCodigo(),l3);

    }

    public int menu(){
        System.out.println("**********MENU************");
        System.out.println("1 - CADASTRAR LIVROS");
        System.out.println("2 - CONSULTAR LIVROS");
        System.out.println("3 - EFETUAR VENDA");

        int opcaoEscolhida = scannerMenu.nextInt();

        return opcaoEscolhida;

    }


    public void cadastrarLivro(Produto novoLivro){
        estoque.put(novoLivro.getCodigo(),novoLivro);
        System.out.println("*****************************");
        System.out.println("Livro cadastrado com sucesso!");
        System.out.println("*****************************");

    }

    public void consultarLivro(int codigo){

        Produto item = estoque.get(codigo);

        if (item == null){
            System.out.println("Livro não encontrado!");
            System.out.println("*****************************");
        }else {
            System.out.println(item);
            System.out.println("*****************************");
        }

    }
    public void efetuarVenda(int codigo){

        try {
            Produto livro = estoque.get(codigo);

            if ( livro.getQuantidadeEstoque() < 0){
                System.out.println("Livro sem estoque!");
                System.out.println("*****************************");
            } else {
                livro.setQuantidadeEstoque(livro.getQuantidadeEstoque()- 1);
                System.out.println("Venda realizada com sucesso!");
                System.out.println("Estoque atual: "+livro.getQuantidadeEstoque());
                System.out.println("*****************************");
            }

        }catch (NullPointerException e){
            System.out.println("Livro não encontrado");
            System.out.println("*****************************");

        }}





}
