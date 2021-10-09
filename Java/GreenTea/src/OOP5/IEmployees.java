package OOP5;

public interface IEmployees {
	public double salaryTotal();

	public double salaryMax();

	public IEmployees getEmployeesByName(String name);

	public IEmployees sortBySalary();

	public IEmployees insertInSalary(Employee first);
}
