package br.com.exercicio.carnaval;

public class VIP extends Ingresso{
    private double  valorAddVip;

    public VIP(double valor, double valorAddVip) {
        super(valor);
        this.valorAddVip = valorAddVip;
    }

    public double getValorAddVip() {
        return valorAddVip;
    }

    public void setValorAddVip(double valorAddVip) {
        this.valorAddVip = valorAddVip;
    }
    public String IngressoVip(){
        return "Ingresso VIP: " + (getValor()+getValorAddVip());
    }
}
