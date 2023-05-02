public class Publicacao extends RedeSocial{
    private String dataPublicao;
    private String textoPublicacao;
    private String linkMidia;

    public Publicacao(String dataCriacao, String nomeUsuario, String dataNascimento, String senha, String dataPublicao, String textoPublicacao, String linkMidia) {
        super(dataCriacao, nomeUsuario, dataNascimento, senha);
        this.dataPublicao = dataPublicao;
        this.textoPublicacao = textoPublicacao;
        this.linkMidia = linkMidia;
    }
}
