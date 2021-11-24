package Controller;

import Boundary.Principal;
import DAO.AtendenteDAO;
import DAOImpl.AtendenteDAOImpl;
import Interface.Autenticavel;

import java.sql.SQLException;

public class TelaLoginController  {
	public void VerificarAcesso(String username, String senha) throws SQLException, ClassNotFoundException {
		AtendenteDAO atendenteDAO = new AtendenteDAOImpl();
		if(atendenteDAO.encontrarAcesso(username, senha)){
			Principal.changedScreen("Menu");
		}
		else {
			Principal.changedScreen("Login");
		}
	}
}
