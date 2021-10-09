package bai22;

public class MovieShow { // buổi chiếu phim
	private double price; // tiền vé
	private double costPerformance; // chi phí trả thêm
	private double costAttendee; // chi phí dịch vụ mỗi khách
	// contructor
	public MovieShow(double price, double costPerformance, double costAttendee) {
		super();
		this.price = price;
		this.costPerformance = costPerformance;
		this.costAttendee = costAttendee;
	}
	// getter and setter
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getCostPerformance() {
		return costPerformance;
	}
	public void setCostPerformance(double costPerformance) {
		this.costPerformance = costPerformance;
	}
	public double getCostAttendee() {
		return costAttendee;
	}
	public void setCostAttendee(double costAttendee) {
		this.costAttendee = costAttendee;
	}
	// chi phí phải trả
	public double cost(int numAttendee) { 
		return this.costPerformance + this.costAttendee * numAttendee;
	}
	// tiền vé
	public double revenue(int numAttendee) { 
		return this.price * numAttendee;
	}
	// tổng tiền nhận được
	public double totalProfit(int numAttendee) { 
		return this.revenue(numAttendee) - this.cost(numAttendee);
	}
}
