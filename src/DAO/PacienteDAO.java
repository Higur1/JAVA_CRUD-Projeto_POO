package DAO;

import java.util.List;

import Entities.Paciente;

public interface PacienteDAO {
	void adicionar(Paciente paciente);
	void remover(String cpf);
	void atualizar(String string, Paciente p);
	List<Paciente> pesquisarPorCPF(String cpf);
}