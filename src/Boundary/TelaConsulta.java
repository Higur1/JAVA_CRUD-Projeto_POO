package Boundary;

import Entities.Consulta;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class TelaConsulta {

	public Scene render() {
		
		Button btnPesquisar = new Button(" Pesquisar ");
		Button btnRegistrarConsulta = new Button (" Registrar consulta ");
		Button btnEditar = new Button(" Editar consulta");
		Button btnExcluir = new Button(" Excluir Consulta");
		Button btnVoltar = new Button (" Voltar ");
		
		Label lblNomePaciente = new Label("Nome do Paciente: ");
		Label lblCpf = new Label(" CPF: ");
		Label lblCrm = new Label(" CRM: ");
		TextField txtNomePaciente = new TextField("Digite aqui");
		txtNomePaciente.setStyle("-fx-text-fill: gray; ");
		TextField txtCpf = new TextField("Digite aqui");
		txtCpf.setStyle("-fx-text-fill: gray");
		TextField txtCrm = new TextField("Digite aqui");
		txtCrm.setStyle("-fx-text-fill: gray");
		
		
		GridPane gp = new GridPane(); //Painel de edição
		
		gp.add(lblNomePaciente, 0, 0);
		gp.add(txtNomePaciente, 1, 0);
		gp.add(lblCpf, 3, 0);
		gp.add(txtCpf, 4, 0);
		gp.add(lblCrm, 5, 0);
		gp.add(txtCrm, 6, 0);
		gp.setPadding(new Insets(10,10,10,10));
		
		HBox hb = new HBox(); //Painel dos botões
		
		hb.getChildren().addAll(btnPesquisar, btnRegistrarConsulta, btnEditar, btnExcluir, btnVoltar);
		hb.setPadding(new Insets (10, 10, 10,10));
		hb.setAlignment(Pos.BASELINE_CENTER);
		hb.setSpacing(10);
		
		//Funções dos botões
		
		btnPesquisar.setOnAction( (e) -> {
			//Consultar.control Pesquisar
		});
		
		btnRegistrarConsulta.setOnAction( (e) -> {
			//Principal.changedScreen("Salvar Consulta");
		});
		
		btnEditar.setOnAction( (e) -> {
			//Consulta.control Editar
		});
		
		btnExcluir.setOnAction( (e) -> {
			//Consulta.control Excluir
		});
		
		
		btnVoltar.setOnAction( (e) -> {
			//Principal.changedScreen("Menu");
		});
	
		

		VBox vb = new VBox(gp, hb); //Painel principal
		vb.setPadding(new Insets(10,10,10,10));
		
		
		
		Scene scn = new Scene(vb, 800, 600);
		return scn;
	}
	public Scene RegistrarConsulta() {
		
		Button btnConsulta = new Button(" Salvar consulta ");
		Button btnVoltar = new Button (" Voltar ");
		
		Label lblDesc = new Label();
		TextArea descr = new TextArea();
		
		GridPane gp = new GridPane();
		
		gp.add(lblDesc, 0, 0);
		gp.add(descr, 0, 3);
		
		Scene scn = new Scene(gp, 800, 600);
		
		return scn;
	}
	public Pane PesquisarConsulta() {
		BorderPane bp = new BorderPane();
		
		TableView table = new TableView(); //Tabela
		
		TableColumn<Consulta, Long> col1 = new TableColumn<>("Id");
		col1.setCellValueFactory(
				new PropertyValueFactory<Consulta, Long>("id")
				);
		
		TableColumn<Consulta, String> col2 = new TableColumn<>("CPF");
		col2.setCellValueFactory(
				new PropertyValueFactory<Consulta, String>("cpf")
				);
		
		TableColumn<Consulta, String> col3 = new TableColumn<>("CRM");
		col3.setCellValueFactory(
				new PropertyValueFactory<Consulta, String>("crm")
				);
		
		TableColumn<Consulta, String> col4 = new TableColumn<>("Descrição");
		col4.setCellValueFactory(
				new PropertyValueFactory<Consulta, String>("descricao")
				);
		
		table.getColumns().addAll(col1,col2, col3, col4);
		
		bp.setCenter(table);
		
		return bp;
	}

}
