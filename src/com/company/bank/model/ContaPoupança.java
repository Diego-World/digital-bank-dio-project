package com.company.bank.model;

public class ContaPoupança extends Conta{

    public ContaPoupança(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
