package Controller;

import java.time.LocalDate;
import java.util.List;

import DAO.PacienteDAO;
import DAOImpl.PacienteDAOImpl;
import Entities.Paciente;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TelaPacienteController{
	
	StringProperty nome = new SimpleStringProperty("");
	StringProperty cpf = new SimpleStringProperty("");
	StringProperty sexo = new SimpleStringProperty("");
	ObjectProperty nascimento = new SimpleObjectProperty(LocalDate.now());
	StringProperty telefone = new SimpleStringProperty("");
	StringProperty rua = new SimpleStringProperty("");
	StringProperty num = new SimpleStringProperty("");
	StringProperty cidade = new SimpleStringProperty("");
	StringProperty complemento = new SimpleStringProperty("");
	
	private PacienteDAO pacD = new PacienteDAOImpl();
	private ObservableList<Paciente> pacientes = FXCollections.observableArrayList();
	
	
	public void adicionar(Paciente paciente) {
		Paciente p = new Paciente();
		pacD.adicionar(paciente);
	}
	
	public void atualizar() {
		Paciente p = toEntity();
		pacD.atualizar(cpf.get(), p);
		
	}
	
	public void pesquisar() {
		pacientes.clear();
		List<Paciente> encontrados = pacD.pesquisarPorCPF(cpf.get());
		pacientes.addAll(encontrados);
		if(!pacientes.isEmpty()) {
			fromEntity(pacientes.get(0));
		}
	}
	
	public void remover(String cpf) {
		pacD.remover(cpf);
	}
	
	public List<Paciente> pesquisarPorCPF(String cpf) {
		
		return null;
	}
	
	public Paciente toEntity() {
		Paciente p = new Paciente();
		
		p.setNome(nome.get());
		p.setCpf(cpf.get());
		p.setSexo(sexo.get());
		p.setNascm((LocalDate) nascimento.get());
		p.setTelefone(telefone.get());
		p.setRua(rua.get());
		p.setNum(num.get());
		p.setCidade(cidade.get());
		p.setComplemento(complemento.get());
		
		return p;
	}
	
	public void fromEntity(Paciente p) {
		
		nome.set(p.getNome());
		cpf.set(p.getCpf());
		sexo.set(p.getSexo());
		nascimento.set(p.getNascm());
		telefone.set(p.getTelefone());
		rua.set(p.getRua());
		num.set(p.getNum());
		cidade.set(p.getCidade());
		complemento.set(p.getComplemento());
	}
	
	public ObservableList<Paciente> getLista(){
		return pacientes;
	}

	
}

