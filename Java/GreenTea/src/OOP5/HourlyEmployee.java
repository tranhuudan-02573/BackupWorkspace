package OOP5;

public class HourlyEmployee extends Employee {
	private int hourlyRate;
	private int primaryHours;

	public HourlyEmployee(Name name, HiredDate hiredDate, int hourlyRate, int primaryHours) {
		super(name, hiredDate);
		this.hourlyRate = hourlyRate;
		this.primaryHours = primaryHours;
	}

	@Override
	public double monthlySalary() {
		return this.hourlyRate * this.primaryHours * 4;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		HourlyEmployee other = (HourlyEmployee) obj;
		if (hourlyRate != other.hourlyRate)
			return false;
		if (primaryHours != other.primaryHours)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [hourlyRate=" + hourlyRate + ", primaryHours=" + primaryHours + super.toString() + "]";
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getPrimaryHours() {
		return primaryHours;
	}

	public void setPrimaryHours(int primaryHours) {
		this.primaryHours = primaryHours;
	}

}
