public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("\n\n### Extrato Conta Corrente ###");
        super.informacoesParaExtrato();
    }

    public void encerrarConta() {
        System.out.println("\n\n### Encerramento Conta Corrente ###");
        super.validacaoEncerramento();
    }
}