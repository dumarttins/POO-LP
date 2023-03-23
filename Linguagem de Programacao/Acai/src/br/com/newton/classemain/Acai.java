package br.com.newton.classemain;

public class Acai {
    private double tamanho;
    private double valor;
    private boolean acrescimoSorvet;

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setAcrescimoSorvet(boolean acrescimoSorvet) {
        this.acrescimoSorvet = acrescimoSorvet;
    }

    public void calculaValor() {
        if (this.acrescimoSorvet) {
            this.valor = this.valor + 2;
        }

    }
}
