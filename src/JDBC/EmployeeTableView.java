package JDBC;

import Domain.Employee;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EmployeeTableView extends Application{
	
	private TableView<Employee> employeeTable = new TableView<Employee>();
	private HBox hb = new HBox();
	private final static ObservableList<Employee> data = FXCollections.observableArrayList();
	
	public static void main(String[] args) {
		
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Scene scene = new Scene(new Group());
		stage.setTitle("Employee Table View");
		stage.setWidth(300);
		stage.setHeight(400);
		
		final Label label = new Label("Employee List");
		
		TableColumn firstNameCol = new TableColumn("First Name");
		firstNameCol.setMinWidth(100);
		
		TableColumn lastNameCol = new TableColumn("Last Name");
		lastNameCol.setMinWidth(100);
		
		TableColumn genderCol = new TableColumn("Gender");
		genderCol.setMinWidth(100);
		
		employeeTable.setItems(data);
		employeeTable.getColumns().addAll(firstNameCol,lastNameCol,genderCol);
		
		
		final TextField addFirstName = new TextField();
		addFirstName.setPromptText("First Name");
		addFirstName.setMaxHeight(firstNameCol.getPrefWidth());
		
		final TextField addLastName = new TextField();
		addLastName.setPromptText("Last Name");
		addLastName.setMaxHeight(lastNameCol.getPrefWidth());
		
		final TextField addGender = new TextField();
		addGender.setPromptText("Gender");
		addGender.setMaxHeight(genderCol.getPrefWidth());
		
		
		final Button addButton = new Button("Add");
		addButton.setOnAction(null);
		
		hb.getChildren().addAll(addFirstName, addLastName,addGender,addButton);
		
		final VBox vbox = new VBox();
		vbox.setSpacing(5);
		vbox.setPadding(new Insets(10,0,0,10));
		vbox.getChildren().addAll(label,employeeTable, hb);
		
		((Group)scene.getRoot()).getChildren().addAll(vbox);
		
		stage.setScene(scene);
		stage.show();
	}

}