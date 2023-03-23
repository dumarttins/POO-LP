package br.com.estoque;

public class Main {
    public static void main(String[] args) {
        Estoque e1 = new Estoque();
        e1.setNome("Caneta");
        e1.setQtdAtual(10);
        e1.setQtdMinimo(5);
        System.out.println(e1.mostra());
        Estoque e2 = new Estoque(120, "Lápis", 20, 15);
        e2.darBaixa(10);
        System.out.println("Estoque atual: "+e2.getQtdAtual());
        e2.darBaixa(1000);
        System.out.println(e2.precisaRepor());
    }
}
