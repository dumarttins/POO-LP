import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Scanner in2= new Scanner(System.in);

        System.out.print("Digite a placa do seu carro: ");
        String plca = in2.nextLine();
        System.out.print("Digite o ano de fabricação do seu automovel: ");
        int ano = in.nextInt();

        if(ano<2011){
            System.out.println(" -> Carro Velho");
        }
        else if (ano<2023) {
            System.out.println(" -> Carro Semi Novo");
        }
        else {
            System.out.println(" -> Carro Novo");
        }

        System.out.println(" -> Placa: "+formataDados(plca));

    }

    public static String formataDados(String dado) {
        dado = dado.replaceAll("e","*");
        dado = dado.replaceAll("a","*");
        dado = dado.replaceAll("i","*");
        dado = dado.replaceAll("o","*");
        dado = dado.replaceAll("u","*");

        return dado;
    }

}