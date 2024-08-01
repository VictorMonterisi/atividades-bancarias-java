public interface AcoesConta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta cliente);

    void imprimirExtrato();

    void encerrarConta();
}