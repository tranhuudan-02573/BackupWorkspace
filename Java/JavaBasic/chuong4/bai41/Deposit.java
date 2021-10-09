package bai41;

public class Deposit extends ABankAccount{ // chứng chỉ gửi tiền
	private String interestRate; // lãi suất
	private Maturity date; // ngày gửi
	// contructor
	public Deposit(String name, String id, double hasMoney, String interestRate, Maturity date) {
		super(name, id, hasMoney);
		this.interestRate = interestRate;
		this.date = date;
	}
	// getter and setter
	public String getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}
	public Maturity getDate() {
		return date;
	}
	public void setDate(Maturity date) {
		this.date = date;
	}
	
	
	

}
