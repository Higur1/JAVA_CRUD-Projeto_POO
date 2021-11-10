package Entities;

import java.time.LocalDate;

public class Medico {
	private String nome;
	private Especialidade especialidade;
	private String telefone;
	private String crm;
	private String rua;
	private String num;
	private String cidade;
	private String complemento;
	private LocalDate nascimento;
	
	public Medico(String nome, Especialidade especialidade, String telefone, String crm, 
				  String rua, String num, String cidade, LocalDate nascimento) {
		this.nome = nome;
		this.especialidade = especialidade;
		this.telefone = telefone;
		this.crm = crm;
		this.rua = rua;
		this.num = num;
		this.cidade = cidade;
		this.nascimento = nascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Especialidade getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
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
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}
	
}