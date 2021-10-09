package bai34;


import junit.framework.TestCase;

public class RailwayTest extends TestCase {
	ClockTime time1= new ClockTime(8, 9);
	ClockTime time2 = new ClockTime(6, 0);
	Route route1 = new Route("haNoi", "hoChiMinh");
	Schedule schedule1 = new Schedule(time1, time2);
	Railway railway1 = new Railway(route1, schedule1, true);
	public void testDestination() {
		assertTrue(railway1.destination(railway1));
	}
	public void testTimeStart() {
		assertTrue(railway1.timeStart(railway1));
	}
	public void testHowLong() {
		assertEquals(railway1.howLong(), 2, 9);
	}
}	
