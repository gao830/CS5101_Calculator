package application;

import javafx.scene.control.Label;

public class MainVC {

	static String text = "0";

	MainModel model = new MainModel();

	public static void numPressed(Label label, int value) {
		// if (Integer.valueOf(text) == 0) {
		// text = "";
		// }
		text = text + String.valueOf(value);
		try {
			
			if (Integer.valueOf(text) < Integer.MAX_VALUE) {
				
				if (text.charAt(0)=='0'){
					StringBuilder sb = new StringBuilder(text);
					sb.deleteCharAt(0);
					text = sb.toString();
				}
				label.setText(text);

				System.out.println(Integer.valueOf(text));
			}
		} catch (Exception e) {
			text = "NUMBER TOO LARGE";
			label.setText(text);
			text = "";
		}
	}

	public static void operationsPressed(String operation, Label label) {
		switch (operation) {
		case "+":
			System.out.println("+");

			break;

		case "-":
			System.out.println("-");
			break;

		case "*":
			System.out.println("*");
			break;

		case "/":
			System.out.println("/");
			break;
		}

	}

	public static void clearPressed(Label label) {
		text = "";
		label.setText("0");
	}

}
