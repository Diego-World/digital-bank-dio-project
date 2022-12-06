package com.company.bank.model;

public class ContaCorrente extends Conta{

    // Taxa fixa de saque para contas corrente.
    private double taxaSaque = 2.50;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {
        saldo -= taxaSaque;
        saldo -= valor;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
