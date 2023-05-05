package contatenacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Concatenando {
    public static void novoArquivo(String path, String path1, String path2) throws Exception{
        BufferedReader buffred = new BufferedReader(new FileReader(path));
        BufferedReader buffred1 = new BufferedReader(new FileReader(path1));
        BufferedWriter buffWriter = new BufferedWriter(new FileWriter(path2));

        String nome, sobrenome, nomeSobre;
        while (true){
            nome = buffred.readLine();
            sobrenome = buffred1.readLine();
            if(nome!=null && sobrenome!=null) {
                System.out.println(nome+" "+sobrenome);
                nomeSobre = nome +" "+ sobrenome;
                buffWriter.append(nomeSobre +"\n");
            }
            else
                break;
        }
        buffred.close();
        buffred1.close();
        buffWriter.close();

    }

}
