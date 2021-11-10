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
		
		HBox hb = new HBox();
		
		Button btnSlv = new Button(" Salvar ");
		Button btnPesquisar = new Button(" Pesquisar ");
		Button btnVoltar = new Button( " Voltar ");
		
		hb.getChildren().addAll(btnSlv, btnPesquisar, btnVoltar);
		hb.setAlignment(Pos.BASELINE_CENTER);
		hb.setSpacing(10);
		hb.setPadding(new Insets(10,10,10,10));
		
		Label lblNome = new Label(" Nome: ");
		Label lblEspec = new Label(" Especializa��o: ");
		Label lblTelefone = new Label (" Telefone: ");
		Label lblCrm = new Label(" CRM: ");
		Label lblEndereco = new Label (" Endere�o: ");
		Label lblNasc = new Label (" Data de nascimento: ");
		TextField txtNome = new TextField();
		TextField txtEspec = new TextField();
		TextField txtTel = new TextField();
		TextField txtCrm = new TextField();
		TextField txtEndereco = new TextField();
		TextField txtNasc = new TextField();
		
		GridPane painel = new GridPane();
		
		painel.setAlignment(Pos.TOP_LEFT);
		
		painel.add(lblNome, 0, 0);
		painel.add(txtNome, 1, 0);
		painel.add(lblEspec, 0, 1);
		painel.add(txtEspec, 1, 1);
		painel.add(lblTelefone, 0, 2);
		painel.add(txtTel, 1, 2);
		
		painel.add(lblCrm, 2, 0);
		painel.add(txtCrm, 3, 0);
		painel.add(lblEndereco, 2, 1);
		painel.add(txtEndereco, 3, 1);
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
			Principal.changedScreen("Menu");
		});
		
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
		TableColumn<Medico, String> col4 = new TableColumn<>("CRM");
		col4.setCellValueFactory(
				new PropertyValueFactory<Medico, String>("crm")
				);
		
		TableColumn<Medico, String> col5 = new TableColumn<>("Telefone");
		col5.setCellValueFactory(
				new PropertyValueFactory<Medico, String>("telefone")
				);
		
		TableColumn<Medico, String> col6 = new TableColumn<>("Endereco");
		col6.setCellValueFactory(
				new PropertyValueFactory<Medico, String>("endereco")
				);
		
		TableColumn<Medico, LocalDate> col7 = new TableColumn<>("Nascimento");
		col7.setCellValueFactory(
				new PropertyValueFactory<Medico, LocalDate>("nascimento")
				);
		
		table.getColumns().addAll(col1,col2,col3,col4,col5, col6);
		
		VBox painelP = new VBox(painel, hb, table);
		
		Scene scn = new Scene(painelP, 800, 600);
		
		return scn;
	}
}
