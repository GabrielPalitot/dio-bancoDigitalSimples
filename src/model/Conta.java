package model;


public abstract class Conta implements IConta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected Banco banco;

    private static final int AGENCIA_PADRAO = 123;
    private static int SEQUENCIAL = 1; 



    public Conta(Cliente cliente, Banco banco){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.banco = banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns(){
        System.out.println(String.format("SEJA BEM VINDO AO BANCO:%s", this.banco.getNome()));
        System.out.println(String.format("Essa Conta Pertence a: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f",this.saldo));
    }


    @Override
    public void sacar(double valor) {
        if (this.saldo > valor ) {
            this.saldo -= valor;
        }else{
            System.out.println("Valor Insuficiente para Saque!");
        }
    }
    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (this.saldo > valor || contaDestino != null) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

}
