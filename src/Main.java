import model.Banco;
import model.Cliente;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Santander");
        Banco banco2 = new Banco("Santander2");
        Cliente cliente1 = new Cliente("Joaozin");
        Cliente cliente2 = new Cliente("Gabriel");

        ContaCorrente cc = banco.criarContaCorrente(cliente1);
        ContaPoupanca cp = banco.criarContaPoupanca(cliente2);
        ContaCorrente cc1 = banco2.criarContaCorrente(cliente1);
        ContaPoupanca cp1 = banco2.criarContaPoupanca(cliente2);

        cc.depositar(200);
        cc.transferir(150,cc1);
        cc1.sacar(50);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc1.imprimirExtrato();
        cp1.imprimirExtrato();


        banco.imprimirContas();
        banco2.imprimirContas();
    }
    
}
