package br.com.disruptCrud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.disrupt.bean.Acontecimento;
import br.com.disrupt.connection.ConnectionFactory;

public class AcontecimentoDAO {
	
private Connection con;
	
	public AcontecimentoDAO() {
		ConnectionFactory cf = new ConnectionFactory();
		try {
			this.con = cf.getConnectionManager();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	Acontecimento acontecimentos = new Acontecimento();
	
	public List<Acontecimento> selectTodos() {
		
		List<Acontecimento> listaAcontecimentos = new ArrayList<Acontecimento>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = con.prepareStatement("SELECT * FROM T_DVF_ACONTECIMENTO");
			rs = ps.executeQuery();
			
			Acontecimento acontecimento = null;

			
			while(rs.next()) {
				acontecimento = new Acontecimento();
				acontecimento.setIdAcontecimento(rs.getInt("CD_ACONTECIMENTO"));
				acontecimento.setAno(rs.getInt("NR_ANO_ACONTECIMENTO"));
				acontecimento.setDescricao(rs.getString("DS_ACONTECIMENTO"));
				
				listaAcontecimentos.add(acontecimento);			
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e ){
				e.printStackTrace();
			}
		}
		
		return listaAcontecimentos;
		
	}

}
