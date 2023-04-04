package br.com.atividade2;

public interface Conta {
    public void depositar(double valor);
    public void sacar(double valor);
    double getSaldo();
}
