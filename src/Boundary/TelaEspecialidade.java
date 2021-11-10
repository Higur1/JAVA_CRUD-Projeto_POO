package Boundary;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class TelaEspecialidade {
	public Scene RegistrarEspecialidade() {
		Label lblCod = new Label(" Código CBO: ");
		Label lblNome = new Label(" Nome da especialidade: ");
		
		TextField txtCod = new TextField();
		TextField txtNome = new TextField();
		
		GridPane painel = new GridPane();	
		
		painel.add(lblCod, 0, 0);
		painel.add(txtCod, 1, 0);
		painel.add(lblNome, 0, 1);
		painel.add(txtNome, 1, 1);
		
		painel.setAlignment(Pos.CENTER_LEFT);
		painel.setVgap(10);
		painel.setHgap(10);
		
		Scene scn = new Scene(painel, 600, 300);
		
		return scn;
	
	}
}
