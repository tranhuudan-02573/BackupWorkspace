package OOP4;

public class ConsTransactions implements ITransactions{
	private ATransactions first;
	private ITransactions rest;
	public ConsTransactions(ATransactions first, ITransactions rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	public ATransactions getFirst() {
		return first;
	}
	public void setFirst(ATransactions first) {
		this.first = first;
	}
	public ITransactions getRest() {
		return rest;
	}
	public void setRest(ITransactions rest) {
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
		ConsTransactions other = (ConsTransactions) obj;
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
	@Override
	public double totalFee() {
		// TODO Auto-generated method stub
		return this.first.fee() + this.rest.totalFee();
	}
	@Override
	public double maxFee() {
		// TODO Auto-generated method stub
		return Math.max(this.first.fee(), this.rest.maxFee());
	}
	
	

}
