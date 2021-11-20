package Entities;

public class Atendente {
	
	private int codFunc;
	private String nome;
	private String username;
	private String senha;

	public Atendente() {

	}

	public int getCodFunc() {
		return codFunc;
	}

	public void setCodFunc(int codFunc) {
		this.codFunc = codFunc;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public Atendente(int codFunc, String nome, String username, String senha) {
		this.codFunc = codFunc;
		this.nome = nome;
		this.username = username;
		this.senha = senha;
	}
	
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
