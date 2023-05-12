package br.com.newton.contasbuffer;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) throws Exception {
        String nomeC, nomeB;
        String caminholer = "C:\\Users\\eduardo.martins\\Documents\\Dados.txt";
        String caminhoescre = "C:\\Users\\eduardo.martins\\Desktop\\escre.txt";

        nomeC = JOptionPane.showInputDialog("Digite seu nome: ");
        nomeB = JOptionPane.showInputDialog("DIgite o nome do Banco: ");

        Cliente c1 = new Cliente();
        c1.setNomeC(nomeC);

        Banco b1 = new Banco();

        b1.setBanco(nomeB);
        b1.escrevendo(caminholer);
        b1.somasaldo();
        b1.printando(nomeB,caminhoescre);

    }
}
