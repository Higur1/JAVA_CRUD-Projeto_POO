package DAOImpl;

import java.sql.*;
import java.util.List;

import DAO.AtendenteDAO;
import DAO.GenericDAO;
import Entities.Atendente;

public class AtendenteDAOImpl implements AtendenteDAO{

	private Connection c;

	public AtendenteDAOImpl() {
		GenericDAO gDao = new GenericDAO();
		try {
			c = gDao.getConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void adicionar(Atendente atendente) {
		try {
			String sql = "INSERT INTO atendente(nome, username, senha)" + "VALUES(?, ?, ?)";

			PreparedStatement st = c.prepareStatement(sql);
			st.setString(1, atendente.getNome());
			st.setString(2, atendente.getUsername());
			st.setString(3, atendente.getSenha());

			st.execute();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void atualizar(Atendente atendente) {
		try {
			String sql = "UPDATE atendente SET nome = ?, username = ?, senha = ? where codFunc = ?" + "VALUES(?,?,?,?)";

			PreparedStatement st = c.prepareStatement(sql);
			st.setString(1, atendente.getNome());
			st.setString(2, atendente.getUsername());
			st.setString(3, atendente.getSenha());
			st.setInt(4, atendente.getCodFunc());

			st.execute();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void excluir(int id) {
		try {
			String sql = "DELETE FROM atendente WHERE codFunc = ?";

			PreparedStatement st = c.prepareStatement(sql);
			st.setInt(1, id);

			st.execute();
			st.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}	
	}
	@Override
	public Atendente buscarPorCodFunc(int codFunc) {
		return null;
	}

	@Override
	public boolean encontrarAcesso(String username, String senha) {
		try{
			String sql = "SELECT * FROM atedente WHERE username = ? AND senha = ?";

			PreparedStatement st = c.prepareStatement(sql);
			st.setString(1, username);
			st.setString(2, senha);

			ResultSet rs = st.executeQuery();

			if(rs.wasNull()){
				System.out.println("Username ou Senha incorretos!!!");
				return false;
			}
		} catch (SQLException e){
			System.out.println(e);
			return false;
		}
		return true;
	}

	@Override
	public List<Atendente> mostrarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
