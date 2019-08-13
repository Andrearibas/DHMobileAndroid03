package br.digitalhouse.exercicio;

public class Principal {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(1234,"Silva",444860861,3410011);
        Cliente cliente2 = new Cliente(4653,"Pereira",3458765,3545894);
        Cliente cliente3 = new Cliente(5465,"Ribas",7454394,34095435);


        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente1);
        contaPoupanca.depositar(1000);
        contaPoupanca.sacar(1200);
        contaPoupanca.sacar(900);
    }
}
