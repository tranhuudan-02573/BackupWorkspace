package bai41;

public class Checking extends ABankAccount { // tài khoản kiểm tra
	private double minimumBalance; // số dư tối thiểu
	// contructor
	public Checking(String name, String id, double hasMoney, double minimumBalance) {
		super(name, id, hasMoney);
		this.minimumBalance = minimumBalance;
	}
	// getter and setter
	public double getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
	
	

}
