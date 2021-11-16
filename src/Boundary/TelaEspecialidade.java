package Boundary;

import Entities.Especialidade;
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

public class TelaEspecialidade {
	public Pane RegistrarEspecialidade() {
		
		Button btnSlv = new Button("Salvar");
		Button btnEdit = new Button("Editar");
		Button btnPesquisar = new Button("Pesquisar");
		Button btnExcluir = new Button("Excluir");
		Button btnVoltar = new Button("Voltar");
		
		Label lblCod = new Label(" Código CBO: ");
		Label lblNome = new Label(" Nome da especialidade: ");
		
		TextField txtCod = new TextField();
		TextField txtNome = new TextField();
		
		HBox hb = new HBox(); //Painel dos botões
		
		hb.getChildren().addAll(btnSlv, btnEdit, btnPesquisar, btnExcluir, btnVoltar);
		
		hb.setAlignment(Pos.BASELINE_CENTER);
		hb.setSpacing(10);
		
		
		GridPane painel = new GridPane();	//Painel de edição
		
		painel.add(lblCod, 0, 0);
		painel.add(txtCod, 1, 0);
		painel.add(lblNome, 0, 1);
		painel.add(txtNome, 1, 1);
		
		painel.setAlignment(Pos.CENTER_LEFT);
		painel.setVgap(10);
		painel.setHgap(10);
		
		painel.setPadding(new Insets(10,10,10,10));
		
		VBox vb = new VBox(painel, hb); //Painel Principal
		vb.setPadding(new Insets(10,10,10,10));
		vb.setSpacing(10);
		
		
		//Funções dos botões
		
		btnSlv.setOnAction( (e) -> {
			//Consultar.control Salvar
		});
		
		btnEdit.setOnAction( (e) -> {
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

		return vb;
	}
	public Pane ConsultarEspecialidade() {
		BorderPane bp = new BorderPane();
		
		TableView table = new TableView(); 
		
		TableColumn<Especialidade, Long> col1 = new TableColumn<>("Id");
		col1.setCellValueFactory(
				new PropertyValueFactory<Especialidade, Long>("id")
				);
		
		TableColumn<Especialidade, String> col2 = new TableColumn<>("Nome da especialidade");
		col2.setCellValueFactory(
				new PropertyValueFactory<Especialidade, String>("nome")
				);
		table.getColumns().addAll(col1,col2);
		
		bp.setCenter(table);
		return bp;
	}
}
