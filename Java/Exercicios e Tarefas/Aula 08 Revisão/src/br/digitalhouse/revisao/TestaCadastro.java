package br.digitalhouse.revisao;

public class TestaCadastro {
    public static void main(String[] args) {

        Data novaData = new Data(10,8,2019);

        Cliente novoCliente = new Cliente("Joao", novaData, 234);

        novoCliente.imprimeDados();

        Funcionario novoFuncionario = new Funcionario("Maria",novaData,200);
        novoFuncionario.calculaImposto();
        novoFuncionario.imprimeDados();

        Gerente novoGerente = new Gerente("Jose",novaData,500,"Tecnologia");
        novoGerente.calculaImposto();
        novoGerente.imprimeDados();

        System.out.println("***********************************");

        CadastroPessoas novoCadastro = new CadastroPessoas();
        novoCadastro.cadastrarPessoa(novoCliente);
        novoCadastro.cadastrarPessoa(novoFuncionario);
        novoCadastro.cadastrarPessoa(novoGerente);
        novoCadastro.imprimeCadastro();


    }
}
