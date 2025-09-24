
package br.ulbra.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public abstract class AbstractDAO {
    private static final String DRIVER = "com.mysql.jdbc.Driver"; //driver JDBC
    private static final String URL = "jdbc:mysql://localhost:3306/bdaulabanco"; //
    private static final String USER = "root"; //login do banco
    private static final String PASS = "";   //salvar o banco
    public static Connection getConnection() throws SQLException{
        try{
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL,USER,PASS); 
        }catch (ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null,"ERRO:"+ ex.getMessage());
            return null;
        }
    } 
}
