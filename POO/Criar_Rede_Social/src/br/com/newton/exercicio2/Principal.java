package br.com.newton.exercicio2;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Lucas","lucaslima@gmail.com","(31) 997175645","Marketing",3500,"21/02/2007","18 593.566",true);
        Funcionario f2 = new Funcionario("Marlon","marlin22@gmail.com","(31) 997175646", "Recursos Humanos",2500,"25/04/2022","18 593.687",true);
        Funcionario f3 = new Funcionario("Jaime","jamersonluis@gmail.com","(31) 997175648","TI",7200,"03/09/2015","20 368.632",false);

        ArrayList<Funcionario> func = new ArrayList<>();
        func.add(f1);
        func.add(f2);
        func.add(f3);

        Empresa company = new Empresa("Starting","25-2556.342512",200,func);

        for(int i=0;i<func.size();i++){
            System.out.println(func.get(i).mostrarDados());
        }
    }
}
