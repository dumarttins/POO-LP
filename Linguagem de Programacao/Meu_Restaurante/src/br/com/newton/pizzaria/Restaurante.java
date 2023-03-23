package br.com.newton.pizzaria;
import javax.swing.JOptionPane;

public class Restaurante {
    public static void main(String[] args) {
        Pizza p1 = new Pizza();
        Hamburguer h1 = new Hamburguer();
        String nada = "";

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe o pedido do cliente:\n1. Hamburguer\n2. Pizza\n3. Sair"));

        switch (opcao){
            case 1:
                h1.nome = (JOptionPane.showInputDialog("Digite o nome do Hamburguer desejada: "));
                h1.valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Hambuguer: "));
                int artesanal = Integer.parseInt(JOptionPane.showInputDialog("Artesanal?\n1. Sim\n2. Não"));
                switch (artesanal){
                    case 1:
                        h1.artesanal = true;
                        break;
                    case 2:
                        h1.artesanal = false;
                        break;
                    default:
                        System.out.println("Entre com uma opção válida!");
                }

                if(h1.artesanal)
                    h1.calculaValor(8);
                else
                    h1.calculaValor(0);
                JOptionPane.showMessageDialog(null,"Valor do seu Pedido: "+h1.valor,"Obrigado por comprar conosco",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                p1.nome = (JOptionPane.showInputDialog("Digite o nome da Pizza desejada: "));
                p1.valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Pizza: "));
                int borda = Integer.parseInt(JOptionPane.showInputDialog("Borda?\n1. Sim\n2. Não"));
                switch (borda){
                    case 1:
                        p1.possuiBorda = true;
                        break;
                    case 2:
                        p1.possuiBorda = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Entre com uma opção válida!"+nada,"ERRO",JOptionPane.ERROR_MESSAGE);
                        break;
                }

                p1.valor = p1.calculaValor(p1.possuiBorda);
                JOptionPane.showMessageDialog(null,"Valor do seu Pedido: "+p1.valor,"Obrigado por comprar conosco",JOptionPane.INFORMATION_MESSAGE);
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Volte Sempre!"+nada,"Agradecimentos",JOptionPane.INFORMATION_MESSAGE);
                break;

            default:
                JOptionPane.showMessageDialog(null,"Entre com uma opção válida!"+nada,"ERRO",JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

}
