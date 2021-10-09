package demo;

import junit.framework.TestCase;

public class DepartmentTest extends TestCase {
	Date d1 = new Date(28, 7, 2020);
	Date d2 = new Date(19, 6, 2020);
	Date d3 = new Date(11, 5, 2020);
	Staff s1 = new OfficeStaff("abc", "tien", d1, false, 3.2);
	Staff s2 = new Manager("xxl", "an", d2, false, 4.5);
	Manager m1 = new Manager("xxl", "an", d2, false, 4.5);
	Staff s3 = new ContractualStaff("ZX", "tien", d1, false, 9);
	Staff s4 = new ProductionStaff("abc", "tien", d1, false, 12);
	IStaffs empty =  new MTIstaffs();
	IStaffs i1 = new ConsIstaffs(s1, empty);
	IStaffs i2 = new ConsIstaffs(s2, i1);
	IStaffs i3 = new ConsIstaffs(s3, i2);
	IStaffs i4 = new ConsIstaffs(s4, i3);
	Department pd1 = new Department("thien li", 1965, m1 , i4);
	
	public void testConstructor() {
		System.out.println("testConstructor");
		System.out.println(pd1);
	}
public void testWage() {
	System.out.println("testWage");
	System.out.println(s1.wage());
	System.out.println(s4.wage());
	System.out.println(s3.wage());
}
public void testtotalWage() {
	System.out.println("testtotalWage");
	System.out.println(pd1.totalWage());
}
public void testmaxWage() {
	System.out.println("testmaxWage");
	System.out.println(pd1.maxWage());
}
}