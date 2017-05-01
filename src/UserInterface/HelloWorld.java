package UserInterface;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloWorld extends Application {

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Text text = new Text(25, 25, "Hello World");
		Group group = new Group(text);
		Scene scene = new Scene(group);

		primaryStage.setScene(scene);
		primaryStage.setWidth(100);
		primaryStage.setHeight(200);
		primaryStage.show();

	}

}