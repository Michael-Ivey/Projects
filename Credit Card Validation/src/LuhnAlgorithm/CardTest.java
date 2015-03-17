package LuhnAlgorithm;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CardTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		CardChecker tester = new CardChecker();
		tester.setCardNum("5275150092752500");
		char[] testerArray = tester.getCardNum().toCharArray();
		char[] testerArray2 = CardChecker.stringToArray(testerArray);
		int testEven = CardChecker.sumOfEven(testerArray2);
		//System.out.println(testEven);
		int testOdd = CardChecker.sumOfOdd(testerArray2);
		int testTotal = testEven + testOdd;
		//System.out.println(testTotal);
		
		
		CardChecker tester2 = new CardChecker();
		tester2.setCardNum("5275156275003250");
		char[] testerArray3 = tester2.getCardNum().toCharArray();
		char[] testerArray4 = CardChecker.stringToArray(testerArray3);
		int testEven1 = CardChecker.sumOfEven(testerArray4);
		//System.out.println(testEven);
		int testOdd1 = CardChecker.sumOfOdd(testerArray4);
		int testTotal1 = testEven1 + testOdd1;
		//System.out.println(testTotal);
		
		
		CardChecker tester3 = new CardChecker();
		tester3.setCardNum("5275156275006220");
		char[] testerArray31 = tester3.getCardNum().toCharArray();
		char[] testerArray41 = CardChecker.stringToArray(testerArray31);
		int testEven11 = CardChecker.sumOfEven(testerArray41);
		//System.out.println(testEven);
		int testOdd11 = CardChecker.sumOfOdd(testerArray41);
		int testTotal11 = testEven11 + testOdd11;
		//System.out.println(testTotal);
		
		
		CardChecker tester31 = new CardChecker();
		tester31.setCardNum("5275150022352527");
		char[] testerArray311 = tester31.getCardNum().toCharArray();
		char[] testerArray411 = CardChecker.stringToArray(testerArray311);
		int testEven111 = CardChecker.sumOfEven(testerArray411);
		//System.out.println(testEven);
		int testOdd111 = CardChecker.sumOfOdd(testerArray411);
		int testTotal111 = testEven111 + testOdd111;
		//System.out.println(testTotal);
		
		
		assertEquals(CardChecker.isValid(testTotal),true);
		assertEquals(CardChecker.isValid(testTotal1),false);
		assertEquals(CardChecker.isValid(testTotal11),false);
		assertEquals(CardChecker.isValid(testTotal111),true);
		
		
		
		
		
		
	}

}
