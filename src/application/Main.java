package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
<<<<<<< HEAD
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
=======
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;
>>>>>>> bdf4ff2dca5532a379040c705bae52659784d6f8


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
<<<<<<< HEAD
			Pane root = new MainView();
			Scene scene = new Scene(root,400,400);
			
=======
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("MainView.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
>>>>>>> bdf4ff2dca5532a379040c705bae52659784d6f8
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
