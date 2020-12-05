package br.com.disrupt.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnectionManager() throws SQLException, ClassNotFoundException {
		Connection conexao = null;
        try {
        	Class.forName("oracle.jdbc.OracleDriver");

            conexao = DriverManager.getConnection(
            		"jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM84549", "020802");


        } catch (ClassNotFoundException e) {
        	e.printStackTrace();

        } catch (SQLException e) {
        	e.printStackTrace();

        }

        return conexao;
		
	}

}
