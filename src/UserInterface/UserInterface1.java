package UserInterface;

import javafx.scene.control.Button;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class UserInterface1 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn = new Button("Click Me");
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		Scene scene = new Scene(root, 500, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}