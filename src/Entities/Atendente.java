package Entities;

public class Atendente {
	private int codFunc;
	private String nome;
	private String login;
	private String senha;
	
	
	public int getId() {
		return codFunc;
	}
	public void setId(int codFunc) {
		this.codFunc = codFunc;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
