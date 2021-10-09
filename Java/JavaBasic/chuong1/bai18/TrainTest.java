package bai18;

import junit.framework.TestCase;

public class TrainTest extends TestCase {
	Time time1 = new Time(8, 0);
	Time time2 = new Time(6, 9);
	Route route1 = new Route("haNoi", "hoChiMinh");
	Schedule schedule1 = new Schedule(time1, time2);	
	public void testRoute() {
		new Route("haNoi", "hoChiMinh");
	}
	public void testSchedule() {
		new Schedule(time1, time2);
	}
	public void testTime() {
		Time time1 = new Time(8, 0);
		Time time2 = new Time(6, 9);
	}
	public void testTrain() {
		new Train(route1, schedule1, false );
	}

}
