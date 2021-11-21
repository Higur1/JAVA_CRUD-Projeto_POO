package Controller;

import java.time.LocalDate;
import java.util.List;

import DAO.MedicoDAO;
import DAOImpl.MedicoDAOImpl;
import Entities.Medico;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TelaMedicoController {
	
	public StringProperty nome = new SimpleStringProperty("");
	public StringProperty telefone = new SimpleStringProperty("");
	public StringProperty crm = new SimpleStringProperty("");
	public StringProperty rua = new SimpleStringProperty("");
	public StringProperty num = new SimpleStringProperty("");
	public StringProperty cidade = new SimpleStringProperty("");
	public StringProperty complemento = new SimpleStringProperty("");
	public SimpleObjectProperty nascimento = new SimpleObjectProperty(LocalDate.now());
	
	private ObservableList<Medico> medicos = FXCollections.observableArrayList();
	
	private MedicoDAO medicoDAO;
	{
		medicoDAO = new MedicoDAOImpl();
	}
	public void adicionar() {
		Medico medico = toEntity();
		medicoDAO.adicionar(medico);
		medicoDAO.pesquisarTodos();
	}
	
	public void atualizar() {
		Medico  medico = toEntity();
		if(medico.getCrm() == "") {
			medicoDAO.adicionar(medico);
			medicoDAO.pesquisarTodos();
		}else {
			medicoDAO.atualizar(crm.get(), medico);
			medicoDAO.pesquisarTodos();
		}
	}
	public void pesquisar() {
		medicos.clear();
		List<Medico> encontrados = medicoDAO.pesquisarTodos();
		medicos.addAll(encontrados);
		if(!medicos.isEmpty()) {
			fromEntity(medicos.get(0));
		}
	}
	public void salvar() {
		Medico medico = toEntity();
		if(medico.getCrm() == "") {
			medicoDAO.adicionar(medico);
		}else {
			medicoDAO.atualizar(crm.get(), medico);
		}
		medicoDAO.pesquisarTodos();
	}
	public void excluir(String crm) {
		medicoDAO.excluir(crm);
		medicoDAO.pesquisarTodos();
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
	
	public void fromEntity(Medico medico) {
		nome.set(medico.getNome());
		telefone.set(medico.getTelefone());
		crm.set(medico.getCrm());
		rua.set(medico.getRua());
		num.set(medico.getNum());
		cidade.set(medico.getCidade());
		complemento.set(medico.getComplemento());
		nascimento.set(medico.getNascimento());
	}
	
	public ObservableList<Medico> getLista(){
		return medicos;
	}
}
