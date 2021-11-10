package Entities;

public class Paciente {
	private String nome;
	private String cpf;
	private String endereco;
	private char sexo;
	private String nascm;
	private String telefone;
	
	public Paciente(String nome, String cpf, String endereco, char sexo, String nascm, String telefone) {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNascm() {
		return nascm;
	}
	public void setNascm(String nascm) {
		this.nascm = nascm;
	}
}
