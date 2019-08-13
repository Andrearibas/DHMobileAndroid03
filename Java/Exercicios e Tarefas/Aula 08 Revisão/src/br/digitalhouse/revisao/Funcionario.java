package br.digitalhouse.revisao;

public class Funcionario extends Pessoa implements Imposto{
    private float salario;
    private float porcentagem;

    public Funcionario(String novoNome, Data novaNascimento, float novoSalario) {
        super(novoNome, novaNascimento);
        salario = novoSalario;
    }


    @Override
    public float calculaImposto() {
        float calImposto = (float) (salario*0.03);
        return calImposto;
    }

    @Override
    public void imprimeDados() {
        System.out.println(super.getNome()+"\n"
                +super.getNascimento().getDia()+"/"
                +super.getNascimento().getMes()+"/"
                +super.getNascimento().getAno()
                +"\n"
                +salario);
        float salarioComImposto = salario - calculaImposto();
        System.out.println("O valor final do calculo é de: R$ "+salarioComImposto);

    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float novoSalario) {
        salario = novoSalario;
    }


}
