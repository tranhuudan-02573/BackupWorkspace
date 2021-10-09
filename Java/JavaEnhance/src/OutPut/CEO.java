package OutPut;

public class CEO {
	private String name;
	private double salary; // In billions

	public CEO(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
}
