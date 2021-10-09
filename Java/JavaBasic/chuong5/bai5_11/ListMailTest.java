package bai5_11;

import junit.framework.TestCase;

public class ListMailTest extends TestCase {

	public void test() {
		Date d1 = new Date(27, 12, 2020);
		Date d2 = new Date(12, 12, 2019);
		Date d3 = new Date(14, 2, 2020);
		Mail m1 = new Mail("Hanoi", d1, "Hello");
		Mail m2 = new Mail("Hcm", d2, "hi");
		Mail m3 = new Mail("DaNang", d3, "good bye");
		IListMail empty = new MTListMail();
		ConsListMail l1 = new ConsListMail(m1, empty);
		ConsListMail l2 = new ConsListMail(m2, l1);
		ConsListMail l3 = new ConsListMail(m3, l2);
		assertEquals(l3.sort().getDate(), "27/12/2020 14/2/2020 12/12/2019 ");
	}
}
