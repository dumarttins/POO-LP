package tudo;

import tudo.ManipuladorArquivo;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        String path = "D:\\teste.txt";

        ManipuladorArquivo.escritor(path);
        ManipuladorArquivo.leitor(path);

    }
}
