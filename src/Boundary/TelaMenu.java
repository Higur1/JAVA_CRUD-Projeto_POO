package Boundary;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class TelaMenu {
	
	private TelaMedico tMedico = new TelaMedico();
	private TelaConsulta tConsulta = new TelaConsulta();
	private TelaPaciente tPaciente = new TelaPaciente();
	private TelaEspecialidade tEspecialidade = new TelaEspecialidade();
	private TelaAtendente tAtendenteConsulta = new TelaAtendente();
	
	private Button btnTelaMedico = new Button("Cadastrar/Pesquisar Médico");
	private Button btnTelaPaciente = new Button("Cadastrar/Pesquisar Paciente");
	private Button btnTelaConsulta = new Button("Cadastrar/Pesquisar Consulta");
	private Button btnTelEspec = new Button ("Cadastrar/Pesquisar Especialidade");
	private Button btnTelaAtendente = new Button("Pesquisar Atendente");
	
	public Scene Menu() {
		btnTelaMedico.setMaxWidth(300);
		btnTelaMedico.setMinHeight(40);
		btnTelaConsulta.setMaxWidth(150);
		btnTelaConsulta.setMinHeight(40);
		btnTelaPaciente.setMaxWidth(150);
		btnTelaPaciente.setMinHeight(40);
		btnTelEspec.setMaxWidth(150);
		btnTelEspec.setMinHeight(40);
		btnTelaAtendente.setMaxWidth(150);
		btnTelaAtendente.setMinHeight(40);
		
		VBox painel = new VBox(btnTelaMedico, btnTelaPaciente, btnTelaConsulta, btnTelEspec, btnTelaAtendente);
		
		painel.setAlignment(Pos.CENTER);
		painel.setSpacing(20);
		
		Scene scn = new Scene(painel, 600, 300);
		
		btnTelaMedico.setOnAction( (e) -> {
			Principal.changedScreen("Tela Medico");
		});
		btnTelaPaciente.setOnAction( (e) -> {
			Principal.changedScreen("Tela Paciente");
		});
		btnTelaConsulta.setOnAction( (e) -> {
			Principal.changedScreen("Tela Consulta");
		});
		btnTelEspec.setOnAction( (e) -> {
			Principal.changedScreen("Cadastrar Especialidade");
		});
		btnTelaAtendente.setOnAction( (e) -> {
			Principal.changedScreen("Consultar Atendente");
		});
	
		
		return scn;
	}
}
