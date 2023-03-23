package br.com.newton.pizzaria;

public class Pizza {
     String nome;
     double valor;
     boolean possuiBorda;

    public double calculaValor(boolean possuiBorda){
        if(possuiBorda)
            return valor + 5.00;
        return valor;
    }
    public String nomePizza(String nome){
        this.nome = nome;
        return  this.nome;
    }

}
