package DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.AtendenteDAO;
import DAO.GenericDAO;
import Entities.Atendente;

public class AtendenteDAOImpl implements AtendenteDAO{

	GenericDAO gDao = new GenericDAO();
	
	@Override
	public void adicionar(Atendente atendente) {
		try {
			Connection con = gDao.getConnection();
			String sql = "INSERT INTO atendente(nome, username, senha, codFunc)" + "VALUES(?, ?, ?, ?)";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, atendente.getNome());
			st.setString(2, atendente.getUsername());
			st.setString(3, atendente.getSenha());
			st.setInt(4, atendente.getCodFunc());
			st.execute();
			st.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void atualizar(int codFunc, Atendente atendente) {
		try {
			Connection con = gDao.getConnection();
			String sql = "UPDATE atendente SET nome = ?, username = ?, senha = ? where codFunc = ?";
			PreparedStatement st = con.prepareStatement(sql);
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
	public void excluir(int codFunc) {
		try {
			Connection con = gDao.getConnection();
			String sql = "DELETE FROM atendente WHERE codFunc = ?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, codFunc);
			System.out.println(sql);
			st.executeUpdate();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	@Override
	public boolean encontrarAcesso(String username, String senha) {
		try{
			Connection con = gDao.getConnection();
			String sql = "SELECT * FROM atedente WHERE username = ? AND senha = ?";

			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, username);
			st.setString(2, senha);
			ResultSet rs = st.executeQuery();
			
			con.close();
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
	public List<Atendente> pesquisarTodos() {
		 List<Atendente> lista = new ArrayList<>();
	        try {
	        	Connection con = gDao.getConnection();
	            String sql = "SELECT * FROM atendente";
	            System.out.println(sql);
	            PreparedStatement stmt = con.prepareStatement(sql);
	            ResultSet rs = stmt.executeQuery();

	            while( rs.next() ) {
	                Atendente a = new Atendente();
	                a.setNome(rs.getString("nome"));
	                a.setUsername(rs.getString("userName"));
	                a.setSenha(rs.getString("senha"));
	                a.setCodFunc(rs.getInt("codFunc"));
	                lista.add(a);
	            }
	          	con.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return lista;
	}
}
