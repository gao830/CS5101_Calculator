package application;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class MainView extends Pane {

	Text text;
	Button button;

	public MainView() {
		text = new Text(10, 20, "Hi");
		text.setFont(new Font(15));
		text.setFill(Color.BLUE);
		text.setWrappingWidth(600);
		text.setTextAlignment(TextAlignment.JUSTIFY);
		button = new Button("Button");
		button.setLayoutX(100);
		button.setLayoutY(10);
		button.setOnAction(e -> {
			MainVC.actionOnPressed();
		});
		this.getChildren().addAll(text, button);
	}
}
