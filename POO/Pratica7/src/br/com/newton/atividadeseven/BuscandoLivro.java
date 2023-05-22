package br.com.newton.atividadeseven;

import javax.swing.*;
import java.net.ConnectException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BuscandoLivro {
    private final String url = "jdbc:postgresql://localhost/BDlivrariaUniversitaria";
    private final String user = "postgres";
    private final String password = "1234";

    private final String buscandoTitle = "SELECT nm_titulo FROM livro WHERE nm_titulo LIKE ?";
    private final String maiorouigual = "SELECT nm_titulo, vl_preco FROM livro WHERE vl_preco <= ?";


    public void buscarTitle(String title) throws SQLException{
        Connection conexao = DriverManager.getConnection(url,user,password);
        PreparedStatement rota = conexao.prepareStatement(buscandoTitle);
        try{
            rota.setString(1,title+"%");
            ResultSet rs = rota.executeQuery();
            while (rs.next()){
                String titulo = rs.getString("nm_titulo");
                System.out.println(titulo);
            }

        }
        catch (SQLException e){
            printSQLException(e);
        }
    }

    public void maiorigualf(double val) throws SQLException{
        Connection conexao = DriverManager.getConnection(url,user,password);
        PreparedStatement rota = conexao.prepareStatement(maiorouigual);
        try {
            List<String> resultP = new ArrayList<String>();
            rota.setDouble(1,val);
            ResultSet rs = rota.executeQuery();
            while (rs.next()){
                String titulo = rs.getString("nm_titulo");
                double valor = rs.getDouble("vl_preco");
                resultP.add(titulo + " - " + valor);
            }
            for(int i = 0;i<resultP.size();i++){
                JOptionPane.showMessageDialog(null,resultP.get(i));
            }
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
