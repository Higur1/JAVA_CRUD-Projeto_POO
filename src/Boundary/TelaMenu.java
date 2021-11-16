package Boundary;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

public class TelaMenu {
	public Scene Menu(){
		
		Label bv = new Label("Bem Vindo");
		
		TelaConsulta tConsulta = new TelaConsulta();
		TelaEspecialidade tEspecialidade = new TelaEspecialidade();
		TelaMedico tMedico = new TelaMedico();
		TelaPaciente tPaciente = new TelaPaciente();
	
		BorderPane bp = new BorderPane();
		
		MenuBar menuBar = new MenuBar();
			
		Menu mnuCadastrar = new Menu("Cadastro");
		Menu mnuPesquisar = new Menu("Pesquisar");
		Menu mnuConsulta = new Menu("Consulta");
		Menu mnuSair = new Menu("Sair");
		
		menuBar.getMenus().addAll(mnuCadastrar, mnuPesquisar, mnuConsulta,mnuSair);
		
		MenuItem mnuCadastrarMedico = new MenuItem("Cadastrar Medico");
		mnuCadastrarMedico.setOnAction((e) -> {
			bp.setCenter( tMedico.TelaMedico());
		});
		MenuItem mnuCadastrarPaciente = new MenuItem("Cadastrar Paciente");
		mnuCadastrarPaciente.setOnAction((e) -> {
			bp.setCenter( tPaciente.TelaPaciente());
		});
		MenuItem mnuCadastrarEspecialidade = new MenuItem("Cadastrar Especialidade");
		mnuCadastrarEspecialidade.setOnAction((e) -> {
			bp.setCenter( tEspecialidade.RegistrarEspecialidade());
		});
		MenuItem mnuRegistrarConsulta = new MenuItem("Registrar Consulta");
		mnuRegistrarConsulta.setOnAction((e) -> {
			
		});
		MenuItem mnuPesquisarMedico = new MenuItem("Pesquisar Medico");
		mnuPesquisarMedico.setOnAction((e) -> {
			bp.setCenter( tMedico.ConsultarMedico());
		});
		MenuItem mnuPesquisarPaciente = new MenuItem("Pesquisar Paciente");
		mnuPesquisarPaciente.setOnAction((e) -> {
			bp.setCenter( tPaciente.ConsultarPaciente());
		});
		MenuItem mnuPesquisarEspecialidade = new MenuItem("Pesquisar Especialidade");
		mnuPesquisarEspecialidade.setOnAction((e) -> {
			bp.setCenter( tEspecialidade.ConsultarEspecialidade());
		});
		MenuItem mnuPesquisarConsulta = new MenuItem("Pesquisar Consulta");
		mnuPesquisarConsulta.setOnAction((e) -> {
			bp.setCenter( tConsulta.PesquisarConsulta());
		});
		MenuItem mnuLogOff = new MenuItem("LogOff");
		mnuLogOff.setOnAction((e) -> {
			Principal.changedScreen("Login");
		});
		MenuItem mnuFechar = new MenuItem("Sair");
		mnuFechar.setOnAction((e) -> {
			Platform.exit();
			System.exit(0);
		});
		
		
		mnuCadastrar.getItems().addAll(mnuCadastrarMedico,mnuCadastrarPaciente,mnuCadastrarEspecialidade);
		mnuPesquisar.getItems().addAll(mnuPesquisarMedico,mnuPesquisarPaciente,mnuPesquisarEspecialidade);
		mnuConsulta.getItems().addAll(mnuRegistrarConsulta, mnuPesquisarConsulta);
		mnuSair.getItems().addAll(mnuLogOff, mnuFechar);
		
		bp.setTop(menuBar);
	
		Scene scn = new Scene(bp, 700, 600);
		return scn;
	}
}
