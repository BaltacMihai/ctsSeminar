package testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import classes.Person;
import classes.SlowTestsClass;

public class TestPersonCalcAvgCosts {

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

	//CORRECT
	@Category(SlowTestsClass.class)
	@Test  //SLOW
	public void testConformance() throws Exception {
		//is the value valid (correct format)
		int[] costs = {20, 30, 10, 70, 95, 100};
		Person pers = new Person();
		pers.setCostReceipts(costs);
		double result = pers.calcAvgCosts();
		double expected = 54.16; //54.(6)
		assertEquals(expected, result, 0.2); //format
	}
	
	@Test
	public void testOrdering() throws Exception {
		int[] costs = {100, 70, 20, 10, 95, 30};
		Person pers = new Person();
		pers.setCostReceipts(costs);
		double result = pers.calcAvgCosts();
		double expected = 54.16; //54.(6)
		assertEquals(expected, result, 0.2); //checking the results
	}
	
	@Test
	public void testRangeResult() throws Exception {
		//result
		int[] costs = {100, 70, 20, 10, 95, 30};
		Person pers = new Person();
		pers.setCostReceipts(costs);
		double result = pers.calcAvgCosts();
		assertTrue(result >= 0 && result <= 200);
	}
	
	@Test (expected = Exception.class)
	public void testRangeInput() throws Exception {
		//input
		int[] costs = {100, -70, 20, 10, 95, 30};
		Person pers = new Person();
		pers.setCostReceipts(costs);
		double result = pers.calcAvgCosts();
		//assertTrue(result >= 0 && result <= 200);
	}
	
	@Test
	public void testRangeInput2() {
		//input
		int[] costs = {100, -70, 20, 10, 95, 30};
		Person pers = new Person();
		pers.setCostReceipts(costs);
		try{
			pers.calcAvgCosts();
			fail("range input test not throwing exception");

		}catch(Exception e){
			//e.printStackTrace();
			assertTrue(true); //i'm expecting to get exception

		}
	}
	
	@Test (expected = Exception.class)
	public void TestExistance() throws Exception {
		int[] costs = {};
		Person pers = new Person();
		pers.setCostReceipts(costs);
		pers.calcAvgCosts(); //expect error
	}
	
	@Category(SlowTestsClass.class)
	@Test
	public void testCardinality() throws Exception { //SLOW
		//1 val
		int[] costs = {90};
		Person pers = new Person();
		pers.setCostReceipts(costs);
		pers.calcAvgCosts(); //not expect errors
		assertEquals(1, pers.getCostReceipts().length);
	}

}
