package demo;

public class ContractualStaff extends Staff {
	private int hours;
	

	public ContractualStaff(String id, String name, Date birthday, boolean gT, int hours) {
		super(id, name, birthday, gT);
		this.hours = hours;
	}


	@Override
	public String toString() {
		return " [hours=" + hours + super.toString() +"]";
	}


	@Override
	public double wage() {
		// TODO Auto-generated method stub
		if (this.hours >= 60)
				return (this.hours - 60 * 1.5 * 80 + 60 * 80);
	return this.hours * 80;
	
	}
	

}
