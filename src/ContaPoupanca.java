public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("\n\n### Extrato Conta Poupança ###");
        super.informacoesParaExtrato();
    }

    public void encerrarConta() {
        System.out.println("\n\n### Encerramento Conta Poupança ###");
        super.validacaoEncerramento();
    }
}
