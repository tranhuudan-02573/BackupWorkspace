package OOP3;

public class OfficeStaff extends AStaff{
	private static final int basicSalary = 1490000;
	private double coefficientSalary;

	public OfficeStaff(String id, String name, Birthday date, boolean gender, double coefficientSalary) {
		super(id, name, date, gender);
		this.coefficientSalary = coefficientSalary;
	}

	public double getCoefficientSalary() {
		return coefficientSalary;
	}

	public void setCoefficientSalary(double coefficientSalary) {
		this.coefficientSalary = coefficientSalary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(coefficientSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		OfficeStaff other = (OfficeStaff) obj;
		if (Double.doubleToLongBits(coefficientSalary) != Double.doubleToLongBits(other.coefficientSalary))
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "OfficeStaff [coefficientSalary=" + coefficientSalary + super.toString() + "]";
	}

	@Override
	public int wage() {
		// TODO Auto-generated method stub
		return  (int) (this.coefficientSalary * basicSalary);
	}
	

}
