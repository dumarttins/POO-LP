package br.com.estoque;

public class Estoque {
    private int codProduto;
    private String nome;
    private int qtdAtual;
    private int qtdMinimo;

    public Estoque() {
    }

    public Estoque(int codProduto, String nome, int qtdAtual, int qtdMinimo) {
        this.codProduto = codProduto;
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinimo = qtdMinimo;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public void setQtdMinimo(int qtdMinimo) {
        this.qtdMinimo = qtdMinimo;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public int getQtdMinimo() {
        return qtdMinimo;
    }

    public void darBaixa(int qtd){
        if(qtd<=qtdAtual)
            qtdAtual -= qtd;
        else
            System.out.println("Estoque insuficiente para baixa");
    }
    public String mostra(){
        return  "Produto: "+ this.nome+ "\nQtde Minima: "+ this.qtdMinimo+ "\nQtde Atual: "+qtdAtual;
    }
    public boolean precisaRepor(){
        if (getQtdAtual()<=getQtdMinimo())
                return true;
        else
            return false;
    }
}
