package application;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonTest {

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
		Person test = new Person("Michael", "L", "Ivey", "2 Main St", "Elkton", "Maryland", "21921","M" );
		Person test2 = new Person("Michael", "l", "I", "3", "Elkton", "m", "2","M");
		assertEquals(test.getCity(), test2.getCity());
		assertEquals(test.getFirstName(), test2.getFirstName());
	}

}
