package UserInterface;

import javafx.scene.control.Button;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UserInterface2 extends Application implements EventHandler<ActionEvent>{
	Button button;
	Button exit;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("User Interface");
		
		
		
		//-------------------------------------------
//		Button button = new Button("Click Me");
//		Button exit = new Button("Exit");
//		button.setOnAction(e -> System.out.println("Hello World"));
//		exit.setOnAction(e -> {
//			System.out.println("Exit This App");
//			System.exit(0);
//		});
		//-----------------------------------
		
		
		
		
		//-----------By impementing ActionEvent------------
		 button = new Button("Click Me");
		 exit = new Button("Exit");
		button.setOnAction(this);
		exit.setOnAction(this);
		//----------it will call handle function--------------
		
		
		
		// button.setOnAction(new EventHandler<ActionEvent>() {
		//
		// @Override
		// public void handle(ActionEvent event) {
		// System.out.println("Hello World");
		//
		// }
		// });
		// StackPane layout = new StackPane();
		VBox layout = new VBox();
		layout.getChildren().addAll(button, exit);
		Scene scene = new Scene(layout, 500, 300);
		primaryStage.setTitle("Home Screen");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void handle(ActionEvent event) {
		if(event.getSource() == button){
			System.out.println("Hello");
		}
		else if(event.getSource() == exit){
			System.out.println("Hii");
		}
		
	}

}
