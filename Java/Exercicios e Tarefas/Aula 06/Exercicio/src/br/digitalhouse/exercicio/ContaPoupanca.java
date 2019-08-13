package br.digitalhouse.exercicio;

public class ContaPoupanca extends Conta{
    private float saldo;
    private float taxaJuros;

    public ContaPoupanca(Cliente novoCliente) {
        super(novoCliente);
    }

    @Override
    public void depositar(float valorDepositado) {
        System.out.println("Deposito de R$ "+valorDepositado+", realizado com sucesso.");
        saldo = saldo+valorDepositado;
        System.out.println("Seu saldo é de R$ "+saldo);

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

    public void recolherJuros(){

    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(float taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
}
