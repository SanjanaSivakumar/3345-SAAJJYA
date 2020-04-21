import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GroceryBillTester {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@Before
	public void before() {
		System.out.println("Before Test Case");
	}
	
	@Test
	public void isValidBillTest() {
		System.out.println("Test");
		GroceryBillCalculator D2 = new GroceryBillCalculator();
		double [] prices = {4.21, 1, 10.14, 2.50, 3.41, 5.65};
		//Correct test case
//		assertEquals(26.91, D2.calcBill(prices), 0.01);
		//Incorrect test case
//		assertEquals(35, D2.calcBill(prices), 0.01);
		assertEquals(26.92, D2.calcBill(prices), 0.01);
		
		
	}
	
	@After
	public void after() {
		System.out.println("After Test Case");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}

}
