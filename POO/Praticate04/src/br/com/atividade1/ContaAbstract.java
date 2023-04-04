package br.com.atividade1;

public abstract class ContaAbstract {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void imprimeExtrato();
}
