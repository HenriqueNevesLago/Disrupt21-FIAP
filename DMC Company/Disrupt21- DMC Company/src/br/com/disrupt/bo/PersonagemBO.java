package br.com.disrupt.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.disrupt.bean.Acontecimento;
import br.com.disrupt.bean.Participacao;
import br.com.disrupt.bean.Personagem;
import br.com.disruptCrud.dao.PersonagemDAO;

public class PersonagemBO {

	public static List<Personagem> listarTodos(Personagem personagem) throws SQLException {
		PersonagemDAO personagemDao = new PersonagemDAO();
		return personagemDao.listarTodos(personagem);
	}
	
	
	public static List<Acontecimento> listaAcontecimento(Acontecimento acontecimento, Personagem personagem, Participacao participacao) throws SQLException {
		PersonagemDAO personagemDao = new PersonagemDAO();
		return personagemDao.listarAcontecimento(acontecimento, personagem, participacao);
	}
	
	public static Personagem listarPersonagemPorNome(Personagem personagem) throws SQLException {
		PersonagemDAO personagemDao = new PersonagemDAO();
		return personagemDao.listarPersonagemPorNome(personagem);
	}
}
