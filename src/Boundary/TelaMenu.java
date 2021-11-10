package Boundary;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaMenu {
	
	private TelaMedico tMedico = new TelaMedico();
	private TelaConsulta tConsulta = new TelaConsulta();
	private TelaPaciente tPaciente = new TelaPaciente();
	
	private Button btnTelaMedico = new Button("Cadastrar Médico");
	private Button btnTelaConsulta = new Button("Registrar Consulta");
	private Button btnTelaPaciente = new Button("Cadastrar Paciente");
	
	public Scene Menu() {
		btnTelaMedico.setMaxWidth(150);
		btnTelaMedico.setMinHeight(40);
		btnTelaConsulta.setMaxWidth(150);
		btnTelaConsulta.setMinHeight(40);
		btnTelaPaciente.setMaxWidth(150);
		btnTelaPaciente.setMinHeight(40);
		
		VBox painel = new VBox(btnTelaMedico, btnTelaConsulta, btnTelaPaciente);
		
		painel.setAlignment(Pos.CENTER);
		painel.setSpacing(20);
		
		Scene scn = new Scene(painel, 600, 300);
		
		btnTelaMedico.setOnAction( (e) -> {
			Principal.changedScreen("Tela Medico");
		});
		
		//btnTelaPaciente.setOnAction( (e) -> {
			//Principal.changedScreen(2);
		//});
		
		//btnTelaConsulta.setOnAction( (e) -> {
			//Principal.changedScreen(3);
		//});
		
		return scn;
		
		
	}
}
