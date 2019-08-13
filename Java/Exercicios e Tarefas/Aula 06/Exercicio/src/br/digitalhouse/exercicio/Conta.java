package br.digitalhouse.exercicio;

public abstract class Conta {
    private Cliente cliente;

    public Conta(Cliente novoCliente){
        cliente = novoCliente;
    }

    public abstract void depositar(float valorDepositado);

    public abstract void sacar(float valorSaque);

    public abstract  void consultar();

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
