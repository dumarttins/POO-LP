package contatenacao;

public class Main {
    public static void main(String[] args) throws Exception{
        String nome = "D:\\Arquivos\\nome.txt";
        String sobre = "D:\\Arquivos\\sobrenome.txt";
        String nomeSobre = "D:\\Arquivos\\juntos.txt";

        Concatenando.novoArquivo(nome,sobre,nomeSobre);
    }
}
