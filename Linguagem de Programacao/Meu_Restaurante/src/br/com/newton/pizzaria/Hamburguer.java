package br.com.newton.pizzaria;

public class Hamburguer {
     String nome;
     double valor;
     boolean artesanal;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calculaValor(double hamburguerE){
        this.valor += hamburguerE;
        return  this.valor;
    }
    public String getNome(){
        return nome;
    }
}
