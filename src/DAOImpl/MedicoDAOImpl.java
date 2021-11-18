package DAOImpl;

import java.util.List;

import DAO.MedicoDAO;
import Entities.Medico;

public class MedicoDAOImpl implements MedicoDAO{

	private static final String URL = "jdbc:mariadb://localhost:3306/clinica";
	private static final String USER = "admin";
	private static final String PASSWORD = "1234";

	public MedicoDAOImpl() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void adicionar(Medico medico) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(String crm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(String crm, Medico m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Medico> pesquisarPorCRM(String crm) {
		// TODO Auto-generated method stub
		return null;
	}

}
