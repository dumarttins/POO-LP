package br.com.newton.exercicio1;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        RedeSocial redesocial = new RedeSocial();

        redesocial.setNomeUsuario(JOptionPane.showInputDialog("Digite seu nome de usuário: "));
        redesocial.setDataNascimento(JOptionPane.showInputDialog("Dite sua data de nascimento: "));
        redesocial.setSenha("Digite sua senha: ");
        redesocial.setDataCriacao("Digite a data da criação da Rede Social");

        ArrayList<Publicacao> publi = new ArrayList<>();

        Publicacao publi1;

        for(int i=0; i<2;i++){
            String dataPublicacao = JOptionPane.showInputDialog("Digite a data da publicação: ");
            String textoPublicacao = JOptionPane.showInputDialog("Digite o texto");
            String linkMidia = JOptionPane.showInputDialog("Digite o link");
            publi1 = new Publicacao(dataPublicacao,textoPublicacao,linkMidia);
            publi.add(publi1);
            redesocial.inserePublicacao(publi1);
        }
        redesocial.imprimePublicacao();
    }
}
