package DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.GenericDAO;
import DAO.MedicoDAO;
import Entities.Medico;

public class MedicoDAOImpl implements MedicoDAO{
		
	GenericDAO gDao = new GenericDAO();
	
	@Override
	public void adicionar(Medico medico) {
		try {
			Connection con = gDao.getConnection();
			String sql = "INSERT INTO medico(nome, especialidade, telefone, crm, rua, num, cidade, complemento, nascimento)" + "VALUES(?, ?, ?, ?, ?, ?, ?,?,?)";
			PreparedStatement st = con.prepareStatement(sql);
			System.out.println(medico.getNome());
			st.setString(1, medico.getNome());
			st.setInt(2, medico.getEspecialidade());
 			st.setString(3, medico.getTelefone());
			st.setString(4, medico.getCrm());
			st.setString(5, medico.getRua());
			st.setString(6, medico.getNum());
			st.setString(7, medico.getCidade());
			st.setString(8, medico.getComplemento());
			st.setDate(9, java.sql.Date.valueOf(medico.getNascimento()));
			st.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	@Override
	public void atualizar(String crm, Medico medico) {
		try {
			Connection con = gDao.getConnection();
			String sql = "UPDATE medico SET nome = ?, especialidade = ?, telefone = ?, rua = ?, num = ?, cidade = ?, complemento = ?, nascimento = ? WHERE crm = ?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, medico.getNome());
			st.setInt(2, medico.getEspecialidade());
 			st.setString(3, medico.getTelefone());
			st.setString(4, medico.getRua());
			st.setString(5, medico.getNum());
			st.setString(6, medico.getCidade());
			st.setString(7, medico.getComplemento());
			st.setDate(8, java.sql.Date.valueOf(medico.getNascimento()));
			st.setString(9, medico.getCrm());
			
			st.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	@Override
	public void excluir(String crm) {
		try {
			Connection con = gDao.getConnection();
			String sql = "DELETE FROM medico WHERE crm = ?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, crm);
			st.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public List<Medico> pesquisarTodos() {
		List<Medico> lista = new ArrayList<>();
        try {
        	Connection con = gDao.getConnection();
            String sql = "SELECT * FROM medico";
            System.out.println(sql);
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while( rs.next() ) {
                Medico medico = new Medico();
                medico.setNome(rs.getString("nome"));
                medico.setCrm(rs.getString("crm"));
                medico.setEspecialidade(rs.getInt("especialidade"));
                medico.setTelefone(rs.getString("telefone"));
                medico.setRua(rs.getString("rua"));
                medico.setNum(rs.getString("num"));
                medico.setCidade(rs.getString("cidade"));
                medico.setComplemento(rs.getString("complemento"));
                medico.setNascimento(rs.getDate("data").toLocalDate());
            	lista.add(medico);
            }
           con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
	}

}
