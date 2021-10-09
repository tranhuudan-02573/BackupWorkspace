package bai41;

public class Saving extends ABankAccount {// tài khoản tiết kiệm
	private String interestRate; // lãi suất
	// contructor
	public Saving(String name, String id, double hasMoney, String interestRate) {
		super(name, id, hasMoney);
		this.interestRate = interestRate;
	}
	// getter and setter
	public String getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}
	

}
