package br.digitalhouse.revisao;

public class Gerente extends Funcionario {
    private String area;

    public Gerente(String novoNome, Data novaNascimento, float novoSalario, String novaArea) {
        super(novoNome, novaNascimento, novoSalario);
        area = novaArea;
    }

    @Override
    public float calculaImposto() {
        float calImposto = (float) (super.getSalario()*0.05);
        return calImposto;

    }

    @Override
    public void imprimeDados() {
        //super.imprimeDados();
        float salarioComImposto = super.getSalario() - calculaImposto();
        System.out.println("O valor final do calculo é de: R$ "+salarioComImposto);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String novaArea) {
        area = novaArea;
    }
}
