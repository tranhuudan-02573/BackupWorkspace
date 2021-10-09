package OOP5;

public class ConsEmployees implements IEmployees {
	private Employee first;
	private IEmployees rest;
	IEmployees list = new MTEmployees();

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsEmployees))
			return false;
		else {
			ConsEmployees that = (ConsEmployees) obj;
			return this.first.equals(that.first) && this.rest.equals(that.rest);
		}
	}

	public ConsEmployees(Employee first, IEmployees rest) {
		this.first = first;
		this.rest = rest;
	}

	public String toString() {
		return this.first.toString() + "\n" + this.rest.toString();

	}

	@Override
	public double salaryTotal() {
		return first.monthlySalary() + rest.salaryTotal();
	}

	@Override
	public double salaryMax() {
		if (first.monthlySalary() < rest.salaryMax()) {
			return rest.salaryMax();
		} else
			return first.monthlySalary();
	}

	@Override
	public IEmployees getEmployeesByName(String name) {
		if (this.first.checkSameName(name)) {
			return new ConsEmployees(first, rest.getEmployeesByName(name));
		} else
			return rest.getEmployeesByName(name);
	}

	@Override
	public IEmployees sortBySalary() {
		return this.rest.sortBySalary().insertInSalary(first);
	}

	@Override
	public IEmployees insertInSalary(Employee first) {
		if (first.hasMoreSalary(this.first)) {
			return new ConsEmployees(first, this);
		} else
			return new ConsEmployees(this.first, rest.insertInSalary(first));
	}

	public Employee getFirst() {
		return first;
	}

	public void setFirst(Employee first) {
		this.first = first;
	}

	public IEmployees getRest() {
		return rest;
	}

	public void setRest(IEmployees rest) {
		this.rest = rest;
	}

	public IEmployees getList() {
		return list;
	}

	public void setList(IEmployees list) {
		this.list = list;
	}

}
