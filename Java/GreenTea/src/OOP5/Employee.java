package OOP5;

public abstract class Employee {
	protected Name name;
	protected HiredDate hiredDate;

	public Employee(Name name, HiredDate hiredDate) {
		super();
		this.name = name;
		this.hiredDate = hiredDate;
	}

	public String fullName() {
		return name.toString();
	}

	public boolean workingAfter(Employee that) {
		return this.hiredDate.workingAfter(that.hiredDate);
	}

	public int workingYears(int toYear) {
		return this.hiredDate.workingYears(toYear);
	}

	public abstract double monthlySalary();

	public boolean checkSameName(String name) {
		return this.name.checkSameName(name);
	}

	public boolean hasMoreSalary(Employee that) {
		return this.monthlySalary() > that.monthlySalary();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (hiredDate == null) {
			if (other.hiredDate != null)
				return false;
		} else if (!hiredDate.equals(other.hiredDate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[name=" + name + this.hiredDate.toString() + "]";
	}

}
