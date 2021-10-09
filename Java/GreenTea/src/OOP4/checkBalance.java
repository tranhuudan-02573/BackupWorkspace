package OOP4;

public class checkBalance extends ATransactions{

	public checkBalance(String id, int date) {
		super(id, date);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double fee() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\ncheckBalance" + super.toString();
	}
	
}
