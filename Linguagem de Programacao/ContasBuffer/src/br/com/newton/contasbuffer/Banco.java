package br.com.newton.contasbuffer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String banco;

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    static List<Conta> listacontas = new ArrayList<Conta>();

    public void escrevendo(String caminho) throws Exception{
        String lendo;
        BufferedReader lendoA = new BufferedReader(new FileReader(caminho));
        while(true){
            lendo = lendoA.readLine();
            if(lendo!=null){
                String[] contas = lendo.split(",");
                Conta c = new Conta();
                c.setAgencia(contas[0]);
                c.setNumeroConta(contas[1]);
                c.setSaldoConta(Double.parseDouble(contas[2]));
                listacontas.add(c);
            }else
                break;
        }
        lendoA.close();
    }

    public double somasaldo(){
        System.out.println(2);
        double somador = 0;
        for (Conta conta: listacontas ) {
            somador += conta.getSaldoConta();
        }
        return somador;
    }

    public void printando(String banco, String path)throws Exception{
        System.out.println(3);
        BufferedWriter escrever = new BufferedWriter(new FileWriter(path));
        escrever.append(banco+"\n"+somasaldo());
        escrever.close();
    }
}
