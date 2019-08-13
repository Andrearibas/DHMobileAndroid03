package br.digitalhouse.revisao;

public class Cliente extends Pessoa {
    private int codigo;


    public Cliente(String novoNome, Data novaNascimento, int novoCodigo) {
        super(novoNome, novaNascimento);
        codigo = novoCodigo;
    }

    @Override
    public void imprimeDados() {
        System.out.println(super.getNome()+"\n"
        +super.getNascimento().toString()
        +codigo);

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int novoCodigo) {
        codigo = novoCodigo;
    }
}
