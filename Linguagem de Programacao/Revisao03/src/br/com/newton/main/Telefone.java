package br.com.newton.main;
import java.util.Scanner;
import javax.swing.JOptionPane;

import br.com.newton.agenda.Contato;

public class Telefone {
    public static void main(String[] args) {
        Contato contact = new Contato();
        Scanner ler = new Scanner(System.in);

        /*System.out.print("Digite o nome do contato: ");*/
        String nome = JOptionPane.showInputDialog("Digite o nome do contato: ");
        contact.setNome(nome);

        /*System.out.print("Digite seu número de telefone sem espaço e sem DDD: ");*/
        String numero = JOptionPane.showInputDialog("Digite o número");
        contact.setNumero(numero);

        if(contact.getNumero().length()!=9){
            /*System.out.println("Telefone inválido!");*/
            JOptionPane.showMessageDialog(null,"Telefone inválido",numero,JOptionPane.ERROR_MESSAGE-0);
        }

        contact.excluir(contact);
        contact.add(contact);



    }
}