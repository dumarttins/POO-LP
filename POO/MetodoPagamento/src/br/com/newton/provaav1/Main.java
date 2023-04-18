package br.com.newton.provaav1;

public class Main {
    public static void main(String[] args) {
        CartaoCredito cCredito = new CartaoCredito(23351, 1000, "12345", "MasterCard", "Robson Fonseca");
        Pix pPagamento = new Pix(1234, 100, true);
        CartaoDebito cDebito = new CartaoDebito(23549, 500, "885488", "Matheus Oliveira");

        System.out.println(cCredito.imprimirCupomFiscal());
        System.out.println("----------------------------");
        System.out.println(pPagamento.imprimirCupomFiscal());
        System.out.println("----------------------------");
        System.out.println(cDebito.imprimirCupomFiscal());
    }
}
