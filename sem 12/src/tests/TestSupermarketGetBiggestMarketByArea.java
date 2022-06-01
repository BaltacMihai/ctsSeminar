package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



import classes.ETypeMarket;
import classes.Market;
import classes.Supermarket;
import exceptions.ExceptionMarket;

public class TestSupermarketGetBiggestMarketByArea {
	
	static Market m1;
    static Market m2;
    static Market m3;
    static Market m4;
    static Market m5;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.out.println("setUpBeforeClass");
		m1 = new Market("Sephora", 25, ETypeMarket.BEAUTY);
		m2 = new Market("Douglas", 15, ETypeMarket.BEAUTY);
		m3 = new Market("Mobexpert", 5, ETypeMarket.DECORATION);
		m4 = new Market("MAC", 32,ETypeMarket.BEAUTY);
		m5 = new Market("English home", 10, ETypeMarket.DECORATION);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	//RIGHT BICEP
	@Test
	public void testRight() {
		System.out.println("Test Right");
		ArrayList<Market> listM = new ArrayList<Market>();
		listM.add(m1);
		listM.add(m2);
		listM.add(m3);
		listM.add(m4);
		listM.add(m5);
		
		Supermarket sm = new Supermarket("Mall Bucharest",listM);
		
		try {
			
		Market result = sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
		String expected = "Sephora";
		
		if(result.getName().equals(expected)) {
			assertTrue(true);
		}
		else {
			assertTrue(false);
			//fail()
		}
		
		//assertEquals(expected, result.getName());
		
	   }catch(ExceptionMarket ex) {
		 
		   ex.printStackTrace();
		   fail("I'm not expecting ");
	}

}
	@Test
	public void testBoundary() {
		System.out.println("Test Boundary");
		ArrayList<Market> listM = new ArrayList<Market>();
		listM.add(m1);
		Supermarket sm = new Supermarket("Mall Bucharest",listM);
		
		try {
			 Market result = sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
			 assertEquals("It's working","Sephora", result.getName());
	}catch(ExceptionMarket ex) {
		ex.printStackTrace();
		fail("NOT OK");
	}
		
}
	
	@Test
	public void testException2()  {
		
		ArrayList<Market> listM = new ArrayList<Market>();
		Supermarket sm = new Supermarket("Mall Bucharest",listM);
		
		try {
			
			sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
			fail("NOT OK Should fail");
			
		} catch (ExceptionMarket e) {
			
			e.printStackTrace();
			assertTrue("It's working",true);
			//assertEquals(10.2, 10.3, 0.5);
		}
	}
	
	@Test
	public void testPerformance() throws ExceptionMarket {
		
		System.out.println("Test Performance");
		ArrayList<Market> listM = new ArrayList<Market>();
	    listM.add(m1);
	    listM.add(m2);
	    listM.add(m3);
	    listM.add(m4);
	    listM.add(m5);
	    
	    Supermarket sm = new Supermarket("Mall Bucharest", listM);
	     double startTime = System.currentTimeMillis();
	     sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
	     double stopTime = System.currentTimeMillis();
	     
	     assertTrue("It's fast", stopTime - startTime < 5);
	}
	
	
	public Market getLargestMarket(ArrayList<Market> list, ETypeMarket marketType) {
		 Market m = null;
		 //sort list by area(Type
		 return m;
	}
	
	@Test
	public void testCrossCheck() throws ExceptionMarket {
		
		System.out.println("Test CrossCheck");
		ArrayList<Market> listM = new ArrayList<Market>();
	    listM.add(m1);
	    listM.add(m2);
	    listM.add(m3);
	    listM.add(m4);
	    listM.add(m5);
	    
	    Supermarket sm = new Supermarket("Mall Bucharest", listM);
	    
	    Market expected = getLargestMarket(listM,ETypeMarket.BEAUTY);
	    Market actualResult = sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
	    assertEquals(expected, actualResult);
	    
	}
	
	@Test
	public void testInversion() throws ExceptionMarket {
		
		System.out.println("Test Inversion");
		ArrayList<Market> listM = new ArrayList<Market>();
	    listM.add(m1);
	    listM.add(m2);
	    listM.add(m3);
	    listM.add(m4);
	    listM.add(m5);
	    
	    Supermarket sm = new Supermarket("Mall Bucharest", listM);
	    Market result = sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
	    
	    for(int i=0; i<listM.size();i++) {
	    	if(result.getName().equals(listM.get(i))){
	    		//maxArea
	    		//-> save position
	    	}
	    }
	    //check if the position is between [0 and listM.size()]
	    
		
	}
}
		
		
		
		
		
		
		
		
		

