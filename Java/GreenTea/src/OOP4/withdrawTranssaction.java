package OOP4;

public class withdrawTranssaction extends ATransactions {
	private int amount;

	public withdrawTranssaction(String id, int date, int amount) {
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
		withdrawTranssaction other = (withdrawTranssaction) obj;
		if (amount != other.amount)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "withdrawTranssaction [amount=" + amount + super.toString() + "]";
	}

	@Override
	public double fee() {
		// TODO Auto-generated method stub
		if (this.amount < 10000000) {
			return 0;
		} else {
			if (this.amount < 30000000) {
				return 5000;
			}
			return 10000;
		}

	}



}
