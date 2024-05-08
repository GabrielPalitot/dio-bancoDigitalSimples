package model;

public class ContaCorrente extends Conta {

    protected ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    public void imprimirExtrato(){
        System.out.println("========= EXTRATO CONTA CORRENTE ========");
        super.imprimirInfosComuns();
    }
}
