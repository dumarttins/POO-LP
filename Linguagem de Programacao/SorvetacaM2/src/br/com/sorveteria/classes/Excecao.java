package br.com.sorveteria.classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Excecao {
    public void gravandoException(Exception e) throws IOException {
        try {
            String caminhoFile = "D:\\Users\\eduardo.martins\\Desktop\\Logs\\logsSorvetaca.txt";

            BufferedWriter gravar = new BufferedWriter(new FileWriter(caminhoFile));

            PrintWriter imprimi = new PrintWriter(gravar);

            e.printStackTrace(imprimi);

            imprimi.close();
            gravar.close();
            System.out.println("Erro gravado com sucesso no arquivo.");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
