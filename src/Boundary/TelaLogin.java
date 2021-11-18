package Boundary;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


public class TelaLogin {

    public Scene logar() {
   
        Label lblUserName = new Label("Username:");
        Label lblSenha = new Label("Senha:");

        TextField txtUsername = new TextField();
        TextField txtSenha = new TextField();

        Button btnLogin = new Button("Login");
        Button btnCadastro = new Button("Cadastrar-se");

        GridPane gPane = new GridPane();
        gPane.add(lblUserName,0, 0);
        gPane.add(txtUsername,1, 0);
        gPane.add(lblSenha,0, 1);
        gPane.add(txtSenha,1, 1);
        lblSenha.setAlignment(Pos.BASELINE_RIGHT);
        gPane.setVgap(10);
        gPane.setHgap(10);
        gPane.setAlignment(Pos.CENTER);

        HBox hbox = new HBox();
        hbox.getChildren().addAll(btnLogin, btnCadastro);
        hbox.setPadding(new Insets(10, 10, 10, 10));
        hbox.setSpacing(10);
        hbox.setAlignment(Pos.BASELINE_CENTER);

        VBox vbox = new VBox(gPane, hbox);
        vbox.setAlignment(Pos.CENTER);

        btnLogin.setOnAction((e) -> {
           //TelaLoginController.VerificarAcesso();
           Principal.changedScreen("Menu");
        });
        btnCadastro.setOnAction((e) -> {
            Principal.changedScreen("Cadastrar-se");
        });
       
        Scene scn = new Scene(vbox, 800, 600);
        
        return scn;
    }

	public Pane GerarCodigo() {
		Label lblCodigo = new Label("CODIGO");
		Button btnGerarCodigo = new Button("Gerar Codigo");
		//lblCodigo.setText(TelaLoginController.gerarCodigo());
		
		VBox vb = new VBox(lblCodigo, btnGerarCodigo);
		vb.setAlignment(Pos.CENTER);
		return vb;
	}
}
