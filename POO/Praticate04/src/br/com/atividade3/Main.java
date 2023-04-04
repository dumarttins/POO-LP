package br.com.atividade3;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção desejada: \n1 - Cadastrar Projeto Distribuir Alimentos\n2 - Cadastrar Projeto Trabalho Voluntário\n3 - Sair "));

            switch (opcao){
                case 1:
                    DistribuicaoAlimento da = new DistribuicaoAlimento("Distruição de Alimentos","A Descricao aqui","Rua Aspasia 258 Caiçara","04/04/2023", " ","Arroz", 60);
                    JOptionPane.showMessageDialog(null,da.validaProject() + "\n" + da.imprimeProjeto(),"Inscrito",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    TrabalhoVoluntario tv = new TrabalhoVoluntario("Trabalho Voluntario","A Descricao aqui","Rua Aspasia 258 Caiçara","04/04/2023", "07/04/2023", "Ajudar Moradores de Rua", 10);
                    JOptionPane.showMessageDialog(null,tv.validaProject() + "\n" + tv.imprimeProjeto(),"Inscrito",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Obrigado por ser voluntariar!","Thanks",JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Entre com uma opção válida!","ERRO!",JOptionPane.INFORMATION_MESSAGE);
                    break;
            }

        }while(opcao!=3);
    }
}
