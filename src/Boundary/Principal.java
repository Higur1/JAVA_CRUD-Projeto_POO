package Boundary;

import javafx.application.Application;
import javafx.stage.Stage;

public class Principal extends Application {

	private static Stage stage;

	@Override
	public void start(Stage stg) throws Exception {
		stage = stg;

		TelaLogin tela = new TelaLogin();

		stg.setTitle("Clínica Médica: Login");
		stg.setScene(tela.logar());
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
		TelaLogin tLogin = new TelaLogin();
		TelaAtendente tAtendente = new TelaAtendente();

		switch (nome) {
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
			case "Registrar Consulta":
				stage.setTitle("Cl�nica M�dica: Registrar Consulta");
				stage.setScene(tConsulta.RegistrarConsulta());
				break;
			case "Cadastrar Especialidade":
				stage.setTitle("Cl�nica M�dica: Cadastrar Especialidade");
				stage.setScene(tEspecialidade.RegistrarEspecialidade());
				break;
			case "Login":
				stage.setTitle("Cl�nica M�dica: Login");
				stage.setScene(tLogin.logar());
				break;
			case "Cadastrar Atendente":
				stage.setTitle("Cl�nica M�dica: Cadastrar Atendente");
				stage.setScene(tAtendente.CadastroAtendente());
				break;
			case "Consultar Atendente":
				stage.setTitle("Cl�nica M�dica: Consultar Atendente");
				stage.setScene(tAtendente.ConsultaAtendente());
				break;
		}
	}
}
