package application;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MainUnitTest {
	MainModel tester = new MainModel();
	@Test
	public void add() {
		
		tester.setFirstNum(5);
		tester.setSecondNum(5);
		tester.addition();
		int sum = tester.getCalValue();
		assertEquals("5 + 5 must be 10", 10, sum);
		
		tester.setFirstNum(20);
		tester.setSecondNum(1);
		tester.addition();
		sum = tester.getCalValue();
		assertEquals("20 + 1 must be 21", 21, sum);
		
		tester.setFirstNum(7);
		tester.setSecondNum(11);
		tester.addition();
		sum = tester.getCalValue();
		assertEquals("7 + 11 must be 18", 18, sum);
	}
}
