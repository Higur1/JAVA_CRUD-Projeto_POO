package Boundary;

import javafx.application.Application;
import javafx.stage.Stage;

public class Principal extends Application{
	
	private static Stage stage;
		
	@Override
	public void start(Stage stg) throws Exception {
			stage = stg;
			
			TelaMenu tela = new TelaMenu();
			
			stg.setTitle("Cl�nica M�dica");
			stg.setScene(tela.Menu());
			stg.show();

	}
	
	public static void main(String[] args) {
		Application.launch(Principal.class, args);

	}

	public static void changedScreen(String nome) {
		
		TelaMenu tela = new TelaMenu();
		TelaMedico tMedico = new TelaMedico();
		TelaPaciente tPaciente = new TelaPaciente();
		TelaConsulta tConsulta = new TelaConsulta();
		
		
		switch(nome) {
		case "Menu":
			stage.setScene(tela.Menu());
			break;
		case "Tela Medico":
			stage.setTitle("Cl�nica Medica: Tela M�dico");
			stage.setScene(tMedico.Escolha());
			break;
		case "Tela Paciente":
			stage.setTitle("Cl�nica Medica: Tela Paciente");
			stage.setScene(tPaciente.Escolha());
			break;
		case "Tela Consulta":
			stage.setTitle("Cl�nica Medica: Tela Consulta");
			stage.setScene(tConsulta.Escolha());
			break;
		case "Cadastrar Medico":
			stage.setScene(tMedico.CadastrarMedico());
			break;
		case "Consultar Medico":
			stage.setScene(tMedico.ConsultarMedico());
		}
	}
}
