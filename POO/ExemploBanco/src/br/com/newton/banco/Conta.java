package br.com.newton.banco;

public class Conta {
    private int numeroConta;
    private double saldo;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public void sacar(double valor){
        if(valor<=this.saldo)
            this.saldo = this.saldo - valor;
    }
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }
}
