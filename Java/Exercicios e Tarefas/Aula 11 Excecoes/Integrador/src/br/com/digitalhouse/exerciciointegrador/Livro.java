package br.com.digitalhouse.exerciciointegrador;

public class Livro extends Produto{
    private String titutoLivro;
    private String autorLivro;
    private int anoLancamentoLivro;
    private int codigoISBN;


    public Livro(int codigo, float preco, int quantidadeEstoque, String titutoLivro, String autorLivro, int anoLancamentoLivro, int codigoISBN) {
        super(codigo, preco, quantidadeEstoque);
        this.titutoLivro = titutoLivro;
        this.autorLivro = autorLivro;
        this.anoLancamentoLivro = anoLancamentoLivro;
        this.codigoISBN = codigoISBN;
    }

    public String getTitutoLivro() {
        return titutoLivro;
    }

    public void setTitutoLivro(String titutoLivro) {
        this.titutoLivro = titutoLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public int getAnoLancamentoLivro() {
        return anoLancamentoLivro;
    }

    public void setAnoLancamentoLivro(int anoLancamentoLivro) {
        this.anoLancamentoLivro = anoLancamentoLivro;
    }

    public int getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN(int codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    @Override
    public String toString() {
        return "Livro: " + titutoLivro +
                "\nAutor: " + autorLivro +
                "\nAno de Lancamento:" + anoLancamentoLivro +
                "\nCodigo ISBN: " + codigoISBN;
    }
}
