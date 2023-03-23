package br.com.newton.banco;

public class Conta_Poupanca extends Conta{
    private double rendimento;

    public Conta_Poupanca(int numeroConta, double saldo, double rendimento) {
        super(numeroConta, saldo);
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
    public void atualizaRendimento(){
        double atual;
        atual = getSaldo()+(getSaldo()*(this.rendimento/100));
        setSaldo(atual);
    }
}
