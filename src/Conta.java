import lombok.Getter;

public abstract class Conta implements AcoesConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    @Getter protected int agencia = 1;
    @Getter protected int numero;
    @Getter protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        if (this.saldo > 0.0 && this.saldo >= valor) {
            this.saldo -= valor;
        }

    }

    public void depositar(double valor) {
        if (valor > 0.0) {
            this.saldo += valor;
        }

    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void informacoesParaExtrato() {
        System.out.printf("\nTitular: %s", this.cliente.getNome());
        System.out.printf("\nAgência: %d", this.agencia);
        System.out.printf("\nNúmero: %d", this.numero);
        System.out.printf("\nSaldo %.2f", this.saldo);
    }

    protected void validacaoEncerramento() {
        if (this.saldo > 0.0) {
            System.out.println("\nNão será possível encerrar a conta: O cliente possui saldo.");
        } else {
            System.out.println("\nEncerrando a conta número " + this.getNumero() + " de: " + this.cliente.getNome());
        }

    }
}