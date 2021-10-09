package list1;

import junit.framework.TestCase;

public class ILogTest extends TestCase {
	public void testSortByDistance() {
		Entry e1 = new Entry(new Date(5, 5, 2005), 5.0, 25, "Good"); // 1/5
		Entry e2 = new Entry(new Date(6, 6, 2005), 3.0, 24, "Tired"); // 1/8
		Entry e3 = new Entry(new Date(23, 6, 2005), 26.0, 156, "Great"); // 1/6

		ILog l0 = new MTLog();
		ILog l1 = new ConsLog(e1, l0);
		ILog l2 = new ConsLog(e2, l1);
		ILog l3 = new ConsLog(e3, l2);

		assertEquals(l0.sortByDistance(), new MTLog());
		assertEquals(l1.sortByDistance(), new ConsLog(e1, l0));
		assertEquals(l2.sortByDistance(), new ConsLog(e2, l1));
		assertEquals(l3.sortByDistance(), new ConsLog(e2, new ConsLog(e1, new ConsLog(e3, l0))));
	}

	public void testSortBySpeed() {
		Entry e1 = new Entry(new Date(5, 5, 2005), 5.0, 25, "Good"); // 1/5
		Entry e2 = new Entry(new Date(6, 6, 2005), 3.0, 24, "Tired"); // 1/8
		Entry e3 = new Entry(new Date(23, 6, 2005), 26.0, 156, "Great"); // 1/6

		ILog l0 = new MTLog();
		ILog l1 = new ConsLog(e1, l0);
		ILog l2 = new ConsLog(e2, l1);
		ILog l3 = new ConsLog(e3, l2);

		assertEquals(l0.sortBySpeed(), new MTLog());
		assertEquals(l1.sortBySpeed(), new ConsLog(e1, l0));
		assertEquals(l2.sortBySpeed(), new ConsLog(e1, new ConsLog(e2, l0)));
		System.out.println("Test 1\n");
		System.out.println(l2);
		
		System.out.println("Sorted");
		System.out.println(l2.sortBySpeed());

		System.out.println("\nTest 2\n");
		System.out.println(l3);
		System.out.println("Sorted");
		System.out.println(l3.sortBySpeed());
		

	}
}