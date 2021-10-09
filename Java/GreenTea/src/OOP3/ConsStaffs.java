package OOP3;

public class ConsStaffs implements IStaffs{
	private AStaff first;
	private IStaffs rest;
	public ConsStaffs(AStaff first, IStaffs rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	public AStaff getFirst() {
		return first;
	}
	public void setFirst(AStaff first) {
		this.first = first;
	}
	public IStaffs getRest() {
		return rest;
	}
	public void setRest(IStaffs rest) {
		this.rest = rest;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConsStaffs other = (ConsStaffs) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (rest == null) {
			if (other.rest != null)
				return false;
		} else if (!rest.equals(other.rest))
			return false;
		return true;
	}
	public String toString() {
		return this.first.toString() + "\n" + this.rest.toString();
	}
	public int totalWage() {
		return (this.first.wage() + this.rest.totalWage());
		
	}
	public double maxWage() {
		return Math.max(this.first.wage(), this.rest.maxWage());
	}
	
	
	
}
