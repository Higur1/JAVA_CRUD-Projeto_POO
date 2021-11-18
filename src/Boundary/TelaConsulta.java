package Boundary;

import Entities.Consulta;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class TelaConsulta {
	public Pane TelaConsulta() {
	
		HBox hb = new HBox();
		
		Button btnSlv = new Button(" Salvar ");
		Button btnEditar = new Button("Editar");
		Button btnPesquisar = new Button(" Pesquisar ");
		Button btnExcluir = new Button("Excluir");
		Button btnVoltar = new Button( " Voltar ");
		
		hb.getChildren().addAll(btnSlv, btnEditar, btnPesquisar, btnExcluir, btnVoltar);
		hb.setAlignment(Pos.BASELINE_CENTER);
		hb.setSpacing(10);
		hb.setPadding(new Insets(10,10,10,10));
		
		GridPane painel = new GridPane();
		
		Label lblCBO = new Label ("CBO:");
		Label lblCPF = new Label ("CPF:");
		Label lblCRM = new Label ("CRM:");
		TextField txtCBO = new TextField();
		TextField txtCPF = new TextField();
		TextField txtCRM = new TextField();
		
		Label lblDesc = new Label("Descricao:");
		TextArea descr = new TextArea();
		
		painel.setPadding(new Insets(10,10,10,10));
		painel.setVgap(10);
		painel.setHgap(10);
		
		painel.add(lblCBO, 0, 0);
		painel.add(txtCBO, 1, 0);
		painel.add(lblCPF, 0, 1);
		painel.add(txtCPF, 1, 1);
		painel.add(lblCRM, 0, 2);
		painel.add(txtCRM, 1, 2);
		painel.add(lblDesc, 0, 3);
		painel.add(descr, 1, 3);
		
		txtCBO.setMaxWidth(150);
		txtCPF.setMaxWidth(150);
		txtCRM.setMaxWidth(150);

		
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
		
		btnSlv.setOnAction( (e) -> {
			//Consultar.control Salvar
		});
		
		btnEditar.setOnAction( (e) -> {
			//Consultar.contrl Edit
		});
		
		btnPesquisar.setOnAction( (e) -> {
			//Consulta.control Pesquisar
		});
		
		btnExcluir.setOnAction( (e) -> {
			//Consulta.control Excluir
		});
		 //btnVoltar.setOnAction( (e) -> {
			//Principal.changedScreen("Menu");
		//});
		
		VBox vb = new VBox(painel, hb, table);
		
		return vb;
	}

}
