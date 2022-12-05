public interface IConta{

    // Schedule job metodo Deposito!!!
    // Try Catchs

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta contaDestino);

    void imprimirExtrato();
}
