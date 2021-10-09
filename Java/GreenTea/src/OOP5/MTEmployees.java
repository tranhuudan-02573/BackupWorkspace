package OOP5;

public class MTEmployees implements IEmployees {

	@Override
	public String toString() {
		return "";
	}

	@Override
	public double salaryTotal() {
		return 0;
	}

	@Override
	public double salaryMax() {
		return 0;
	}

	@Override
	public IEmployees getEmployeesByName(String name) {
		return new MTEmployees();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof MTEmployees))
			return false;
		return true;
	}

	@Override
	public IEmployees sortBySalary() {
		System.out.println("dfsadfsdfasdfadsfasdfsd");
		return new MTEmployees();
	}

	@Override
	public IEmployees insertInSalary(Employee first) {
		return new ConsEmployees(first, this);
	}

}
