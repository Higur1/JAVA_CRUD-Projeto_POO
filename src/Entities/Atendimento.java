package Entities;

public class Atendimento {
	
	private String data;
	private String hora;
	private String cpf;
	private String codFunc;
	
	public Atendimento(String data, String hora, String cpf, String codFunc) {
		this.data = data;
		this.hora = hora;
		this.cpf = cpf;
		this.codFunc = codFunc;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCodFunc() {
		return codFunc;
	}
	public void setCodFunc(String codFunc) {
		this.codFunc = codFunc;
	}
}
