package br.com.digitalhouse.exerciciointegrador;

import java.util.List;

public class ColecaoDeLivros extends Produto {
    private List<Livro> listaLivros;
    private String descricaoColecao;


    public ColecaoDeLivros(int codigo, float preco, int quantidadeEstoque, List<Livro> listaLivros, String descricaoColecao) {
        super(codigo, preco, quantidadeEstoque);
        this.listaLivros = listaLivros;
        this.descricaoColecao = descricaoColecao;
    }

    public List<Livro> getListaLivros() {
        return listaLivros;
    }

    public void setListaLivros(List<Livro> listaLivros) {
        this.listaLivros = listaLivros;
    }

    public String getDescricaoColecao() {
        return descricaoColecao;
    }

    public void setDescricaoColecao(String descricaoColecao) {
        this.descricaoColecao = descricaoColecao;
    }

    @Override
    public String toString() {
        return "Coleção: " + descricaoColecao;
    }
}
