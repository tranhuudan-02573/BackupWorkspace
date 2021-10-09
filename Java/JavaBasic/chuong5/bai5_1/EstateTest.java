package bai5_1;

import junit.framework.TestCase;

public class EstateTest extends TestCase {
	public void testEstate() {
		House h1 = new House("Ranch", 7, 375000, "23 Maple Street", "Brookline");
		House h2 = new House("Colonial", 9, 450000, "5 Joye Road", "Newton");
		House h3 = new House("Cape", 6, 235000, "83 Winslow Road", "Waltham");
		
		IEstate e1 = new MTEstate();
		IEstate e2 = new ConsEstate(h1, e1);
		IEstate e3 = new ConsEstate(h2, e2);
		IEstate e4 = new ConsEstate(h3, e3);
		System.out.println(e4);
	}
}
