package OOP3;

public class Manager extends OfficeStaff {
	private int year;

	public Manager(String id, String name, Birthday date, boolean gender, double coefficientSalary, int year) {
		super(id, name, date, gender, coefficientSalary);
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Manager [year=" + year + super.toString() + "]";
	}


}
