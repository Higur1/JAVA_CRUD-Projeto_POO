package Controller;

import DAO.AtendenteDAO;
import DAOImpl.AtendenteDAOImpl;
import Interface.Autenticavel;

import java.sql.SQLException;

public class TelaLoginController {
	public boolean VerificarLogin() throws SQLException, ClassNotFoundException {
		AtendenteDAO atendenteDAO = new AtendenteDAOImpl();

		return false;
		
	}
}
