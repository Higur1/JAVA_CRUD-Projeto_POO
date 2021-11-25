package DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.EspecialidadeDAO;
import DAO.GenericDAO;
import Entities.Especialidade;

public class EspecialidadeDAOImpl implements EspecialidadeDAO{
	
	GenericDAO gDao = new GenericDAO();
	
	@Override
	public void adicionar(Especialidade especialidade) {
		try {
			Connection con = gDao.getConnection();
			String sql = "INSERT INTO especialidade(nome, cbo)" + "VALUES(?,?)";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, especialidade.getNome());
			st.setString(2, especialidade.getCbo());
			st.executeUpdate();
			st.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	@Override
	public void atualizar(Especialidade especialidade) {
		try {
			Connection con = gDao.getConnection();
			String sql = "UPDATE especialidade SET nome = ? WHERE cbo = ?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, especialidade.getNome());
			st.setString(2, especialidade.getCbo());
			st.executeUpdate();
			st.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void excluir(String cbo) {
		try {
			Connection con = gDao.getConnection();
			String sql = "DELETE FROM especialidade WHERE cbo = ?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, cbo);
			st.executeUpdate();
			st.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public List<Especialidade> pesquisarTodos() {
		 List<Especialidade> lista = new ArrayList<>();
	     try{
	    	Connection con = gDao.getConnection();
	        String sql = "SELECT * FROM especialidade";
	        PreparedStatement st = con.prepareStatement(sql);
	        ResultSet rs = st.executeQuery();
	        	while( rs.next() ) {
	                Especialidade e = new Especialidade();
	                
	                e.setCbo(rs.getString("cbo"));
	                e.setNome(rs.getString("nome"));
	                lista.add(e);
	            }
	        rs.close();
	        st.close();
	        con.close();
	        }catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return lista;
	}

	@Override
	public Especialidade findEspecialidadeByNome(String nome) {
		Especialidade especialidade = new Especialidade();
		try{
			Connection con = gDao.getConnection();
			String sql = "SELECT * FROM especialidade WHERE nome = ?";
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			especialidade.setCbo(rs.getString("cbo"));
			especialidade.setNome(rs.getString("nome"));
			rs.close();
			st.close();
			con.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return especialidade;
	}
}
