package demo;

public class Manager extends Staff{
	private double coefficientsalary;


	public Manager(String id, String name, Date birthday, boolean gT, double coefficientsalary) {
		super(id, name, birthday, gT);
		this.coefficientsalary = coefficientsalary;
	}

	public double getCoefficientsalary() {
		return coefficientsalary;
	}

	public void setCoefficientsalary(double coefficientsalary) {
		this.coefficientsalary = coefficientsalary;
	}

	@Override
	public String toString() {
		return " [coefficientsalary=" + coefficientsalary + super.toString() +"]";
	}

	@Override
	public double wage() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
