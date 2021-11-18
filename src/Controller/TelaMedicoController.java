package Controller;

import java.time.LocalDate;
import java.util.List;

import DAO.MedicoDAO;
import DAOImpl.MedicoDAOImpl;
import Entities.Medico;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TelaMedicoController {
	StringProperty nome = new SimpleStringProperty("");
	StringProperty telefone = new SimpleStringProperty("");
	StringProperty crm = new SimpleStringProperty("");
	StringProperty rua = new SimpleStringProperty("");
	StringProperty num = new SimpleStringProperty("");
	StringProperty cidade = new SimpleStringProperty("");
	StringProperty complemento = new SimpleStringProperty("");
	ObjectProperty nascimento = new SimpleObjectProperty(LocalDate.now());

	
	private MedicoDAO medD = new MedicoDAOImpl();
	private ObservableList<Medico> medicos = FXCollections.observableArrayList();
	
	public void adicionar(Medico medico) {
		Medico p = new Medico();
		medD.adicionar(medico);
	}
	
	public void atualizar() {
		Medico p = toEntity();
		medD.atualizar(crm.get(), p);
	}
	
	public void pesquisar() {
		medicos.clear();
		List<Medico> encontrados = medD.pesquisarPorCRM(crm.get());
		medicos.addAll(encontrados);
		if(!medicos.isEmpty()) {
			fromEntity(medicos.get(0));
		}
	}
	public void salvar() {
		Medico medico = toEntity();
		if(medico.getCrm() == "") {
			medD.adicionar(medico);
		}else {
			medD.atualizar(crm.get(), medico);
		}
	}
	public void remover(String crm) {
		medD.remover(crm);
	}
	
	public Medico toEntity() {
		Medico m = new Medico();
		
		m.setNome(nome.get());
		m.setTelefone(telefone.get());
		m.setCrm(crm.get());
		m.setRua(rua.get());
		m.setNum(num.get());
		m.setCidade(cidade.get());
		m.setComplemento(complemento.get());
		m.setNascimento((LocalDate) nascimento.get());
		
		return m;
	}
	
	public void fromEntity(Medico m) {
		nome.set(m.getNome());
		telefone.set(m.getTelefone());
		crm.set(m.getCrm());
		rua.set(m.getRua());
		num.set(m.getNum());
		cidade.set(m.getCidade());
		complemento.set(m.getComplemento());
		nascimento.set(m.getNascimento());
	}
	
	public ObservableList<Medico> getLista(){
		return medicos;
	}
}
