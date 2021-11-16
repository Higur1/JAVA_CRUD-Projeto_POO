package DAOImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import DAO.AtendenteDAO;
import Entities.Atendente;

public class AtendenteDAOImpl implements AtendenteDAO{
	private static final String URIDB = "jdbc:mariadb://localhost:3306/clinica";
	private static final String USER = "admin";
	private static final String PASSWORD = "1234";

	public AtendenteDAOImpl() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection(URIDB, USER, PASSWORD);
	}
	
	@Override
	public void adicionar(Atendente atendente) {
		try {
			Connection con = getConnection();
			String sql = "INSERT INTO atendente(nome, username, senha)" + "VALUES(?, ?, ?)";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, atendente.getNome());
			st.setString(2, atendente.getUsername());
			st.setString(3, atendente.getSenha());
			st.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void atualizar(Atendente atendente) {
		try {
			Connection con = getConnection();
			String sql = "UPDATE atendente SET nome = ?, username = ?, senha = ? where codFunc = ?" + "VALUES(?,?,?,?)";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, atendente.getNome());
			st.setString(2, atendente.getUsername());
			st.setString(3, atendente.getSenha());
			st.setInt(4, atendente.getCodFunc());
			st.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void excluir(int id) {
		try {
			Connection con = getConnection();
			String sql = "DELETE FROM atendente WHERE codFunc = ?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, id);
			st.executeUpdate();
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}	
	}
	@Override
	public Atendente encontrarId(int id) {
		return null;
	}

	@Override
	public List<Atendente> mostrarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
