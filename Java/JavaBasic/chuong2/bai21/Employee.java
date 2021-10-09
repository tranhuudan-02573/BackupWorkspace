package bai21;

public class Employee { // người chưa có việc làm
	private String name; // tên
	private int hours; // số giờ làm việc 
	// contructor
	public Employee(String name, int hours) {
		this.name = name;
		this.hours = hours;
	}
	// getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	// tính tiền lương 
	public double wage() { 
		return this.hours * 12;
	}
	 // tính tiền thuế
	public double tax() { 
		return this.wage() * 0.15;
	}
	// tổng tiền họ nhận được
	public double netpay() { 
		return this.wage() - this.tax();
	}
	// tăng lương
	public double raisedWage() { 
		return this.netpay() + 14;
	}
	// kiểm tra xem có ai làm việc quá 100 giờ không 
	public boolean checkOverTime() { 
		return this.hours > 100;
	}
}
