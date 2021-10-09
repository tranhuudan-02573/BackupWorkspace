package OOP4;

public class transferTransaction extends ATransactions {
	private String receivedAccountNo;
	private int amount;

	public transferTransaction(String id, int date,  String receivedAccountNo, int amount) {
		super(id, date);
		this.receivedAccountNo = receivedAccountNo;
		this.amount = amount;
	}

	public  String getReceivedAccountNo() {
		return receivedAccountNo;
	}

	public void setReceivedAccountNo( String receivedAccountNo) {
		this.receivedAccountNo = receivedAccountNo;
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
		transferTransaction other = (transferTransaction) obj;
		if (amount != other.amount)
			return false;
		if (receivedAccountNo != other.receivedAccountNo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "transferTransaction [receivedAccountNo=" + receivedAccountNo + ", amount=" + amount + super.toString()
				+ "]";
	}

	@Override
	public double fee() {
		// TODO Auto-generated method stub
		if (this.amount < 10000000) {
			return 0;
		} else {
			if (this.amount < 30000000) {
				return  (this.amount*0.0001);
			}
			return  (this.amount*0.0005);
		}

	}



}
