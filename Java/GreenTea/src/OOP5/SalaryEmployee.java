package OOP5;

public class SalaryEmployee extends Employee {
	private double salaryFactor;
	private int stockOption;

	public SalaryEmployee(Name name, HiredDate hiredDate, double salaryFactor, int stockOption) {
		super(name, hiredDate);
		this.salaryFactor = salaryFactor;
		this.stockOption = stockOption;
	}

	@Override
	public double monthlySalary() {
		if (this.workingYears(2015) >= 6) {
			return this.salaryFactor * 1150000 + (200000 * this.workingYears(2015));
		} else
			return this.salaryFactor * 1150000;
	}

	public double getSalaryFactor() {
		return salaryFactor;
	}

	public void setSalaryFactor(double salaryFactor) {
		this.salaryFactor = salaryFactor;
	}

	public int getStockOption() {
		return stockOption;
	}

	public void setStockOption(int stockOption) {
		this.stockOption = stockOption;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SalaryEmployee other = (SalaryEmployee) obj;
		if (Double.doubleToLongBits(salaryFactor) != Double.doubleToLongBits(other.salaryFactor))
			return false;
		if (stockOption != other.stockOption)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[salaryFactor=" + salaryFactor + ", stockOption=" + stockOption + super.toString() + "]";
	}

}
