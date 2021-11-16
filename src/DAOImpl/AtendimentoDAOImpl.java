package DAOImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import DAO.AtendimentoDAO;
import Entities.Atendimento;

public class AtendimentoDAOImpl implements AtendimentoDAO{
	private static final String URIDB = "jdbc:mariadb://localhost:3306/clinica";
	private static final String USER = "admin";
	private static final String PASSWORD = "1234";

	public AtendimentoDAOImpl() {
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
	public void adicionar(Atendimento atendimento) {
		try {
			Connection con = getConnection();
			String sql = "INSERT INTO atendimento(data, hora, cpf, codFunc)" + "VALUES(?, ?, ?,?)";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, atendimento.getData());
			st.setString(2, atendimento.getHora());
			st.setString(3, atendimento.getCpf());
			st.setInt(4, atendimento.getCodFunc());
			st.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}

	@Override
	public void atualizar(Atendimento atendimento) {
		try {
			Connection con = getConnection();
			String sql = "UPDATE atendimento SET nome = ?, username = ?, senha = ? where codFunc = ?" + "VALUES(?,?,?,?)";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, atendimento.getData());
			st.setString(2, atendimento.getHora());
			st.setString(3, atendimento.getCpf());
			st.setInt(4, atendimento.getCodFunc());
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
			String sql = "DELETE FROM atendimento WHERE codFunc = ?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, id);
			st.executeUpdate();
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}	
	}

	@Override
	public Atendimento encontrarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Atendimento> mostrarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
}
