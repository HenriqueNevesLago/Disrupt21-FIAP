package br.com.disrupt.test;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.disrupt.connection.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Connection con = new ConnectionFactory().getConnectionManager();
			System.out.println("Conexão Aberta!");
			
			con.close();
		

	}

}
