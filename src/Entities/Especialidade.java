package Entities;

public class Especialidade {
	
	private Long id;
	private String nome;
	private String cbo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Especialidade(String nome, String cbo) {
		this.nome = nome;
		this.cbo = cbo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCbo() {
		return cbo;
	}
	public void setCbo(String cbo) {
		this.cbo = cbo;
	}
	
}
