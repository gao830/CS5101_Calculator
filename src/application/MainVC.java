package application;

import javafx.scene.control.Label;

public class MainVC {
	

	
	public static void buttonPressed(Label label, int value){
		System.out.println("btn pressed");
		label.setText(String.valueOf(value));
	}
	
}
