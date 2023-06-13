import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private final String nome;
    private final String email;
    private final String senha;
    private final List<Usuario> amigos;
    private final List<Mensagem> mensagens;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.amigos = new ArrayList<>();
        this.mensagens = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public List<Usuario> getAmigos() {
        return amigos;
    }

    public List<Mensagem> getMensagens() {
        return mensagens;
    }

    public void adicionarAmigo(Usuario amigo) {
        amigos.add(amigo);
    }

    public void removerAmigo(Usuario amigo) {
        amigos.remove(amigo);
    }

    public void adicionarMensagem(Usuario remetente, String conteudo) {
        Mensagem mensagem = new Mensagem(remetente, conteudo);
        mensagens.add(mensagem);
    }
}
