package bai15;

import junit.framework.TestCase;

public class EstateTest extends TestCase {	
	public void testAddress() {
		new Address(23, "mapleSress", "brookline");
		new Address(5, "joyeRoad", "newton");
		new Address(83, "winslowRoad", "waltham");
	}
	public void testEstate() {
		new Estate("ranch", 7, 375000, new Address(23, "mapleSress", "brookline"));
		new Estate("colonial", 9, 450000, new Address(5, "joyeRoad", "newton"));
		new Estate("ranch", 7, 375000, new Address(83, "winslowRoad", "waltham"));
	}

}
