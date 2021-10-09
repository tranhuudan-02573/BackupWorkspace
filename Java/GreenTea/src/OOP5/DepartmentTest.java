package OOP5;

import junit.framework.TestCase;

public class DepartmentTest extends TestCase {
	HiredDate h1 = new HiredDate(20, 05, 2001);
	HiredDate h2 = new HiredDate(1, 7, 2010);
	HiredDate h3 = new HiredDate(30, 6, 2009);
	HiredDate h4 = new HiredDate(1, 6, 2010);
	HiredDate h5 = new HiredDate(25, 9, 2013);
	Name n1 = new Name("Nguyen", "Van", "Minh");
	Name n2 = new Name("", "Ly", "Loan");
	Name n3 = new Name("Tran", "Duc", "Minh");
	Name n4 = new Name("Nguyen", "Thi", "Hien");
	Name n5 =new Name("Le", "Dinh", "Van");
	Employee e1 = new SalaryEmployee(n1 , h1, 4.36, 2500);
	Employee e2 = new SalaryEmployee(n2, h2, 3.14, 1110);
	Employee e3 = new HourlyEmployee(n3, h3, 50000, 40);
	Employee e4 = new HourlyEmployee(n4, h4, 70000, 24);
	Employee e5 = new Consultant(n5, h5, 012030, 5000000);

	IEmployees i = new MTEmployees();
	IEmployees i1 = new ConsEmployees(e1, i);
	IEmployees i2 = new ConsEmployees(e2, i1);
	IEmployees i3 = new ConsEmployees(e3, i2);
	IEmployees i4 = new ConsEmployees(e4, i3);
	IEmployees i5 = new ConsEmployees(e5, i4);

	Department d = new Department("A", i1);
	Department d2 = new Department("B", i2);
	Department d3 = new Department("A", i3);
	Department d4 = new Department("B", i4);
	Department d5 = new Department("B", i5);

	public void testFullName() {
		System.out.println("testFullName");
		System.out.println(e1.fullName());
		System.out.println(e2.fullName());
		System.out.println(e3.fullName());
		System.out.println(e4.fullName());
		System.out.println(e5.fullName());

	}

	public void testWorkingAfter() {

		assertFalse(e1.workingAfter(e2));
		assertFalse(e2.workingAfter(e2));
		assertTrue(e2.workingAfter(e3));
		assertTrue(e2.workingAfter(e4));
	}

	public void testWorkingYears() {
		System.out.println("testWorkingYears");
		System.out.println(e1.workingYears(2015));
		System.out.println(e2.workingYears(2017));
		System.out.println(e3.workingYears(2013));
		System.out.println(e4.workingYears(2012));
		System.out.println(e5.workingYears(2019));

	}

	public void testMonthlySalary() {
		System.out.println("testMonthlySalary");
		System.out.println(e1.monthlySalary());
		System.out.println(e2.monthlySalary());
		System.out.println(e3.monthlySalary());
		System.out.println(e4.monthlySalary());
		System.out.println(e5.monthlySalary());
	}

	public void testSalaryTotal() {
		System.out.println("testSalaryTotal ");
		System.out.println(i5.salaryTotal());
	}

	public void testSalaryMax() {
		System.out.println("testSalaryMax");
		System.out.println(i5.salaryMax());
	}

	public void testGetEmployeesByName() {
		System.out.println("testGetEmployeesByName");
		System.out.println(d5.getEmployeesByName("B"));
	}

	public void testSortBySalary() {
		System.out.println("testSortBySalary");
		System.out.println(i5.sortBySalary());
	}

}
