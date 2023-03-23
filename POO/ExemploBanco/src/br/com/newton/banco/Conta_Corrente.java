package br.com.newton.banco;

public class Conta_Corrente extends Conta{
    private double limite;

    public Conta_Corrente(int numeroConta, double saldo, double limite) {
        super(numeroConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    public double consultaSaldoTotal(){
        return getSaldo() + this.limite;
    }
}
