package com.company.bank.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public abstract class Conta implements IConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    // Anotações Lombok GET e SET
    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    /*
    *  Implementado condição de saque ( Saldo deve ser suficiente para saque )
    *
    *  */
    @Override
    public void sacar(double valor) {
        if(getSaldo() > valor){
            valor -= saldo;
        }else{
            System.out.println("Operação inválida: Saque maior que o saldo!");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    /*
     *  Implementado condição de transferência ( saldo deve ser suficiente para transferência )
     *
     *  */

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if(getSaldo() >= valor){
        contaDestino.depositar(valor);
        saldo -= valor;
        }else{
            System.out.println("Operação inválida: Transferência maior que o saldo!");
        }
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
