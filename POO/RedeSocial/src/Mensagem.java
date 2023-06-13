public class Mensagem {
    private final Usuario remetente;
    private final String conteudo;

    public Mensagem(Usuario remetente, String conteudo) {
        this.remetente = remetente;
        this.conteudo = conteudo;
    }

    public Usuario getRemetente() {
        return remetente;
    }

    public String getConteudo() {
        return conteudo;
    }
}
