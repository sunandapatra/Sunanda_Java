package UserInterface;

import Domain.PersonDO;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * Created by jrout on 4/16/17.
 */
public class TableViewfxController {

	@FXML
	private TextField firstNameField;
	@FXML
	private TextField lastNameField;
	@FXML
	private TextField emailField;
	@FXML
	private TableView tableView;

	@FXML
	public void addPerson(ActionEvent ae) {
		ObservableList<PersonDO> data = tableView.getItems();
		data.add(new PersonDO(firstNameField.getText(), lastNameField.getText(), emailField.getText()));
		firstNameField.clear();
		lastNameField.clear();
		emailField.clear();

		System.out.println("Hello Event" + firstNameField.getText());

	}
}
