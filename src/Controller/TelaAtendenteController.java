package Controller;

import DAOImpl.AtendenteDAOImpl;
import DAO.AtendenteDAO;
import Entities.Atendente;
import Interface.Autenticavel;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TelaAtendenteController implements Autenticavel {
	IntegerProperty codFunc = new SimpleIntegerProperty(0);
	StringProperty nome = new SimpleStringProperty("");
	StringProperty username = new SimpleStringProperty("");
	StringProperty senha = new SimpleStringProperty("");

	private AtendenteDAO atendenteDAO;
	{
		atendenteDAO = new AtendenteDAOImpl();
	}

	private List<Atendente> atendentesGeral = new ArrayList<>();
	private ObservableList<Atendente> atendentes = FXCollections.observableArrayList();

	public TelaAtendenteController() {
	}

	public void adicionar() {
		Atendente atendente = new Atendente();

	}

	@Override
	public void autenticar(String username, String senha) {
		boolean autenticado = false;
		try {
			autenticado = atendenteDAO.encontrarAcesso(username, senha);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(!autenticado){
			System.out.println("Usuário ou senha inválidos!!!");;
		}
	}

	public Atendente toEntity() {
		Atendente atendente = new Atendente();
		atendente.setCodFunc(codFunc.get());
		atendente.setNome(nome.get());
		atendente.setUsername(username.get());
		atendente.setSenha(senha.get());
		return atendente;
	}

	public void fromEntity(Atendente atendente) {
		codFunc.set(atendente.getCodFunc());
		nome.set(atendente.getNome());
		username.set(atendente.getUsername());
		senha.set(atendente.getSenha());
	}
}
