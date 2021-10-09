package bai31;

import junit.framework.TestCase;

public class HouseTest extends TestCase {
	    Aaddress add1=new Aaddress(23, "mapleSress", "brookline");
		Aaddress add2=new Aaddress(5, "joyeRoad", "newton");
		Aaddress add3=new Aaddress(83, "winslowRoad", "waltham");
		House house1=new House("Ranch", 7, 375000, add1);
		House house2=new House("Colonial", 9, 450000, add2);
		House house3=new House("Cape", 6, 235000, add3);
	public void testHasMoreRooms() {
		assertFalse(house1.hasMoreRooms(house2));
		assertTrue(house1.hasMoreRooms(house3));
		assertTrue(house2.hasMoreRooms(house3));
	}
	public void testInThisCity() {
		 assertTrue(house1.inThisCity("brookline"));
		 assertFalse(house1.inThisCity("waltham"));
		 assertTrue(house2.inThisCity("newton"));
	}
	public void testSameCity() {
		assertTrue(house1.sameCity(house1));
		assertFalse(house2.sameCity(house3));
		assertTrue(house3.sameCity(house3));
	}
	
}
