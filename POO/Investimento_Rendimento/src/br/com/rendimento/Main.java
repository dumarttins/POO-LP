package br.com.rendimento;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Rendimento r1 = new Rendimento();

        System.out.print("Qual o valor inicial deseja começar seu Investimento: ");
        double investI = in.nextDouble();
        r1.setInvestI(investI);

        System.out.print("Taxa de crescimento mensal sobre seu investimento: ");
        double taxaI = in.nextDouble();
        r1.setTaxaI(taxaI);

        System.out.print("Quantos meses seu investimento parmanecerá aplicado: ");
        int setNumMeses = in.nextInt();
        r1.setNumMeses(setNumMeses);

        System.out.printf("Retorno do investimento: R$ %.2f", r1.calcularendi());

    }

}
