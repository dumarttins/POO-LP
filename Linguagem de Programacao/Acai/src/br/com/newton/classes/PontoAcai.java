package br.com.newton.classes;
import br.com.newton.classemain.Acai;
import javax.swing.JOptionPane;

public class PontoAcai {
    public static void main(String[] args) {
        Acai pedido = new Acai();
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tamanho do seu Açaí:\n1 - 300ml\n2 - 500ml\n3 - 700ml\n4 - Sair\nDigite o número da opção desejada:"));
            switch (opcao) {
                case 1:
                    int opcao2 = Integer.parseInt(JOptionPane.showInputDialog("Deseja acrescentar sorverte?\n1 - Sim\n2 - Não\nDigite o número da opção desejada:"));
                    switch (opcao2) {
                        case 1:
                            pedido.setValor(8);
                            pedido.setAcrescimoSorvet(true);
                            pedido.calculaValor();
                            JOptionPane.showMessageDialog(null, "Total a pagar: " + pedido.getValor(), "Obrigado!", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case 2:
                            pedido.setValor(8);
                            pedido.setAcrescimoSorvet(false);
                            pedido.calculaValor();
                            JOptionPane.showMessageDialog(null, "Total a pagar: " + pedido.getValor(), "Obrigado!", JOptionPane.INFORMATION_MESSAGE);
                            break;
                    }
                    break;
                case 2:
                    opcao2 = Integer.parseInt(JOptionPane.showInputDialog("Deseja acrescentar sorverte?\n1 - Sim\n2 - Não\nDigite o número da opção desejada:"));
                    switch (opcao2) {
                        case 1:
                            pedido.setValor(10);
                            pedido.setAcrescimoSorvet(true);
                            pedido.calculaValor();
                            JOptionPane.showMessageDialog(null, "Total a pagar: " + pedido.getValor(), "Obrigado!", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case 2:
                            pedido.setValor(10);
                            pedido.setAcrescimoSorvet(false);
                            pedido.calculaValor();
                            JOptionPane.showMessageDialog(null, "Total a pagar: " + pedido.getValor(), "Obrigado!", JOptionPane.INFORMATION_MESSAGE);
                            break;
                    }
                    break;
                case 3:
                    opcao2 = Integer.parseInt(JOptionPane.showInputDialog("Deseja acrescentar sorverte?\n1 - Sim\n2 - Não\nDigite o número da opção desejada:"));
                    switch (opcao2) {
                        case 1:
                            pedido.setValor(12);
                            pedido.setAcrescimoSorvet(true);
                            pedido.calculaValor();
                            JOptionPane.showMessageDialog(null, "Total a pagar: " + pedido.getValor(), "Obrigado!", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case 2:
                            pedido.setValor(12);
                            pedido.setAcrescimoSorvet(false);
                            pedido.calculaValor();
                            JOptionPane.showMessageDialog(null, "Total a pagar: " + pedido.getValor(), "Obrigado!", JOptionPane.INFORMATION_MESSAGE);
                            break;
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Obrigado por nos visitar!", "VOLTE SEMPRE!", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Entre com um número váido!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } while (opcao!=4);
    }
}
