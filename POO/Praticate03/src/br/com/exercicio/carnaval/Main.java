package br.com.exercicio.carnaval;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha seu ingresso: \n1 - Ingresso Normal\n2 - VIP\n3 - Camarote\n4 - Sair"));

            switch (opcao) {
                case 1:
                    Normal ingressoN = new Normal(100);
                    JOptionPane.showMessageDialog(null, ingressoN.IngressoNormal(), "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    VIP ingressoV = new VIP(100, 50);
                    JOptionPane.showMessageDialog(null, ingressoV.IngressoVip(), "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    Camarote ingressoC = new Camarote(100, 100, "Camarote");
                    JOptionPane.showMessageDialog(null, ingressoC.IngressoCamarote(), "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite um número válido!", "ERRO", JOptionPane.ERROR_MESSAGE);

            }
        }while (opcao!= 4);
    }
}
