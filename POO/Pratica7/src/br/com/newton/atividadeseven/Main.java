package br.com.newton.atividadeseven;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws SQLException {
        Registro objReg = new Registro();
        DeletarRegistro objDel = new DeletarRegistro();
        BuscandoLivro objBusca = new BuscandoLivro();

        String isbn, nometitulo, datapubli;
        int idCategoria, idEditora, numeroEdit, numerovol; double valor;
        int opcao;

        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("<1> Cadastrar Livro\n" +
                    "<2> Pesquisar Livro por Preço\n" +
                    "<3> Pesquisar Livro por Título\n" +
                    "<4> Excluir Livro\n" +
                    "<5> Sair"));
            switch (opcao){
                case 1:
                    isbn = JOptionPane.showInputDialog("Digite o número ISBN do livro: ");
                    idCategoria = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que corresponde a categoria do livro cadastrado: \n" +
                            "<1> Informática\n" +
                            "<2> Engenharia\n" +
                            "<3> Turismo\n" +
                            "<4> Direito\n" +
                            "<5> Literatura"));
                    idEditora = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que corresponde a editora do livro cadastrado: \n" +
                            "<1> Makron Books\n" +
                            "<2> Campus\n" +
                            "<3> Bookman\n" +
                            "<4> Prentice-Hall\n" +
                            "<5> Saraiva\n"));
                    nometitulo = JOptionPane.showInputDialog("Digite o titulo do livro: ");
                    datapubli = JOptionPane.showInputDialog("Digite a data da publicação: ");
                    numeroEdit = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da edição do livro"));
                    numerovol = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do volume do livro"));
                    valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do livro: "));
                    objReg.inserindoRegistro(isbn,idCategoria,idEditora,nometitulo,numeroEdit,numerovol,valor);
                    break;
                case 2:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: "));
                    objBusca.maiorigualf(valor);
                    break;
                case 3:
                    nometitulo = JOptionPane.showInputDialog("Digite o titulo do livro qual deseja filtrar: ");
                    objBusca.buscarTitle(nometitulo);
                    break;
                case 4:
                    isbn = JOptionPane.showInputDialog("Digite o ISBN do livro qual deseja exluir do sistema: ");
                    objDel.deltandoRegistro(isbn);
                    break;
                case 5:
                    String mensage = "VOLTE SEMPRE!";
                    JOptionPane.showMessageDialog(null,"OBRIGADO!",mensage,JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    mensage = "Digite um argumento valido";
                    JOptionPane.showMessageDialog(null,"INVALIDO", mensage, JOptionPane.ERROR_MESSAGE);
            }
        }while(opcao!=5);



    }
}
