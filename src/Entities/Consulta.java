package Entities;

import java.time.LocalDate;

public class Consulta {
	
	private Long id;
	private String descricao;
	private String cpf;
	private String crm;
	private LocalDate dataConsult;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getData() {
		return dataConsult;
	}

	public void setData(LocalDate data) {
		this.dataConsult = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
}
