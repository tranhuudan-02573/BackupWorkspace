package OOP4;

public class depositTransaction extends ATransactions{
	private int amount;

	public depositTransaction(String id, int date, int amount) {
		super(id, date);
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		depositTransaction other = (depositTransaction) obj;
		if (amount != other.amount)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "depositTransaction [amount=" + amount +  super.toString() + "]";
	}

	@Override
	public double fee() {
		// TODO Auto-generated method stub
		return  (this.amount * 0.0001);
	}


	
}
