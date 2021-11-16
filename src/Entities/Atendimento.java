package Entities;

public class Atendimento {
	
	private String data;
	private String hora;
	private String cpf;
	private int codFunc;
	
	public Atendimento(String data, String hora, String cpf, int codFunc) {
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
	public int getCodFunc() {
		return codFunc;
	}
	public void setCodFunc(int codFunc) {
		this.codFunc = codFunc;
	}
}
