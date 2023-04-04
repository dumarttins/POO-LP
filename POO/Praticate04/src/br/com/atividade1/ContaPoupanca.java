package br.com.atividade1;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends ContaAbstract{

    public void imprimeExtrato(){
        System.out.println("## Extrato da Conta ##");

        SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
        Date date = new Date();

        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Data: "+sdt.format(date));
    }
}
