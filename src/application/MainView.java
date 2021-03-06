package application;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class MainView extends Pane {

	Text text;
	public static Button[] button = new Button[16];

	public static Label panelLabel;

	double width, height;

	int btnSize = 50;

	MainVC controller = new MainVC();
	public MainView() {

	}

	public MainView(int width, int height) {

		this.height = height;
		this.width = width;

		createButtons();
		createPanel();
		this.getChildren().addAll(button);
		this.getChildren().addAll(panelLabel);

	}

	public void createButtons() {
		button[0] = new Button(String.valueOf(0));
		button[0].setPrefSize(btnSize, btnSize * 0.6);
		button[0].setLayoutX(20);
		button[0].setLayoutY(height - btnSize - 10);
		button[0].setStyle("-fx-font-size: 2em; ");
		button[0].setOnAction(e -> {
			MainVC.numPressed(panelLabel, 0);
		});
		for (int i = 1; i < 4; i++) {
			button[i] = new Button(String.valueOf(i));
			button[i].setPrefSize(btnSize, btnSize * 0.6);
			button[i].setLayoutX(20 + (btnSize + 20) * (i - 1));
			button[i].setLayoutY(height - 2 * (btnSize + 5));
			button[i].setStyle("-fx-font-size: 2em; ");
			int num = i;
			button[i].setOnAction(e -> {
				MainVC.numPressed(panelLabel, num);
			});

		}
		for (int i = 4; i < 7; i++) {
			button[i] = new Button(String.valueOf(i));
			button[i].setPrefSize(btnSize, btnSize * 0.6);
			button[i].setLayoutX(20 + (btnSize + 20) * (i - 4));
			button[i].setLayoutY(height - 3 * (btnSize + 5));
			button[i].setStyle("-fx-font-size: 2em; ");
			int num = i;
			button[i].setOnAction(e -> {
				MainVC.numPressed(panelLabel, num);
			});

		}
		for (int i = 7; i < 10; i++) {
			button[i] = new Button(String.valueOf(i));
			button[i].setPrefSize(btnSize, btnSize * 0.6);
			button[i].setLayoutX(20 + (btnSize + 20) * (i - 7));
			button[i].setLayoutY(height - 4 * (btnSize + 5));
			button[i].setStyle("-fx-font-size: 2em; ");
			int num = i;
			button[i].setOnAction(e -> {
				MainVC.numPressed(panelLabel, num);
			});

		}
		button[10] = new Button("+");
		button[11] = new Button("-");
		button[12] = new Button("*");
		button[13] = new Button("/");
		button[14] = new Button("=");
		button[15] = new Button("C");

		button[14].setPrefSize(btnSize, btnSize * 0.6);
		button[14].setLayoutX(20 + (btnSize + 20) * 2);
		button[14].setLayoutY(height - btnSize - 10);
		button[14].setStyle("-fx-font-size: 2em; ");
		button[14].setOnAction(e -> {
			MainVC.equalPressed(panelLabel);
		});

		button[10].setPrefSize(btnSize, btnSize * 0.6);
		button[10].setLayoutX(20 + (btnSize + 20) * 3);
		button[10].setLayoutY(height - btnSize - 10);
		button[10].setStyle("-fx-font-size: 2em; ");
		button[10].setOnAction(e -> {
			MainVC.operationsPressed("+", panelLabel);
		});

		button[11].setPrefSize(btnSize, btnSize * 0.6);
		button[11].setLayoutX(20 + (btnSize + 20) * 3);
		button[11].setLayoutY(height - 2 * (btnSize + 5));
		button[11].setStyle("-fx-font-size: 2em; ");
		button[11].setOnAction(e -> {
			MainVC.operationsPressed("-", panelLabel);
		});

		button[12].setPrefSize(btnSize, btnSize * 0.6);
		button[12].setLayoutX(20 + (btnSize + 20) * 3);
		button[12].setLayoutY(height - 3 * (btnSize + 5));
		button[12].setStyle("-fx-font-size: 2em; ");
		button[12].setOnAction(e -> {
			MainVC.operationsPressed("*", panelLabel);
		});

		button[13].setPrefSize(btnSize, btnSize * 0.6);
		button[13].setLayoutX(20 + (btnSize + 20) * 3);
		button[13].setLayoutY(height - 4 * (btnSize + 5));
		button[13].setStyle("-fx-font-size: 2em; ");
		button[13].setOnAction(e -> {
			MainVC.operationsPressed("/", panelLabel);
		});

		button[15].setPrefSize(btnSize, btnSize * 0.6);
		button[15].setLayoutX(20 + (btnSize + 20));
		button[15].setLayoutY(height - btnSize - 10);
		button[15].setStyle("-fx-font-size: 2em; ");
		button[15].setOnAction(e -> {
			MainVC.clearPressed(panelLabel);
		});
	}

	public void createPanel() {

		panelLabel = new Label("0");
		panelLabel.setStyle("-fx-border-color:white; -fx-background-color: silver;-fx-font-size: 1.5em;");
		panelLabel.setPrefWidth(btnSize * 4 + 60);
		panelLabel.setPrefHeight(btnSize * 0.8);
		panelLabel.setLayoutX(20);
		panelLabel.setLayoutY(height - 5 * (btnSize + 5));
		panelLabel.setAlignment(Pos.CENTER_RIGHT);

	}

}
