package bai27;

public class Transaction { // giao dịch
	private String customerName; // tên khách hàng
	private double depositeAmount; // sô tiền gửi
	private int maturity; // kì hạn thanh toán
	// contructor
	public Transaction(String customerName, double depositeAmount, int maturity) {
		super();
		this.customerName = customerName;
		this.depositeAmount = depositeAmount;
		this.maturity = maturity;
	}
	// getter and setter
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getDepositeAmount() {
		return depositeAmount;
	}
	public void setDepositeAmount(double depositeAmount) {
		this.depositeAmount = depositeAmount;
	}
	public int getMaturity() {
		return maturity;
	}
	public void setMaturity(int maturity) {
		this.maturity = maturity;
	}
	// tính tiền lãi 
	public double interest() { 
		if (this.depositeAmount <= 1000)
			return this.depositeAmount * 0.04;
		if (this.depositeAmount <= 5000)
			return this.depositeAmount * 0.045;
		return this.depositeAmount * 0.05;
	}
	// tính khoản tiền được hoàn lại nếu tiền lãi đủ điều kiện
	public double payBack() {  
		if (this.depositeAmount <= 500)
			return this.depositeAmount * 0.0025;
		if (this.depositeAmount <= 1500)
			return this.depositeAmount * 0.005;
		if (this.depositeAmount <= 2500)
			return this.depositeAmount * 0.0075;
		return this.depositeAmount * 0.01;
	}
}
