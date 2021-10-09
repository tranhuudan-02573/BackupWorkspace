package bai22;

import junit.framework.TestCase;

public class MovieShowTest extends TestCase{
	    MovieShow movie1=new MovieShow(5.0, 20.0, 0.15);
		MovieShow movie2=new MovieShow(6.0, 40.0, 0.1);
		MovieShow movie3=new MovieShow(7.0, 50.0, 0.2);
	public void testCost() {
		assertEquals(35.0, movie1.cost(100), 0.001);
		assertEquals(50.0, movie2.cost(100), 0.001);
		assertEquals(70.0, movie3.cost(100), 0.001);
	}
	public void testRevenue() {
    	assertEquals(500.0, movie1.revenue(100), 0.001);
    	assertEquals(600.0, movie2.revenue(100), 0.001);
    	assertEquals(700.0, movie3.revenue(100), 0.001);
	}
	public void testTotalProfit() {
		assertEquals(465.0, movie1.totalProfit(100), 0.001);
		assertEquals(550.0, movie2.totalProfit(100) , 0.001);
		assertEquals(630.0, movie3.totalProfit(100) , 0.001);
	}
	
	
}
