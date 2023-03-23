package br.com.newton.banco;
import br.com.newton.banco.Conta_Corrente;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int numero;
        double saldo, limite,rendimento;
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Banco:\n<1>Conta Corrente\n<2>Conta Poupança\n<3>Sair\n"));
        switch (opcao){
            case 1:
                numero = Integer.parseInt(JOptionPane.showInputDialog("Numero da conta:"));
                saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo:"));
                limite = Double.parseDouble(JOptionPane.showInputDialog("Limite:"));
                Conta_Corrente cc1 = new Conta_Corrente(numero,saldo,limite);
                JOptionPane.showMessageDialog(null,"SALDO:"+cc1.getSaldo()+"\nSaldo com o limite: "+cc1.consultaSaldoTotal(),"Conta Corrente",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                numero = Integer.parseInt(JOptionPane.showInputDialog("Numero da conta:"));
                saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo:"));
                rendimento = Double.parseDouble(JOptionPane.showInputDialog("Rendimento:"));
                Conta_Poupanca cp1 = new Conta_Poupanca(numero,saldo,rendimento);
                cp1.atualizaRendimento();
                JOptionPane.showMessageDialog(null,"SALDO:"+cp1.getSaldo(),"Conta Poupança",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                break;
            default:
                JOptionPane.showMessageDialog(null,"Escolha invalida","ERRO",JOptionPane.ERROR);
        }






    }
}