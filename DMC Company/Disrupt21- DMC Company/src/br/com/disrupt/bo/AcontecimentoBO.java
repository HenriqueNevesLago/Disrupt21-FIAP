package br.com.disrupt.bo;

import java.util.List;

import br.com.disrupt.bean.Acontecimento;
import br.com.disruptCrud.dao.AcontecimentoDAO;

public class AcontecimentoBO {
	
	private AcontecimentoDAO ad = null;
	
	public List<Acontecimento> selectTodos(){
		ad = new AcontecimentoDAO();
		return ad.selectTodos();
		
	} 

}
