package Boundary;

import Entities.Atendente;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class TelaAtendente {

    public Scene CadastroAtendente (){
        Label lblUserName = new Label("Username:");
        Label lblSenha = new Label("Senha:");
        Label lblNome = new Label("Nome:");
        Label lblCodFunc = new Label("Codigo gerado:");

        TextField txtUsername = new TextField();
        TextField txtSenha = new TextField();
        TextField txtNome = new TextField();
        TextField txtCodFunc = new TextField();

        Button btnSalvar = new Button("Salvar");
        Button btnVoltar = new Button("Voltar");

        GridPane gPane = new GridPane();
        gPane.add(lblNome,0, 0);
        gPane.add(txtNome,1, 0);
        gPane.add(lblUserName,0, 1);
        gPane.add(txtUsername,1, 1);
        gPane.add(lblSenha,0, 2);
        gPane.add(txtSenha,1, 2);
        gPane.add(lblCodFunc, 0, 3);
        gPane.add(txtCodFunc,1, 3);
        gPane.setVgap(10);
        gPane.setHgap(10);
        gPane.setAlignment(Pos.CENTER);

        HBox hbox = new HBox();
        hbox.getChildren().addAll(btnSalvar, btnVoltar);
        hbox.setPadding(new Insets(10, 10, 10, 10));
        hbox.setSpacing(10);
        hbox.setAlignment(Pos.BASELINE_CENTER);
        
        btnSalvar.setOnAction((e) -> {
        	//TelaLoginController.VerificarCodigo();
            Principal.changedScreen("Menu");
        });
        btnVoltar.setOnAction((e) -> {
            Principal.changedScreen("Login");
        });

        VBox vbox = new VBox(gPane, hbox);
        vbox.setAlignment(Pos.CENTER);

        Scene scn = new Scene(vbox, 800,600);
        
        return scn;
    }
    public Pane TelaAtendente() {
    	
    	HBox hb = new HBox();

		Button btnPesquisar = new Button(" Pesquisar ");
		Button btnExcluir = new Button("Excluir");
		
		hb.getChildren().addAll(btnPesquisar, btnExcluir);
		hb.setAlignment(Pos.BASELINE_CENTER);
		hb.setSpacing(10);
		hb.setPadding(new Insets(10,10,10,10));
		
		GridPane painel = new GridPane();
		
		Label lblNome = new Label ("Nome:");
		Label lblUsername = new Label ("Username:");

		TextField txtNome = new TextField();
		TextField txtUsername = new TextField();

		painel.setPadding(new Insets(10,10,10,10));
		painel.setVgap(10);
		painel.setHgap(10);
		
		painel.add(lblNome, 0, 0);
		painel.add(txtNome, 1, 0);
		painel.add(lblUsername, 0, 1);
		painel.add(txtUsername, 1, 1);

		txtNome.setMaxWidth(150);
		txtUsername.setMaxWidth(150);
		
		TableView table = new TableView(); //Tabela
		
		TableColumn<Atendente, String> col1 = new TableColumn<>("Nome");
		col1.setCellValueFactory(
				new PropertyValueFactory<Atendente, String>("Nome")
				);
		
		TableColumn<Atendente, String> col2 = new TableColumn<>("Username");
		col2.setCellValueFactory(
				new PropertyValueFactory<Atendente, String>("Username")
				);

		table.getColumns().addAll(col1,col2);
	
		btnPesquisar.setOnAction( (e) -> {
			//Atendente.control Pesquisar
		});
		
		btnExcluir.setOnAction( (e) -> {
			//Atendente.control Excluir
		});
		
		VBox vb = new VBox(painel, hb, table);
		
		return vb;	
    }
}
