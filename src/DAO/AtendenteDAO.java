package DAO;

import java.util.List;

import Entities.Atendente;

public interface AtendenteDAO {
	void adicionar(Atendente atendente);
	void atualizar(Atendente atendente);
	void excluir(int id);
	Atendente encontrarId(int id);
	List<Atendente> mostrarTodos();
}
