package DAO;

import java.util.List;

import Entities.Paciente;

public interface PacienteDAO {
	void adicionar(Paciente paciente);
	void atualizar(Paciente paciente);
	void excluir(Long id);
	Paciente encontrarId(Long id);
	List<Paciente> mostrarTodos();
}
