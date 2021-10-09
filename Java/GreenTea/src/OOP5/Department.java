package OOP5;

public class Department {
	private String depName;
	private IEmployees listEmployees;

	public Department(String depName, IEmployees listEmployees) {
		super();
		this.depName = depName;
		this.listEmployees = listEmployees;
	}

	public double salaryTotal() {
		return listEmployees.salaryTotal();
	}

	public double salaryMax() {
		return listEmployees.salaryMax();
	}

	public IEmployees getEmployeesByName(String name) {
		return listEmployees.getEmployeesByName(name);
	}

	public IEmployees sortBySalary() {
		return this.listEmployees.sortBySalary();
	}

	public String getDepName() {
		return this.depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public IEmployees getListEmployees() {
		return listEmployees;
	}

	public void setListEmployees(IEmployees listEmployees) {
		this.listEmployees = listEmployees;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (depName == null) {
			if (other.depName != null)
				return false;
		} else if (!depName.equals(other.depName))
			return false;
		if (listEmployees == null) {
			if (other.listEmployees != null)
				return false;
		} else if (!listEmployees.equals(other.listEmployees))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[depName=" + depName + this.listEmployees.toString() + "]";
	}

}
