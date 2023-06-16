package br.com.sorveteria.classes;

public class Sorvete {
    private double valor;
    private double peso;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double calculaPreco(){
        double valor = this.peso * 0.05;
        return valor;
    }

}
