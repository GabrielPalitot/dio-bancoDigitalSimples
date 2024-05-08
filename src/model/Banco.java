package model;

import java.util.ArrayList;
import java.util.List;

public class Banco{
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }



    public ContaCorrente criarContaCorrente(Cliente cliente) {
       ContaCorrente cc = new ContaCorrente(cliente, this);
       this.contas.add(cc);
       return cc;
    }


    public ContaPoupanca criarContaPoupanca(Cliente cliente) {
        ContaPoupanca cp = new ContaPoupanca(cliente, this);
        this.contas.add(cp);
        return cp;
    }

    public void imprimirContas(){

        for(Conta conta : contas){
            String mensagem = String.format("Conta: %s, Agência: %s, Cliente: %s\n", conta.getNumero(),conta.getAgencia(), conta.getCliente().getNome());
            System.out.println(String.format("------------------ Banco %s ---------------", conta.getBanco()));
            System.out.println(mensagem);

        }
    }

    @Override
    public String toString() {
        return nome;
    }
}
