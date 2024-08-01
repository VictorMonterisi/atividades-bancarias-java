public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Victor");

        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente1);

        cc.depositar(150.0);
        cc.transferir(150.0, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cc.encerrarConta();
    }
}
