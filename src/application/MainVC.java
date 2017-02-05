package application;

import javafx.scene.control.Label;


public class MainVC {

	static String text = "";

	public static void numPressed(Label label, int value) {
		text = text + String.valueOf(value);
		try {
			if (Integer.valueOf(text) < Integer.MAX_VALUE) {
				label.setText(text);
				System.out.println(Integer.valueOf(text));
			}
		} catch (Exception e) {
			text = "NUMBER TOO LARGE";
			label.setText(text);
			text = "";
		}
	}
	
	public static void clearPressed(Label label){
		text = "";
		label.setText("0");
	}

	
}
