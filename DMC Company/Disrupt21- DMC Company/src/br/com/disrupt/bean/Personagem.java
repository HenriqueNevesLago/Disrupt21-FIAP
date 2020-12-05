package br.com.disrupt.bean;

public class Personagem {
	
	//Atributos
	private int idPersonagem;	
	private String nome;
	private String descricao;
	
	//Construtores
	public Personagem() {
	}
	
	
	public Personagem(int idPersonagem, String nome, int idade, String descricao, int anoAcontecimento) {
		super();
		this.idPersonagem = idPersonagem;
		this.nome = nome;
		this.descricao = descricao;
	}
	
	//Métodos getter and setter
	public int getIdPersonagem() {
		return idPersonagem;
	}
	public void setIdPersonagem(int idPersonagem) {
		this.idPersonagem = idPersonagem;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
	
}
