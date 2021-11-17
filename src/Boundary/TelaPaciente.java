package Boundary;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Entities.Paciente;
//import Entities.Medico;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class TelaPaciente {

	public Pane TelaPaciente() {
		
		HBox hb = new HBox();
		
		Button btnSlv = new Button(" Salvar ");
		Button btnPesquisar = new Button(" Pesquisar ");
		Button btnVoltar = new Button( " Voltar ");
		
		hb.getChildren().addAll(btnSlv, btnPesquisar, btnVoltar);
		hb.setAlignment(Pos.BASELINE_CENTER);
		hb.setSpacing(10);
		hb.setPadding(new Insets(10,10,10,10));
		
		Label lblNome = new Label(" Nome: ");
		Label lblCpf = new Label(" CPF: ");
		Label lblTel = new Label (" Telefone: ");
		Label lblEnd = new Label(" Endereço: ");
		Label lblSexo = new Label (" Sexo: ");
		Label lblNasc = new Label (" Data de nascimento: ");
		TextField txtNome = new TextField();
		TextField txtCpf = new TextField();
		TextField txtTel = new TextField();
		TextField txtEnd = new TextField();
		TextField txtSexo = new TextField();
		TextField txtNasc = new TextField();
		
		GridPane painel = new GridPane();
		
		painel.setAlignment(Pos.TOP_LEFT);
		
		painel.add(lblNome, 0, 0);
		painel.add(txtNome, 1, 0);
		painel.add(lblCpf, 0, 1);
		painel.add(txtCpf, 1, 1);
		painel.add(lblTel, 0, 2);
		painel.add(txtTel, 1, 2);
		
		painel.add(lblEnd, 2, 0);
		painel.add(txtEnd, 3, 0);
		painel.add(lblSexo, 2, 1);
		painel.add(txtSexo, 3, 1);
		painel.add(lblNasc, 2, 2);
		painel.add(txtNasc, 3, 2);
	
		painel.setVgap(10);
		painel.setHgap(10);
		
		painel.setPadding(new Insets(10,10,10,10));
		
		
		btnSlv.setOnAction( (e) -> {
			//MedicoControl
		});
		
		btnPesquisar.setOnAction( (e) -> {
			//MedicoControl
		});
		
		btnVoltar.setOnAction( (e) -> {
			//Principal.changedScreen("Menu");
		});
		
		List<Paciente> lista = new ArrayList(); 
		
		
		
		VBox painelP = new VBox(painel, hb);
	
		return painelP;
	}
	public Pane ConsultarPaciente() {

		Label lblCPF = new Label ("CPF:");
		Label lblNome = new Label ("Nome:");
		TextField txtCPF = new TextField();
		TextField txtNome = new TextField();
		Button btnPesquisar = new Button(" Pesquisar ");
		Button btnVoltar = new Button(" Voltar ");

		GridPane painel = new GridPane();
		painel.setAlignment(Pos.TOP_LEFT);
		painel.add(lblNome, 0, 0);
		painel.add(txtNome, 1, 0);
		painel.add(lblCPF, 0, 1);
		painel.add(txtCPF, 1, 1);
		painel.add(btnPesquisar, 0, 2);
		painel.add(btnVoltar, 1, 2);

		painel.setPadding(new Insets(10,10,10,10));
		painel.setVgap(10);
		painel.setHgap(10);

		TableView <Paciente> table = new TableView<>();

		TableColumn<Paciente, Long> col1 = new TableColumn<>("Id");
		col1.setCellValueFactory(
				new PropertyValueFactory<Paciente, Long>("id")
				);
		
		TableColumn<Paciente, String> col2 = new TableColumn<>("Nome");
		col2.setCellValueFactory(
				new PropertyValueFactory<Paciente, String>("nome")
				);
		
		TableColumn<Paciente, String> col3 = new TableColumn<>("CPF");
		col3.setCellValueFactory(
				new PropertyValueFactory<Paciente, String>("cpf")
				);
		
		TableColumn<Paciente, String> col4 = new TableColumn<>("Telefone");
		col4.setCellValueFactory(
				new PropertyValueFactory<Paciente, String>("telefone")
				);
		
		TableColumn<Paciente, String> col5 = new TableColumn<>("Endereco");
		col5.setCellValueFactory(
				new PropertyValueFactory<Paciente, String>("endereco")
				);
		
		TableColumn<Paciente, String> col6 = new TableColumn<>("Sexo");
		col6.setCellValueFactory(
				new PropertyValueFactory<Paciente, String>("sexo")
				);
		TableColumn<Paciente , LocalDate> col7 = new TableColumn<>("Nascimento");
		col7.setCellValueFactory(
				new PropertyValueFactory<Paciente, LocalDate>("nascimento")
				);
		table.getColumns().addAll(col1,col2,col3,col4,col5, col6, col7);
		
		BorderPane bp = new BorderPane();
		bp.setCenter(table);
		bp.setTop(painel);

		return bp;
	}
}
