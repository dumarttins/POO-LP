package br.com.newton.exercicio1;

public class Publicacao{
    private String dataPublicao;
    private String textoPublicacao;
    private String linkMidia;
    public static double contadorPublicacao = 0;

    public Publicacao(String dataPublicao, String textoPublicacao, String linkMidia) {
        this.dataPublicao = dataPublicao;
        this.textoPublicacao = textoPublicacao;
        this.linkMidia = linkMidia;
        contadorPublicacao++;
    }
    public String getDataPublicao() {
        return dataPublicao;
    }

    public void setDataPublicao(String dataPublicao) {
        this.dataPublicao = dataPublicao;
    }

    public String getTextoPublicacao() {
        return textoPublicacao;
    }

    public void setTextoPublicacao(String textoPublicacao) {
        this.textoPublicacao = textoPublicacao;
    }

    public String getLinkMidia() {
        return linkMidia;
    }

    public void setLinkMidia(String linkMidia) {
        this.linkMidia = linkMidia;
    }

    public static double getContadorPublicacao() {
        return contadorPublicacao;
    }
}
