package Boundary;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Entities.Medico;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class TelaMedico {
	public Scene Escolha() {
		Button btnCadastrarMedico = new Button("Cadastrar Médico");
		Button btnConsultarMedico = new Button("Consultar Médicos cadastrados");
		Button btnVoltar = new Button("Voltar");
		
		VBox painel = new VBox(btnCadastrarMedico, btnConsultarMedico, btnVoltar);

		btnCadastrarMedico.setMaxWidth(150);
		btnCadastrarMedico.setMinHeight(40);
		btnConsultarMedico.setMaxWidth(150);
		btnConsultarMedico.setMinHeight(40);
		btnVoltar.setMaxWidth(150);
		btnVoltar.setMinHeight(40);
		
		painel.setAlignment(Pos.CENTER);
		painel.setSpacing(10);
		
		btnCadastrarMedico.setOnAction((e) -> {
			Principal.changedScreen("Cadastrar Medico");
		});
		
		btnConsultarMedico.setOnAction( (e) -> {
			Principal.changedScreen("Consultar Medico");
		});
		
		btnVoltar.setOnAction( (e) -> {
			Principal.changedScreen("Menu");
		});
		
		Scene scn = new Scene(painel, 600,400);
		
		return scn;
		
	}
	Scene ConsultarMedico() {
		List<Medico> lista = new ArrayList(); 
		
		TableView <Medico> table = new TableView<>();
		
		TableColumn<Medico, Long> col1 = new TableColumn<>("Id");
		col1.setCellValueFactory(
				new PropertyValueFactory<Medico, Long>("id")
				);
		
		TableColumn<Medico, String> col2 = new TableColumn<>("Nome");
		col2.setCellValueFactory(
				new PropertyValueFactory<Medico, String>("nome")
				);
		
		TableColumn<Medico, String> col3 = new TableColumn<>("Especialidade");
		col3.setCellValueFactory(
				new PropertyValueFactory<Medico, String>("Especialidade")
				);
		
		TableColumn<Medico, String> col4 = new TableColumn<>("Telefone");
		col4.setCellValueFactory(
				new PropertyValueFactory<Medico, String>("telefone")
				);
		
		TableColumn<Medico, String> col5 = new TableColumn<>("Endereco");
		col5.setCellValueFactory(
				new PropertyValueFactory<Medico, String>("endereco")
				);
		
		TableColumn<Medico, LocalDate> col6 = new TableColumn<>("Nascimento");
		col6.setCellValueFactory(
				new PropertyValueFactory<Medico, LocalDate>("nascimento")
				);
		
		table.getColumns().addAll(col1,col2,col3,col4,col5);
		
		Scene scn = new Scene(table, 600,400);
		
		return scn;
	}
	
	public Scene CadastrarMedico() {
		
		HBox hb = new HBox();
		
		Button btnSlv = new Button(" Salvar ");
		Button btnVoltar = new Button( " Voltar ");
		
		hb.getChildren().addAll(btnSlv, btnVoltar);
		hb.setAlignment(Pos.BASELINE_CENTER);
		hb.setSpacing(10);
		hb.setPadding(new Insets(10,10,10,10));
		
		Label lblNome = new Label(" Nome: ");
		Label lblEspec = new Label(" Especialização: ");
		Label lblTelefone = new Label (" Telefone: ");
		Label lblCrm = new Label(" CRM: ");
		Label lblEndereco = new Label (" Endereço: ");
		Label lblNasc = new Label (" Data de nascimento: ");
		TextField txtNome = new TextField();
		TextField txtEspec = new TextField();
		TextField txtTel = new TextField();
		TextField txtCrm = new TextField();
		TextField txtEndereco = new TextField();
		TextField txtNasc = new TextField();
		
		GridPane painel = new GridPane();
		
		painel.setAlignment(Pos.CENTER_LEFT);
		
		painel.add(lblNome, 0, 0);
		painel.add(txtNome, 1, 0);
		painel.add(lblEspec, 0, 1);
		painel.add(txtEspec, 1, 1);
		painel.add(lblTelefone, 0, 2);
		painel.add(txtTel, 1, 2);
		painel.add(lblCrm, 0, 3);
		painel.add(txtCrm, 1, 3);
		painel.add(lblEndereco, 0, 4);
		painel.add(txtEndereco, 1, 4);
		painel.add(lblNasc, 0, 5);
		painel.add(txtNasc, 1, 5);
	
		painel.setVgap(10);
		painel.setHgap(10);
		
		BorderPane painelP = new BorderPane();
		
		painelP.setCenter(painel);
		painelP.setBottom(hb);
		
		btnVoltar.setOnAction( (e) -> {
			Principal.changedScreen("Tela Medico");
		});
		
		Scene scn = new Scene(painelP, 600, 300);
		
		
		return scn;
	}
}
