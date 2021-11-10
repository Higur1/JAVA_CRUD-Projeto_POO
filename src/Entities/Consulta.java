package Entities;

import java.time.LocalDateTime;

public class Consulta {
	
	private String descricao;
	private String cpf;
	private String crm;
	private LocalDateTime dataHoraConsult;
	
	public Consulta(String descricao, String cpf, String crm, LocalDateTime dataHoraConsult) {
		this.descricao = descricao;
		this.cpf = cpf;
		this.crm = crm;
		this.dataHoraConsult = dataHoraConsult;
	}
	
	public LocalDateTime getDataHoraCons() {
		return dataHoraConsult;
	}
	public void setDataHoraCons(LocalDateTime dataHoraCons) {
		this.dataHoraConsult = dataHoraCons;
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
