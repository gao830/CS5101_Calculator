package application;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class MainView extends Pane {

	Text text;
	Button[] button = new Button[15];

	double width, height;

	int btnSize = 50;

	public MainView(int width, int height) {
		// text = new Text(10, 20, "Hi");
		// text.setFont(new Font(15));
		// text.setFill(Color.BLUE);
		// text.setWrappingWidth(600);
		// text.setTextAlignment(TextAlignment.JUSTIFY);
		// button = new Button("Button");
		// button.setLayoutX(100);
		// button.setLayoutY(10);
		// button.setOnAction(e -> {
		// MainVC.actionOnPressed();
		// });
		this.height = height;
		this.width = width;

		createButtons();
		this.getChildren().addAll(button);
	}

	public void createButtons() {
		button[0] = new Button(String.valueOf(0));
		button[0].setPrefSize(btnSize *2+10, btnSize * 0.6);
		button[0].setLayoutX(10);
		button[0].setLayoutY(height - btnSize - 10);
		button[0].setStyle("-fx-font-size: 2em; ");
		for (int i = 1; i < 4; i++) {
			button[i] = new Button(String.valueOf(i));
			button[i].setPrefSize(btnSize, btnSize * 0.6);
			button[i].setLayoutX(10 + (btnSize+10) * (i - 1));
			button[i].setLayoutY(height - 2 * (btnSize + 5));
			button[i].setStyle("-fx-font-size: 2em; ");

		}
		for (int i = 4; i < 7; i++) {
			button[i] = new Button(String.valueOf(i));
			button[i].setPrefSize(btnSize, btnSize * 0.6);
			button[i].setLayoutX(10 + (btnSize+10) * (i - 4));
			button[i].setLayoutY(height - 3 * (btnSize + 5));
			button[i].setStyle("-fx-font-size: 2em; ");

		}
		for (int i = 7; i < 10; i++) {
			button[i] = new Button(String.valueOf(i));
			button[i].setPrefSize(btnSize, btnSize * 0.6);
			button[i].setLayoutX(10 + (btnSize+10) * (i - 7));
			button[i].setLayoutY(height - 4 * (btnSize + 5));
			button[i].setStyle("-fx-font-size: 2em; ");
			

		}
		for (int i = 10; i < 15; i++) {
			button[i] = new Button(String.valueOf(i));
			
			

		}

	}
}
