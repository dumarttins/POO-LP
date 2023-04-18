package br.com.newton.provaav1;

public class CartaoCredito extends Pagamento{
    private String numcartao;
    private String bandeiraCartao;
    private String titularcartao;

    public CartaoCredito(int numeroPagamento, double valorPago, String numcartao, String bandeiraCartao, String titularcartao) {
        super(numeroPagamento, valorPago);
        this.numcartao = numcartao;
        this.bandeiraCartao = bandeiraCartao;
        this.titularcartao = titularcartao;
    }

    public String getNumcartao() {
        return numcartao;
    }

    public void setNumcartao(String numcartao) {
        this.numcartao = numcartao;
    }

    public String getBandeiraCartao() {
        return bandeiraCartao;
    }

    public void setBandeiraCartao(String bandeiraCartao) {
        this.bandeiraCartao = bandeiraCartao;
    }

    public String getTitularcartao() {
        return titularcartao;
    }

    public void setTitularcartao(String titularcartao) {
        this.titularcartao = titularcartao;
    }

    public String imprimirCupomFiscal() {
        return "- Cartão de Crédito -\nHora Pagamento: " + getDataHoraPagamento() + "\nNúmero Pagamento: "+ getNumeroPagamento() + "\nValor Pago: " + getValorPago() + "\nNúmero Cartão: " + getNumcartao() + "\nBandeira Cartão: " + getBandeiraCartao() + "\nTitular Cartão: " + getTitularcartao();
    }
}
