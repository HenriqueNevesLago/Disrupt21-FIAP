package br.com.disruptCrud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.disrupt.bean.Usuario;
import br.com.disrupt.connection.ConnectionFactory;


public class UsuarioDAO {
	
private Connection con;
	
	public UsuarioDAO() {
		ConnectionFactory cf = new ConnectionFactory();
		try {
			this.con = cf.getConnectionManager();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insert(Usuario usuario) throws SQLException {
		
		try {
		
			PreparedStatement ps = con.prepareStatement("INSERT INTO T_DVF_USUARIO VALUES(CD_USUARIO_SEQ.NEXTVAL, ?, ?, ?, ?)");
			
			ps.setString(1, usuario.getCpf());
			ps.setString(2, usuario.getNome());
			ps.setString(3, usuario.getEmail());
			ps.setString(4, usuario.getDescricao());

			ps.executeUpdate();

			ps.close();
			con.close();
	
		} catch (SQLException e) {
		e.printStackTrace();
		}
	}

	

}
