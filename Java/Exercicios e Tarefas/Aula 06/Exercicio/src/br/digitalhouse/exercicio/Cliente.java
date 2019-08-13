package br.digitalhouse.exercicio;

public class Cliente {
    private int numeroCliente;
    private String sobrenomeCliente;
    private int RG;
    private int CPF;

    public Cliente(int novoNumeroCliente, String novoSobrenomeCliente, int novoRG, int novoCPF){
        numeroCliente =  novoNumeroCliente;
        sobrenomeCliente = novoSobrenomeCliente;
        RG = novoRG;
        CPF = novoCPF;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getSobrenomeCliente() {
        return sobrenomeCliente;
    }

    public void setSobrenomeCliente(String sobrenomeCliente) {
        this.sobrenomeCliente = sobrenomeCliente;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
}
