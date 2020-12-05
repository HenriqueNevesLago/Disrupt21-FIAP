package br.com.disruptCrud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.disrupt.bean.Acontecimento;
import br.com.disrupt.bean.Participacao;
import br.com.disrupt.bean.Personagem;
import br.com.disrupt.connection.ConnectionFactory;

public class PersonagemDAO {
	
private Connection con;
	
	public PersonagemDAO() {
		ConnectionFactory cf = new ConnectionFactory();
		try {
			this.con = cf.getConnectionManager();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	List<Personagem> listaPersonagens = new ArrayList<Personagem>();
	
	public List<Personagem> listarTodos(Personagem personagem) throws SQLException {
		
		PreparedStatement ps = con.prepareStatement("SELECT * FROM T_DVF_PERSONAGEM");
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			personagem = new Personagem();
			personagem.setNome(rs.getString("NM_PERSONAGEM"));
			personagem.setDescricao(rs.getString("DS_PERSONAGEM"));
			personagem.setIdPersonagem(rs.getInt("CD_PERSONAGEM"));
			
			listaPersonagens.add(personagem);
		}
		rs.close();
		ps.close();
		return listaPersonagens;
	}
	
	List<Acontecimento> listaAcontecimento = new ArrayList<Acontecimento>();
	
	public List<Acontecimento> listarAcontecimento(Acontecimento acontecimento, Personagem personagem, Participacao participacao) throws SQLException {
		
		PreparedStatement ps = con.prepareStatement("SELECT * FROM T_DVF_PERSONAGEM P INNER JOIN T_DVF_PARTICIPACAO B ON(P.CD_PERSONAGEM = B.CD_PERSONAGEM) INNER JOIN T_DVF_ACONTECIMENTO A ON(A.CD_ACONTECIMENTO = B.CD_ACONTECIMENTO) WHERE B.CD_VERSAO_PERSONAGEM = ? AND A.NR_ANO_ACONTECIMENTO = ? and P.NM_PERSONAGEM = ?");
		ps.setInt(1, participacao.getCd_versao());
		ps.setInt(2, acontecimento.getAno());
		ps.setString(3, personagem.getNome());

		ResultSet rs = ps.executeQuery();
		
		
		while(rs.next()) {
			Acontecimento NovoAcontecimento = new Acontecimento();
			NovoAcontecimento.setIdAcontecimento(rs.getInt("CD_ACONTECIMENTO"));
			NovoAcontecimento.setAno(rs.getInt("NR_ANO_ACONTECIMENTO"));
			NovoAcontecimento.setDescricao(rs.getString("DS_ACONTECIMENTO"));
			
			listaAcontecimento.add(NovoAcontecimento);
		}
		rs.close();
		ps.close();
		return listaAcontecimento;
	}
	public Personagem listarPersonagemPorNome(Personagem personagem) throws SQLException {
		
		PreparedStatement ps = con.prepareStatement("SELECT * FROM T_DVF_PERSONAGEM WHERE NM_PERSONAGEM = ?");
		ps.setString(1, personagem.getNome());
		ResultSet rs = ps.executeQuery();
		
		Personagem personagemRetornado = new Personagem();
		
		while(rs.next()) {
			personagemRetornado.setIdPersonagem(rs.getInt("CD_PERSONAGEM"));
			personagemRetornado.setNome(rs.getString("NM_PERSONAGEM"));
			personagemRetornado.setDescricao(rs.getString("DS_PERSONAGEM"));
		}
		rs.close();
		ps.close();
		return personagemRetornado;
		
	}
}
