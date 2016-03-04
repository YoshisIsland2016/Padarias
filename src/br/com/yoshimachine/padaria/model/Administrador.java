package br.com.yoshimachine.padaria.model;

public class Administrador {
	
	private int id_administrador;
	private String login;
	private String senha;
	
	public int getId_administrador() {
		return id_administrador;
	}
	public void setId_administrador(int id_administrador) {
		this.id_administrador = id_administrador;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
