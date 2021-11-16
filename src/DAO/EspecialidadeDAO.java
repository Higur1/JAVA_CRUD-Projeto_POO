package DAO;

import java.util.List;

import Entities.Especialidade;

public interface EspecialidadeDAO {
	void adicionar(Especialidade especialidade);
	void atualizar(Especialidade especialidade);
	void excluir(Long id);
	Especialidade encontrarId(Long id);
	List<Especialidade> mostrarTodos();
}
