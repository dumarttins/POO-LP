package br.com.newton.provaav1;

public class CartaoDebito extends Pagamento{
    private String numCartao;
    private String titularcartao;

    public CartaoDebito(int numeroPagamento, double valorPago, String numCartao, String titularcartao) {
        super(numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.titularcartao = titularcartao;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getTitularcartao() {
        return titularcartao;
    }

    public void setTitularcartao(String titularcartao) {
        this.titularcartao = titularcartao;
    }

    public String imprimirCupomFiscal() {
        return "- Cartão de Crédito -\nHora Pagamento: " + getDataHoraPagamento() + "\nNúmero Pagamento: "+ getNumeroPagamento() + "\nValor Pago: " + getValorPago() + "\nNúmero Cartão: " + getNumCartao() + "\nTitular Cartão: " + getTitularcartao();
    }
}
