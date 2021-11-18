package DAO;

import java.util.List;

import Entities.Medico;

public interface MedicoDAO {
	void adicionar(Medico medico);
	void remover(String crm);
	void atualizar(String crm, Medico m);
	List<Medico> pesquisarPorCRM(String crm);
}
