package DAO;

import java.util.List;

import Entities.Medico;

public interface MedicoDAO {
	void adicionar(Medico medico);
	void atualizar(Medico medico);
	void excluir(Long id);
	Medico encontrarId(Long id);
	List<Medico> mostrarTodos();
}
