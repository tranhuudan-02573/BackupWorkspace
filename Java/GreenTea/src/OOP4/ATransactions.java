package OOP4;

public abstract class ATransactions {
	protected String id;
	protected int date;
	public ATransactions(String id, int date) {
		super();
		this.id = id;
		this.date = date;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ATransactions other = (ATransactions) obj;
		if (date != other.date)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", date=" + date + "]";
	}
	public abstract double fee();

	
	
	
	
	

}
