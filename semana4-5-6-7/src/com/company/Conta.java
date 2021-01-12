package com.company;

public class Conta {
    private int numero;
    public double saldo;
    private double limite;

    public Conta(int numero){
        this.setNumero(numero);
        this.limite= 0.0;
        this.saldo=0.0;
    }

    public Conta(int numero, double saldo){
        this.setNumero(numero);
        this.setSaldo(saldo);
        this.limite=0.0;
    }

    public Conta(int numero, double saldo,double limite){
        this.setNumero(numero);
        this.setSaldo(saldo);
        this.setLimite(limite);
    }

    public void sacar(double valor){
        validaValor(valor);
        if (saldo <=limite){
            throw new IndexOutOfBoundsException("Passou do limite de "+ limite);
        }
        if (saldo <= valor) {
            saldo = saldo - valor;
        }
    }

    public void depositar(double valor){
        validaValor(valor);
        saldo = saldo + valor;
    }

    public void transferir(double valor, Conta conta){
        validaValor(valor);
        if (saldo <= valor) {
            saldo = saldo - valor;
            conta.saldo = conta.saldo + valor;
        }
    }
    private void validaValor(double valor){
        if (valor <=0){
            throw new IllegalArgumentException("Valor deve ser maior que 0");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        validaValor(limite);
        this.limite = limite * -1;
    }

}
