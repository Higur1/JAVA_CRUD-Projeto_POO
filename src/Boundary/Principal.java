package Boundary;

import javafx.application.Application;
import javafx.stage.Stage;

public class Principal extends Application {

	private static Stage stage;

	@Override
	public void start(Stage stg) throws Exception {
		stage = stg;
		
		TelaLogin tLogin = new TelaLogin();
		
		stg.setTitle("Clinica Medica: Login");
		stg.setScene(tLogin.logar());
		stg.show();

	}

	public static void main(String[] args) {
		Application.launch(Principal.class, args);

	}
	
	public static void changedScreen(String nome) {
		TelaMenu tMenu = new TelaMenu();
		TelaLogin tLogin = new TelaLogin();
		
		switch(nome){
			case "Menu":
				stage.setScene(tMenu.Menu());
				break;
			case "Login":
				stage.setTitle("Clinica Medica: Login");
				stage.setScene(tLogin.logar());
				break;
		}
		
	}
}
