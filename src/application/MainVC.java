package application;

import javafx.scene.control.Label;

public class MainVC {

	static String text = "0";

	static String operation;
	static MainModel mainModel = new MainModel();

	public static void numPressed(Label label, int value) {
		// if (Integer.valueOf(text) == 0) {
		// text = "";
		// }
		text = text + String.valueOf(value);
		try {
			if (Integer.valueOf(text) < Integer.MAX_VALUE) {

				if (text.charAt(0) == '0') {
					StringBuilder sb = new StringBuilder(text);
					sb.deleteCharAt(0);
					text = sb.toString();
				}
				label.setText(text);

				// System.out.println(Integer.valueOf(text));
			}
		} catch (Exception e) {
			text = "NUMBER TOO LARGE";
			label.setText(text);
			text = "";
		}
	}

	public static void operationsPressed(String operation1, Label label) {
		switch (operation1) {
		case "+":
			label.setText("+");
			
			mainModel.setFirstNum(Integer.valueOf(text));
			System.out.println(Integer.valueOf(text));
			operation = operation1;
			text = "0";
			break;

		case "-":
			label.setText("-");
			
			mainModel.setFirstNum(Integer.valueOf(text));
			System.out.println(mainModel.getFirstNum());
			operation = operation1;
			text = "0";
			break;

		case "*":
			label.setText("*");
			
			mainModel.setFirstNum(Integer.valueOf(text));
			System.out.println(mainModel.getFirstNum());
			operation = operation1;
			text = "0";
			break;

		case "/":
			label.setText("/");
			
			mainModel.setFirstNum(Integer.valueOf(text));
			System.out.println(mainModel.getFirstNum());
			operation = operation1;
			text = "0";
			break;
		}

	}

	public static void equalPressed(Label label) {
		mainModel.setSecondNum(Integer.valueOf(text));
		System.out.println("first:"+mainModel.getFirstNum());
		System.out.println("second:"+mainModel.getSecondNum());
		
		switch (operation) {
		case "+":
			mainModel.addition();
			break;
		case "-":
			mainModel.subtraction();
			break;
		case "*":
			mainModel.multiplication();
			break;
		case "/":
			mainModel.division();
			break;
		default:
			break;
		}
		System.out.println(mainModel.getCalValue());
		label.setText(String.valueOf(mainModel.getCalValue()));
		text = "0";


	}

	public static void clearPressed(Label label) {
		text = "";
		label.setText("0");
	}

}
