package application;
//import static org.junit.Assert.assertEquals;

//
//import org.junit.Test;

public class MainModel {
	private int calValue;
	private int firstNum;
	private int secondNum;

	public void setFirstNum(int firstNum){
		this.firstNum = firstNum;
	}
	public void setSecondNum(int secondNum){
		this.secondNum = secondNum;
	}
	public int getFirstNum(){
		return firstNum;
	}
	public int getSecondNum(){
		return secondNum;
	}
	
	
	
	public int getCalValue() {
		return calValue;
	}
	

	public void addition() {
		calValue = firstNum + secondNum;
	}

	public void subtraction() {
		calValue = firstNum - secondNum;
	}

	public void multiplication() {
		calValue = firstNum * secondNum;
	}

	public void division() {
		calValue = firstNum / secondNum;
	}

}
