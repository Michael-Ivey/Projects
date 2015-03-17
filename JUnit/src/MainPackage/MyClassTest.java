package MainPackage;

//Michael Ivey

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyClassTest {

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
	public void testReturnTrue() {
		assertEquals(MyClass.ReturnTrue(),true);
		System.out.println("True is always true");
		
		assertEquals(!(MyClass.ReturnTrue()),false);
		System.out.println("True is False if you not it");

	}

	@Test
	public void testAddTwoNumbers() {
		assertEquals(MyClass.AddTwoNumbers(1, 1), 1 + 1);
		System.out.println("Your addition is equal to 2");
		
		assertEquals(MyClass.AddTwoNumbers(10, 1), 11);
		System.out.println("Your addition is equal to 11");
		
		assertEquals(MyClass.AddTwoNumbers(7, 0), 7);
		System.out.println("Your addition is equal to 7");
		
	}

	

	



}
