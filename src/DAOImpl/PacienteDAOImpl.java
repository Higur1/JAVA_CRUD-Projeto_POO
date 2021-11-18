package DAOImpl;

import java.util.List;

import DAO.PacienteDAO;
import Entities.Paciente;

public class PacienteDAOImpl implements PacienteDAO {

	private static final String URL = "jdbc:mariadb://localhost:3306/clinica";
	private static final String USER = "admin";
	private static final String PASSWORD = "1234";

	public PacienteDAOImpl() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void adicionar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionar(Paciente paciente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Paciente> pesquisarPorCPF(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(String cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(String cpf, Paciente paciente) {
		// TODO Auto-generated method stub
		
	}
}
