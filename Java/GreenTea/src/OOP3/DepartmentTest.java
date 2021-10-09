package OOP3;

import junit.framework.TestCase;

public class DepartmentTest extends TestCase {
	Birthday b1 = new Birthday(4, 2, 2022);
	AStaff a1 = new OfficeStaff("132AB3", "nguyen van a", b1, true, 3.92);
	AStaff a2 = new ProductionStaff("132CS3", "nguyen van b", b1, false, 59);
	AStaff a3 = new ContractualStaff("132AB3", "nguyen van a", b1, true, 63);
	IStaffs i1 = new MTStaffs();
	IStaffs i2 = new ConsStaffs(a1, i1);
	IStaffs i3 = new ConsStaffs(a2, i2);
	IStaffs i4 = new ConsStaffs(a3, i3);

	public void testConstructor() {
		System.out.println("testConstructor");
		System.out.println(i4);

	}

	public void testWage() {
		System.out.println("testWage");
		System.out.println(a1.wage());
		System.out.println(a2.wage());
		System.out.println(a3.wage());

	}

	public void testTotalWage() {
		System.out.println("testTotalWage");
		System.out.println(i4.totalWage());

	}

	public void testMaxWage() {
		System.out.println("testMaxWage");
		System.out.println(i4.maxWage());

	}

}
