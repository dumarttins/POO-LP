package br.com.newton.provaav1;

public class Pix extends Pagamento{
    private boolean comprovanteTransacao;

    public Pix(int numeroPagamento, double valorPago, boolean comprovanteTransacao) {
        super(numeroPagamento, valorPago);
        this.comprovanteTransacao = comprovanteTransacao;
    }

    public boolean isComprovanteTransacao() {
        return comprovanteTransacao;
    }

    public void setComprovanteTransacao(boolean comprovanteTransacao) {
        this.comprovanteTransacao = comprovanteTransacao;
    }

    public String imprimirCupomFiscal() {
        return "- PIX -\nHora Pagamento: " + getDataHoraPagamento() + "\nNúmero Pagamento: "+ getNumeroPagamento() + "\nValor Pago: " + getValorPago() + "\nComprovanete da Transação: " + isComprovanteTransacao();
    }
}
