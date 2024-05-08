package model;

public class ContaPoupanca extends Conta {

    
    protected ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    public void imprimirExtrato(){
        System.out.println("========= EXTRATO CONTA POUPANÇA ========");
        super.imprimirInfosComuns();
    }
}
