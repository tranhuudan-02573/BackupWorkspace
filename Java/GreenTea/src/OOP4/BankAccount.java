package OOP4;

public class BankAccount {
	private String accountNo;
	private Customer owner;
	private String brandLocation;
	private int balance;
	private ITransactions transaction;

	public BankAccount(String accountNo, Customer owner, String brandLocation, int balance, ITransactions transaction) {
		super();
		this.accountNo = accountNo;
		this.owner = owner;
		this.brandLocation = brandLocation;
		this.balance = balance;
		this.transaction = transaction;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public Customer getOwner() {
		return owner;
	}

	public void setOwner(Customer owner) {
		this.owner = owner;
	}

	public String getBrandLocation() {
		return brandLocation;
	}

	public void setBrandLocation(String brandLocation) {
		this.brandLocation = brandLocation;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public ITransactions getTransaction() {
		return transaction;
	}

	public void setTransaction(ITransactions transaction) {
		this.transaction = transaction;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (accountNo != other.accountNo)
			return false;
		if (balance != other.balance)
			return false;
		if (brandLocation == null) {
			if (other.brandLocation != null)
				return false;
		} else if (!brandLocation.equals(other.brandLocation))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (transaction == null) {
			if (other.transaction != null)
				return false;
		} else if (!transaction.equals(other.transaction))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[accountNo=" + accountNo + this.owner.toString() + ", brandLocation=" + brandLocation + ", balance="
				+ balance + this.transaction.toString() + "]";
	}

	public double totalFee() {
		return this.transaction.totalFee();
	}

	public double maxFee() {
		return this.transaction.maxFee();
	}

}
