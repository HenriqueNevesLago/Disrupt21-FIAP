package br.com.disrupt.test;

import java.util.List;

import br.com.disrupt.bean.Acontecimento;
import br.com.disruptCrud.dao.AcontecimentoDAO;

public class TestaListagemAcontecimento {

	public static void main(String[] args) {
		
		AcontecimentoDAO dao = new AcontecimentoDAO();
		
		List<Acontecimento> acontecimentos = dao.selectTodos();
		
		for(Acontecimento acontecimento: acontecimentos) {
			System.out.println("------------------------------------------");
			System.out.println("ID: " + acontecimento.getIdAcontecimento());
			System.out.println("Ano do Acontecimento: " + acontecimento.getAno());
			System.out.println("Descrição: " + acontecimento.getDescricao());
			System.out.println("------------------------------------------");		
		}

	}

}
