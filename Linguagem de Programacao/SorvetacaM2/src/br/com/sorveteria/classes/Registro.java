package br.com.sorveteria.classes;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Registro {
    private final String url = "jdbc:postgresql://localhost/sorvetaca2";
    private final String user = "postgres";
    private final String password = "1234";

    private static final String inseriPedido = "INSERT INTO pedido" +
            "(idpedido, idtamanho, idproduto, idacrescimo,idcliente,idformapagamento) VALUES"+"(?,?,?,?,?,?)";

    public void inseriPedido(int pedido1, String pedido2, String pedido3, double pedido4, int pedido5, String pedido6) throws SQLException{
        Connection conexao = DriverManager.getConnection(url,user,password);
        PreparedStatement rota = conexao.prepareStatement(inseriPedido);
        try{
            rota.setInt(1,pedido1);
            rota.setString(2,pedido2);
            rota.setString(3,pedido3);
            rota.setDouble(4,pedido4);
            rota.setInt(5,pedido5);
            rota.setString(6,pedido6);

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
