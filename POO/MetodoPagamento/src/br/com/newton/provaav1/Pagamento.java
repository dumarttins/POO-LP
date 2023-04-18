package br.com.newton.provaav1;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import  java.util.Date;

public abstract class Pagamento {
    private String dataHoraPagamento;
    private int numeroPagamento;
    private double valorPago;

    public Pagamento(int numeroPagamento, double valorPago) {
        this.dataHoraPagamento = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
        this.numeroPagamento = numeroPagamento;
        this.valorPago = valorPago;
    }

    public Pagamento() {
    }

    public String getDataHoraPagamento() {
        return dataHoraPagamento;
    }

    public void setDataHoraPagamento(String dataHoraPagamento) {
        this.dataHoraPagamento = dataHoraPagamento;
    }

    public int getNumeroPagamento() {
        return numeroPagamento;
    }

    public void setNumeroPagamento(int numeroPagamento) {
        this.numeroPagamento = numeroPagamento;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public abstract String imprimirCupomFiscal();
}
