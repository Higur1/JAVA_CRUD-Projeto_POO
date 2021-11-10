package Entities;

import java.time.LocalDate;

public class Paciente {
	private String nome;
	private String cpf;
	private char sexo;
	private LocalDate nascm;
	private String telefone;
	private String rua;
	private String num;
	private String cidade;
	private String complemento;
	
	public Paciente(String nome, String cpf, char sexo, LocalDate nascm, String telefone, 
					String rua, String num, String cidade) {
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.nascm = nascm;
		this.telefone = telefone;
		this.rua = rua;
		this.num = num;
		this.cidade = cidade;
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
	public LocalDate getNascm() {
		return nascm;
	}
	public void setNascm(LocalDate nascm) {
		this.nascm = nascm;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
