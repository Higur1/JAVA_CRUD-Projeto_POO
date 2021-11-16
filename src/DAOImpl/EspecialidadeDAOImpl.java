package DAOImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import DAO.EspecialidadeDAO;
import Entities.Especialidade;

public class EspecialidadeDAOImpl implements EspecialidadeDAO{

	private static final String URIDB = "jdbc:mariadb://localhost:3306/clinica";
	private static final String USER = "admin";
	private static final String PASSWORD = "1234";

	public EspecialidadeDAOImpl() {
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
	public void adicionar(Especialidade especialidade) {
		try {
			Connection con = getConnection();
			String sql = "INSERT INTO especialidade(nome, cbo)" + "VALUES(?,?)";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, especialidade.getNome());
			st.setString(2, especialidade.getCbo());
			st.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	@Override
	public void atualizar(Especialidade especialidade) {
		try {
			Connection con = getConnection();
			String sql = "UPDATE especialidade SET nome = ?, cbo = ? WHERE id = ?" + "VALUES(?,?,?)";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, especialidade.getNome());
			st.setString(2, especialidade.getCbo());
			st.setLong(3, especialidade.getId());
			st.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void excluir(Long id) {
		try {
			Connection con = getConnection();
			String sql = "DELETE FROM especialidade WHERE id = ?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setLong(1, id);
			st.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public Especialidade encontrarId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Especialidade> mostrarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
}
