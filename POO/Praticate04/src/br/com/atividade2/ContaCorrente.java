package br.com.atividade2;

public class ContaCorrente implements Conta{
    private double saldo;
    private double taxaoperacao = 0.45;

    @Override
    public void depositar(double valor) {
        this.saldo += valor - taxaoperacao;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor - taxaoperacao;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }
}
