package restUnion2;

import junit.framework.TestCase;

public class LogTest extends TestCase {
	public void testContructor() {
		Entry e1 = new Entry(new Date(5, 5, 2005), 5.0, 25, "good");
		Entry e2 = new Entry(new Date(6, 6, 2005), 3.0, 24, "tired");
		Entry e3 = new Entry(new Date(23, 6, 2005), 26.0, 156, "great");
		
		ILog empty = new MTLog();
		ILog i1 = new ConsLog(e3, empty);
		ILog i2 = new ConsLog(e2, i1);
		ILog i3 = new ConsLog(e1, i2);
		System.out.println(i3);
		
		ILog all = new ConsLog(e1, new ConsLog(e2, new ConsLog(e3, new MTLog())));
		assertEquals(i3, all);
		
	}
	
	

}
