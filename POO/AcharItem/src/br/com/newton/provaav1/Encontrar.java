package br.com.newton.provaav1;
import java.util.Scanner;

public class Encontrar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AchadoPerdido procurando = new AchadoPerdido("Macacos Alegres", "O grande conflito","Forte", "Ligado");

        System.out.print("Entre com o titulo a ser buscado nos perdidos: ");
        String tit = in.nextLine();

        System.out.println(procurando.buscarTitulo(tit));
        procurando.visualizarDetalhes();
    }
}
