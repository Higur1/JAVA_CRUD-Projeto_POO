package Boundary;

import javafx.application.Application;
import javafx.stage.Stage;

public class Principal extends Application{
	
	private static Stage stage;
		
	@Override
	public void start(Stage stg) throws Exception {
			stage = stg;
			
			TelaMenu tela = new TelaMenu();
			
			stg.setTitle("Clínica Médica");
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
		TelaEspecialidade tEspecialidade = new TelaEspecialidade();
		
		
		switch(nome) {
		case "Menu":
			stage.setScene(tela.Menu());
			break;
		case "Tela Medico":
			stage.setTitle("Clínica Medica: Tela Médico");
			stage.setScene(tMedico.Escolha());
			break;
		case "Tela Paciente":
			stage.setTitle("Clínica Medica: Tela Paciente");
			stage.setScene(tPaciente.Escolha());
			break;
		case "Tela Consulta":
			stage.setTitle("Clínica Medica: Tela Consulta");
			stage.setScene(tConsulta.Escolha());
			break;
		case "Registrar Consulta":
			stage.setTitle("Clínica Médica: Registrar Consulta");
			stage.setScene(tConsulta.RegistrarConsulta());
		case "Cadastrar Especialidade":
			stage.setTitle("Clínica Médica: Cadastrar Especialidade");
			stage.setScene(tEspecialidade.RegistrarEspecialidade());
		}	
	}
}
