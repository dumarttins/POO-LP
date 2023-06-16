package br.com.sorveteria.classes;

public class Pedido {
    private double valorPedido;
    private int idPedido;

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public double valorTotalP(String tamanho, double acrescimoVal){
        double tamanhoVal = 0;
        if(tamanho.equals("300ml"))
            tamanhoVal = 8;
        else if(tamanho.equals("500ml"))
            tamanhoVal = 10;
        else if(tamanho.equals("700ml"))
            tamanhoVal = 12;
        
        return tamanhoVal + acrescimoVal;
    }
}
