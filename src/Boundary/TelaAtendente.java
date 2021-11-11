package Boundary;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class TelaAtendente {

    public Scene CadastroAtendente (){
        Label lblUserName = new Label("Username:");
        Label lblSenha = new Label("Senha:");
        Label lblNome = new Label("Nome:");

        TextField txtUsername = new TextField();
        TextField txtSenha = new TextField();
        TextField txtNome = new TextField();

        Button btnSalvar = new Button("Salvar");
        Button btnVoltar = new Button("Voltar");

        GridPane gPane = new GridPane();
        gPane.add(lblNome,0, 0);
        gPane.add(txtNome,1, 0);
        gPane.add(lblUserName,0, 1);
        gPane.add(txtUsername,1, 1);
        gPane.add(lblSenha,0, 2);
        gPane.add(txtSenha,1, 2);
        lblSenha.setAlignment(Pos.BASELINE_RIGHT);
        gPane.setVgap(10);
        gPane.setHgap(10);
        gPane.setAlignment(Pos.CENTER);

        HBox hbox = new HBox();
        hbox.getChildren().addAll(btnSalvar, btnVoltar);
        hbox.setPadding(new Insets(10, 10, 10, 10));
        hbox.setSpacing(10);
        hbox.setAlignment(Pos.BASELINE_CENTER);

        VBox vbox = new VBox(gPane, hbox);
        vbox.setAlignment(Pos.CENTER);

        btnSalvar.setOnAction((e) -> {
            Principal.changedScreen("Menu");
        });

        btnVoltar.setOnAction((e) -> {
            Principal.changedScreen("Login");
        });

        Scene scn = new Scene(vbox, 600, 400);
        return scn;
    }

    public Scene ConsultaAtendente (){
        Label lblCodFunc = new Label("Codigo do Funcionario:");
        Label lblUserName = new Label("Username:");
        Label lblSenha = new Label("Senha:");
        Label lblNome = new Label("Nome:");

        TextField txtUsername = new TextField();
        TextField txtSenha = new TextField();
        TextField txtNome = new TextField();

        Button btnVoltar = new Button("Voltar");

        GridPane gPane = new GridPane();
        gPane.add(lblCodFunc,0, 0);
        gPane.add(lblNome,0, 1);
        gPane.add(txtNome,1, 1);
        gPane.add(lblUserName,0, 2);
        gPane.add(txtUsername,1, 2);
        gPane.add(lblSenha,0, 3);
        gPane.add(txtSenha,1, 3);
        lblSenha.setAlignment(Pos.BASELINE_RIGHT);
        gPane.setVgap(10);
        gPane.setHgap(10);
        gPane.setAlignment(Pos.CENTER);

        HBox hbox = new HBox();
        hbox.getChildren().addAll(btnVoltar);
        hbox.setPadding(new Insets(10, 10, 10, 10));
        hbox.setSpacing(10);
        hbox.setAlignment(Pos.BASELINE_CENTER);

        VBox vbox = new VBox(gPane, hbox);
        vbox.setAlignment(Pos.CENTER);

        btnVoltar.setOnAction((e) -> {
            Principal.changedScreen("Menu");
        });

        Scene scn = new Scene(vbox, 800, 500);
        return scn;
    }
}
