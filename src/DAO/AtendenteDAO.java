package DAO;

import java.sql.SQLException;
import java.util.List;

import Entities.Atendente;

public interface AtendenteDAO {
	void adicionar(Atendente atendente) throws SQLException;
	void atualizar(Atendente atendente) throws SQLException;
	void excluir(int id) throws SQLException;
	Atendente buscarPorCodFunc(int id) throws SQLException;
	boolean encontrarAcesso(String username, String senha) throws SQLException;
	List<Atendente> mostrarTodos() throws SQLException;
}
