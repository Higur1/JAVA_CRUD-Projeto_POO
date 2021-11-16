package DAO;

import java.util.List;

import Entities.Consulta;

public interface ConsultaDAO {
	void adicionar(Consulta consulta);
	void atualizar(Consulta consulta);
	void excluir(Long id);
	Consulta encontrarId(Long id);
	List<Consulta> mostrarTodos();
}
