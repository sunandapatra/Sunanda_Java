package JDBC;

import java.util.List;

import Domain.PersonDO;
import JDBC.dao.ICustomerDAO;
import JDBC.dao.Impl.CustomerDAOImpl;
import JDBC.domain.Customer;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class EmployeeTableView extends Application{
	
	
	private final static ObservableList<Customer> data = FXCollections.observableArrayList();
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
    public void start(Stage stage) {
        TableView<Customer> table = new TableView<Customer>();
        final ObservableList<Customer> data =
                FXCollections.observableArrayList();

        final HBox hb = new HBox();
        Group group = new Group();
        Scene scene = new Scene(group);
        stage.setTitle("Table View Sample");
        stage.setWidth(450);
        stage.setHeight(550);

        final Label label = new Label("Address Book");
        label.setFont(new Font("Arial", 20));

        table.setEditable(true);

        TableColumn firstNameCol = new TableColumn("First Name");
        firstNameCol.setMinWidth(100);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<PersonDO, String>("firstName"));
        firstNameCol.setCellFactory(TextFieldTableCell.forTableColumn());
       

        TableColumn lastNameCol = new TableColumn("Last Name");
        lastNameCol.setMinWidth(100);
        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<PersonDO, String>("lastName"));
        //lastNameCol.setCellFactory(TextFieldTableCell.forTableColumn());
        

        TableColumn emailCol = new TableColumn("Email");
        emailCol.setMinWidth(200);
        emailCol.setCellValueFactory(
                new PropertyValueFactory<PersonDO, String>("email"));
        emailCol.setCellFactory(TextFieldTableCell.forTableColumn());
        

        table.setItems(data);
        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);

        final TextField addFirstName = new TextField();
        addFirstName.setPromptText("First Name");
        addFirstName.setMaxWidth(firstNameCol.getPrefWidth());
        addFirstName.
        
        final TextField addLastName = new TextField();
        addLastName.setPromptText("Last Name");
        addLastName.setMaxWidth(lastNameCol.getPrefWidth());
       
        final TextField addAddress = new TextField();
        addAddress.setMaxWidth(emailCol.getPrefWidth());
        addAddress.setPromptText("Address");

       /* final Button addButton = new Button("Add");
        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
            		// List<PersonDO> personDOList = dao.getPerson();
            	// for loop data.add(personDO)
                data.add(new PersonDO(
                        addFirstName.getText(),
                        addLastName.getText(),
                        addAddress.getText()));
                
                addFirstName.clear();
            }
        });*/
        
        final Button searchButton = new Button("Search");
        searchButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
            	ICustomerDAO prog = new CustomerDAOImpl();
        		List<Customer> customers = prog.getCustomers();
        		System.out.println("AAAAA : "+customers);
            		// List<PersonDO> personDOList = dao.getPerson();
            	// for loop data.add(personDO)
                data.add(new Customer(
                        addFirstName.getText(),
                        addLastName.getText(),
                        addAddress.getText()));
                
                addFirstName.clear();
                addLastName.clear();
                addAddress.clear();
            }
        });

       
        
        hb.getChildren().addAll(addFirstName, addLastName, addAddress, searchButton);
        hb.setSpacing(3);

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table, hb);

        group.getChildren().addAll(vbox);

        stage.setScene(scene);
        stage.show();
    }

}