package br.com.disrupt.test;

import java.sql.SQLException;

import br.com.disrupt.bean.Usuario;
import br.com.disruptCrud.dao.UsuarioDAO;

public class TestaInsercaoUsuario {
	public static void main(String[] args) throws SQLException {
		
		Usuario usuario = new Usuario();
		
		usuario.setIdUsuario(2);
		usuario.setNome("Larissa");
		usuario.setCpf("393.531.308-08");
		usuario.setEmail("larissa@gmail.com");
		usuario.setDescricao("Olaaaa");
		
		UsuarioDAO dao = new UsuarioDAO();
		dao.insert(usuario);
		
		
	}

}
