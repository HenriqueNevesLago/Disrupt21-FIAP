package br.com.disrupt.bean;

public class Acontecimento {
	
	//Atributos
	private int idAcontecimento;
	private int ano;
	private String descricao;
	
	//Construtores
	public Acontecimento() {
	}
	
	
	public Acontecimento(int idAcontecimento, int ano, String descricao) {
		this.idAcontecimento = idAcontecimento;
		this.ano = ano;
		this.descricao = descricao;
	}

	//Métodos getter and setter
	public int getIdAcontecimento() {
		return idAcontecimento;
	}
	public void setIdAcontecimento(int idAcontecimento) {
		this.idAcontecimento = idAcontecimento;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
