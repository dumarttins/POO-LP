package br.com.exercicio.carnaval;

public class Normal extends Ingresso{
    public Normal(double valor) {
        super(valor);
    }
    public String IngressoNormal(){
        return "Ingresso Normal: " + getValor();
    }


}
