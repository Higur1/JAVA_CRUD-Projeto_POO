package Controller;

import java.time.LocalDate;

import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TelaConsultaController {
	LongProperty id = new SimpleLongProperty(0);
	StringProperty descricao = new SimpleStringProperty("");
	StringProperty cpf = new SimpleStringProperty("");
	StringProperty crm = new SimpleStringProperty("");
	ObjectProperty dataConsult = new SimpleObjectProperty(LocalDate.now());
}
