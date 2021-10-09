package bai41;

public abstract class ABankAccount implements IBankAccount { // tài khoản ngân hàng 
	protected String name; // tên khách hàng 
	protected String id; // mã khách hàng
	protected double hasMoney; // số dư hiện tại
	// contructor
	public ABankAccount(String name, String id, double hasMoney) {
		super();
		this.name = name;
		this.id = id;
		this.hasMoney = hasMoney;
	}
	

}
