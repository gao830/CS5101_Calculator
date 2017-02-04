package application;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainModel {
	private int calValue;
	
	public void addition(int firstInt, int secondInt) {
		calValue = firstInt + secondInt;
	}
	public void subtraction (int firstInt, int secondInt) {
		calValue = firstInt - secondInt;
	}
	public void multiplication (int firstInt, int secondInt) {
		calValue = firstInt * secondInt;
	}
	public void division (int firstInt, int secondInt) {
		calValue = firstInt / secondInt;
	}
	public int getCalValue() {
		return calValue; 
	}
}
