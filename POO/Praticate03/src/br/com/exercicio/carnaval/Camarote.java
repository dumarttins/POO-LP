package br.com.exercicio.carnaval;

public class Camarote extends Ingresso{
    private double  valorAddCamarote;
    private String localizacao;

    public Camarote(double valor, double valorAddCamarote, String localizacao) {
        super(valor);
        this.valorAddCamarote = valorAddCamarote;
        this.localizacao = localizacao;
    }

    public double getValorAddCamarote() {
        return valorAddCamarote;
    }

    public void setValorAddCamarote(double valorAddCamarote) {
        this.valorAddCamarote = valorAddCamarote;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String IngressoCamarote(){
        return "Ingresso Camarote: " + (getValor()+getValorAddCamarote()) + "\nLocalização: " + this.localizacao;
    }
}
