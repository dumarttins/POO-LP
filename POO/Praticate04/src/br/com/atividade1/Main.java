package br.com.atividade1;

public class Main {
    public static void main(String[] args) {
        ContaAbstract cp = new ContaPoupanca();
        cp.setSaldo(2121);
        cp.imprimeExtrato();
    }
}
