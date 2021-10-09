package demo;

public class ConsIstaffs implements IStaffs {
	private Staff first;
	private IStaffs rest;
	public ConsIstaffs(Staff first, IStaffs rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	public Staff getFirst() {
		return first;
	}
	public void setFirst(Staff first) {
		this.first = first;
	}
	public IStaffs getRest() {
		return rest;
	}
	public void setRest(IStaffs rest) {
		this.rest = rest;
	}
	@Override
	public String toString() {
		return this.first.toString()+ "\n" + this.rest.toString() ;
		
		
	}
	public double totalWage() {
		return this.first.wage() + this.rest.totalWage();
		
	}
public double maxWage() {
	return Math.max(this.first.wage(), this.rest.maxWage());
}
		
	
	
	

}