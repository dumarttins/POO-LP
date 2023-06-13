import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class NewtonGran {
    private static final List<Usuario> usuarios = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            int opcao = mostrarMenuPrincipal();

            switch (opcao) {
                case 1 -> cadastrarUsuario();
                case 2 -> {
                    Usuario usuario = fazerLogin();
                    if (usuario != null) {
                        exibirMenuUsuario(usuario);
                    } else {
                        JOptionPane.showMessageDialog(null, "Login inválido!");
                    }
                }
                case 3 -> {
                    JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                    System.exit(0);
                }
                default -> JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }

    private static int mostrarMenuPrincipal() {
        String mensagem = """
                NewtonGran

                1. Cadastrar usuário
                2. Fazer login
                3. Sair do sistema

                Digite o número da opção desejada:""";
        return Integer.parseInt(JOptionPane.showInputDialog(null, mensagem));
    }

    private static void cadastrarUsuario() {
        String nome = JOptionPane.showInputDialog("Digite o nome do usuário:");
        String email = JOptionPane.showInputDialog("Digite o email do usuário:");
        String senha = JOptionPane.showInputDialog("Digite a senha do usuário:");

        Usuario novoUsuario = new Usuario(nome, email, senha);
        usuarios.add(novoUsuario);

        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
    }

    private static Usuario fazerLogin() {
        String email = JOptionPane.showInputDialog("Digite o email:");
        String senha = JOptionPane.showInputDialog("Digite a senha:");

        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                return usuario;
            }
        }
        return null;
    }

    private static void exibirMenuUsuario(Usuario usuario) {
        while (true) {
            int opcao = mostrarMenuUsuario(usuario);

            switch (opcao) {
                case 1 -> incluirAmigo(usuario);
                case 2 -> consultarAmigos(usuario);
                case 3 -> excluirAmigo(usuario);
                case 4 -> enviarMensagem(usuario);
                case 5 -> visualizarMensagens(usuario);
                case 6 -> {
                    return;
                }
                default -> JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }

    private static int mostrarMenuUsuario(Usuario usuario) {
        String mensagem = "Bem-vindo(a), " + usuario.getNome() + "!\n\n" +
                "1. Incluir amigo\n" +
                "2. Consultar amigos\n" +
                "3. Excluir amigo\n" +
                "4. Enviar mensagem\n" +
                "5. Visualizar mensagens\n" +
                "6. Fazer logout\n\n" +
                "Digite o número da opção desejada:";
        return Integer.parseInt(JOptionPane.showInputDialog(null, mensagem));
    }

    private static void incluirAmigo(Usuario usuario) {
        String emailAmigo = JOptionPane.showInputDialog("Digite o email do amigo:");

        Usuario amigo = buscarUsuarioPorEmail(emailAmigo);
        if (amigo != null) {
            usuario.adicionarAmigo(amigo);
            JOptionPane.showMessageDialog(null, "Amigo adicionado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Amigo não encontrado!");
        }
    }

    private static void consultarAmigos(Usuario usuario) {
        StringBuilder amigos = new StringBuilder("Lista de amigos:\n");
        for (Usuario amigo : usuario.getAmigos()) {
            amigos.append(amigo.getNome()).append(" (").append(amigo.getEmail()).append(")\n");
        }
        JOptionPane.showMessageDialog(null, amigos.toString());
    }

    private static void excluirAmigo(Usuario usuario) {
        String emailAmigo = JOptionPane.showInputDialog("Digite o email do amigo a ser removido:");

        Usuario amigo = buscarUsuarioPorEmail(emailAmigo);
        if (amigo != null) {
            usuario.removerAmigo(amigo);
            JOptionPane.showMessageDialog(null, "Amigo removido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Amigo não encontrado!");
        }
    }

    private static void enviarMensagem(Usuario usuario) {
        String emailAmigo = JOptionPane.showInputDialog("Digite o email do amigo para enviar a mensagem:");
        String mensagem = JOptionPane.showInputDialog("Digite a mensagem:");

        Usuario amigo = buscarUsuarioPorEmail(emailAmigo);
        if (amigo != null) {
            amigo.adicionarMensagem(usuario, mensagem);
            JOptionPane.showMessageDialog(null, "Mensagem enviada para " + amigo.getNome() + "!");
        } else {
            JOptionPane.showMessageDialog(null, "Amigo não encontrado!");
        }
    }

    private static void visualizarMensagens(Usuario usuario) {
        StringBuilder mensagens = new StringBuilder("Mensagens recebidas:\n");
        List<Mensagem> listaMensagens = usuario.getMensagens();
        if (listaMensagens.isEmpty()) {
            mensagens.append("Nenhuma mensagem recebida.");
        } else {
            for (Mensagem mensagem : listaMensagens) {
                mensagens.append("De: ").append(mensagem.getRemetente().getNome()).append("\n")
                        .append("Mensagem: ").append(mensagem.getConteudo()).append("\n\n");
            }
        }
        JOptionPane.showMessageDialog(null, mensagens.toString());
    }

    private static Usuario buscarUsuarioPorEmail(String email) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email)) {
                return usuario;
            }
        }
        return null;
    }
}
