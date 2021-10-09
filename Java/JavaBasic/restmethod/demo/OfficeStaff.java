package demo;

public class OfficeStaff extends Staff {
	private double coefficientSalary;

	
	public OfficeStaff(String id, String name, Date birthday, boolean gT, double coefficientSalary) {
		super(id, name, birthday, gT);
		this.coefficientSalary = coefficientSalary;
	}



	public double getCoefficientSalary() {
		return coefficientSalary;
	}

	public void setCoefficientSalary(double coefficientSalary) {
		this.coefficientSalary = coefficientSalary;
	}

	@Override
	public String toString() {
		return " [coefficientSalary=" + coefficientSalary + super.toString() + "]";
		
	}
	
public double wage() {
	return this.coefficientSalary * 1490000;
	
	
}
}
