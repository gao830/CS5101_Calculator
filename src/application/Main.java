package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


public class Main extends Application {
	final int width = 300;
	final int height = 300;
	@Override 
	public void start(Stage primaryStage) {
		try {
			Pane root = new MainView(width, height);
			
			
			Scene scene = new Scene(root,width,height);
			primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
