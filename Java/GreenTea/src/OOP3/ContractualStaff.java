package OOP3;

public class ContractualStaff extends AStaff {
	private static final int unitPricePerTime = 80000;
	private int hours;

	public ContractualStaff(String id, String name, Birthday date, boolean gender, int hours) {
		super(id, name, date, gender);
		this.hours = hours;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContractualStaff other = (ContractualStaff) obj;
		if (hours != other.hours)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "ContractualStaff [hours=" + hours + super.toString() + "]";
	}

	@Override
	public int wage() {
		// TODO Auto-generated method stub
		if (this.hours > 60)
			return (int) (((this.hours - 60) * 1.5 * unitPricePerTime) + 60 * unitPricePerTime);
		return this.hours * unitPricePerTime;
	}

}
