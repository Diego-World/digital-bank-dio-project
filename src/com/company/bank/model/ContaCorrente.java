package com.company.bank.model;

public class ContaCorrente extends Conta{

    // Taxa fixa de saque para contas corrente.
    private double taxaSaque = 2.50;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    //
    @Override
    public void sacar(double valor) {
        if(getSaldo() >= valor+taxaSaque){
            saldo -= taxaSaque;
            saldo -= valor;
        }else{
            System.out.println("Operação inválida: Saque maior que o saldo!");
        }
    }


    @Override
    public void imprimirExtrato() {
        System.out.println("=== Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
