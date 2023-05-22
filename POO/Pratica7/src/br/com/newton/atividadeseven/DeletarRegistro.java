package br.com.newton.atividadeseven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletarRegistro {
    private final String url = "jdbc:postgresql://localhost/BDlivrariaUniversitaria";
    private final String user = "postgres";
    private final String password = "1234";

    private static final String deletaRegistro = "delete from livro where id_isbn = ?;";

    public void deltandoRegistro(String id_isbn) throws SQLException{
        System.out.println(deletaRegistro);
        Connection conexao = DriverManager.getConnection(url, user, password);
        PreparedStatement rota = conexao.prepareStatement(deletaRegistro);
        try{
            rota.setString(1,id_isbn);
            int result = rota.executeUpdate();
            System.out.println("Numeros de registros afetados: "+result);
        }
        catch (SQLException e){
            printSQLException(e);
        }
    }
    public static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
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
