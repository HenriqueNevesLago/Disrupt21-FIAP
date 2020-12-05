package br.com.disrupt.bean;

public class Usuario {
	
	//Atributos
	private int idUsuario;
	private String nome;
	private String email;
	private String cpf;
	private String descricao;
	
	//Construtores
	public Usuario() {
	}


	public Usuario(int idUsuario, String nome, String email, String cpf, String descricao) {
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.descricao = descricao;
	}
	
	//Métodos getter and setter
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
