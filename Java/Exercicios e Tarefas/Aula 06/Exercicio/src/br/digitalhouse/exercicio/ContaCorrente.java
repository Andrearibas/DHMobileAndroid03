package br.digitalhouse.exercicio;

public class ContaCorrente extends Conta {
    private float saldo;
    private float limiteChequeEspecial;

    public ContaCorrente(Cliente novoCliente) {
        super(novoCliente);
    }


    @Override
    public void depositar(float valorDepositado) {
        saldo = saldo+valorDepositado;

    }

    @Override
    public void sacar(float valorSaque) {
        if (valorSaque<=saldo){
            saldo = saldo-valorSaque;
            System.out.println("Saque no valor de R$ "+valorSaque+", realizado com sucesso!");
            System.out.println("Seu novo saldo é R$ "+saldo);
        }else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void consultar() {
        System.out.println("Seu saldo é de R$ "+saldo);
    }

    public void depositarChegue(){

    }
}
