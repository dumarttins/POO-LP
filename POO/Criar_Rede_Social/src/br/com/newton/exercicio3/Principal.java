package br.com.newton.exercicio3;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        String titulo, autores, resumo;
        Artigo art;

        ArrayList<Artigo> artigos = new ArrayList<>();

        for (int i=0; i<10;i++){
            titulo = JOptionPane.showInputDialog("Titulo do Artigo: ");
            autores = JOptionPane.showInputDialog("Autores: ");
            resumo = JOptionPane.showInputDialog("Resumo");
            art = new Artigo(titulo,resumo,autores);
            artigos.add(art);
        }

        Edicao edit = new Edicao(1, 2,"25/02/2022",3,artigos);
        RevistaCientifica revistaC = new RevistaCientifica("Nova Revista",25333624,"Semanas",edit);
    }
}
