package DAOImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import DAO.ConsultaDAO;
import Entities.Consulta;

public class ConsultaDAOImpl implements ConsultaDAO{
	private static final String URIDB = "jdbc:mariadb://localhost:3306/clinica";
	private static final String USER = "admin";
	private static final String PASSWORD = "1234";

	public ConsultaDAOImpl() {
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
	public void adicionar(Consulta consulta) {
		try {
			Connection con = getConnection();
			String sql = "INSERT INTO consulta(descricao, cpf, crm, dataHoraConsult)" + "VALUES(?, ?, ?,?)";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, consulta.getDescricao());
			st.setString(2, consulta.getCpf());
			st.setString(3, consulta.getCrm());
			st.setDate(4, java.sql.Date.valueOf(consulta.getDataHoraCons()));
			st.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	@Override
	public void atualizar(Consulta consulta) {
		try {
			Connection con = getConnection();
			String sql = "UPDATE atendimento SET descricao = ?, cpf = ?, crm = ?, dataHoraConsult = ? Where id = ?" + "VALUES(?, ?, ?,?, ?)";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, consulta.getDescricao());
			st.setString(2, consulta.getCpf());
			st.setString(3, consulta.getCrm());
			st.setDate(4, java.sql.Date.valueOf(consulta.getDataHoraCons()));
			st.setLong(5, consulta.getId());
			st.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
	}
	@Override
	public void excluir(Long id) {
		Connection con;
		try {
			con = getConnection();
			String sql = "DELETE FROM consulta WHERE id = ?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setLong(1, id);
			st.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public Consulta encontrarId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Consulta> mostrarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
}
