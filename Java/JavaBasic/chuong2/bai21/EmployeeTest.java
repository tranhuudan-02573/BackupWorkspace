package bai21;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {
	public void testConstructor() {
		new Employee(" nam", 20);
		new Employee("mai", 30);
		new Employee("minh", 102);
	}
	public void test_wage() {
		assertEquals(new Employee(" nam", 20).wage(), 240.0,0.001);
		assertEquals(new Employee("mai", 30).wage(), 360.0,0.001);
		assertEquals(new Employee("minh", 102).wage(), 1224.0,0.001);
	}
	public void testTax() {
		assertEquals(new Employee("nam", 20).tax(), 36.0, 0.001);
		assertEquals(new Employee("mai", 30).tax(), 54.0, 0.001);
		assertEquals(new Employee("minh", 102).tax(), 183.6, 0.001);
	}
	public void testNetpay() {
		assertEquals(new Employee(" nam", 20).netpay(), 204.0, 0.001);
		assertEquals(new Employee("mai", 30).netpay(), 306.0, 0.001);
		assertEquals(new Employee("minh", 102).netpay(), 1040.4, 0.001);
	}
	public void testRaisedWage() {
		assertEquals(new Employee(" nam", 20).raisedWage(), 218.0, 0.001);
		assertEquals(new Employee("mai", 30).raisedWage(), 320.0, 0.001);
		assertEquals(new Employee("minh", 102).raisedWage(), 1054.4, 0.001);
	}
	public void testCheckOverTime() {
		assertFalse(new Employee(" nam", 20).checkOverTime());
		assertFalse(new Employee("mai", 30).checkOverTime());
		assertTrue(new Employee("minh", 102).checkOverTime());
	}

}
