package br.com.newton.atividadeseven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Registro {
    private final String url = "jdbc:postgresql://localhost/BDlivrariaUniversitaria";
    private final String user = "postgres";
    private final String password = "1234";

    private static final String inserirRegistro = "INSERT INTO livro" +
            "(id_isbn, id_categoria, id_editora, nm_titulo,nu_edicao,nu_volume,vl_preco) VALUES"+"(?,?,?,?,?,?,?)";

    public void inserindoRegistro(String isbn, int id_Cat, int id_Edit, String nomeTitle, int nuEdit, int nuVolume, double vlPreco) throws SQLException{
        Connection conexao = DriverManager.getConnection(url,user,password);
        PreparedStatement rota = conexao.prepareStatement(inserirRegistro);
        try{
            rota.setString(1,isbn);
            rota.setInt(2,id_Cat);
            rota.setInt(3,id_Edit);
            rota.setString(4,nomeTitle);
            rota.setInt(5,nuEdit);
            rota.setInt(6,nuVolume);
            rota.setDouble(7,vlPreco);

            System.out.println(rota);
            rota.executeUpdate();
        }
        catch (SQLException e){
            printSQLException(e);
        }

    }
    public static void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
