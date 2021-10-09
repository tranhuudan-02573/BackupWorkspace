package bai5_6;

import junit.framework.TestCase;

public class PhoneTest extends TestCase {
	public void testWhoseNumber() {
		PhoneNumber pn1 = new PhoneNumber("Hai", "09292923");
		PhoneNumber pn2 = new PhoneNumber("Tuan", "027189234");
		PhoneNumber pn3 = new PhoneNumber("Hai", "0862747972");
		IPhone empty = new MTPhone();
		IPhone l1 = new ConsPhone(pn1, empty);
		IPhone l2 = new ConsPhone(pn2, l1);
		IPhone l3 = new ConsPhone(pn3, l2);
		assertEquals(l3.whoseNumber("09292923"), "name: Hai\n");
	}

	public void testPhoneNumber() {
		PhoneNumber pn1 = new PhoneNumber("Hai", "09292923");
		PhoneNumber pn2 = new PhoneNumber("Tuan", "027189234");
		PhoneNumber pn3 = new PhoneNumber("Hai", "0862747972");
		IPhone empty = new MTPhone();
		IPhone l1 = new ConsPhone(pn3, empty);
		IPhone l2 = new ConsPhone(pn2, l1);
		IPhone l3 = new ConsPhone(pn1, l2);
		assertEquals(l3.phoneNumber("Hai"), "number: 09292923\nnumber: 0862747972\n");
	}
}
