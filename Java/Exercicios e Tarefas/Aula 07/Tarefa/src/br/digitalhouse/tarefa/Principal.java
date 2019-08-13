package br.digitalhouse.tarefa;

public class Principal {
    public static void main(String[] args) {

        Contrato contrato = new Contrato();
        Foto foto = new Foto();
        Documento documento = new Documento();

        Impressora impressora = new Impressora();

        impressora.adicionarImprimivel(contrato);
        impressora.adicionarImprimivel(foto);
        impressora.adicionarImprimivel(documento);

        impressora.imprimirTudo();

    }
}
