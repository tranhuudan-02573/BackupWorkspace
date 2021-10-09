package bai33;

public class TemperatureRange { // nhiệt độ 
	private int low; // thấp 
	private int high; // cao
	// contructor
	public TemperatureRange(int low, int high) {
		super();
		this.low = low;
		this.high = high;
	}
	// getter and setter
	public int getLow() {
		return low;
	}
	public void setLow(int low) {
		this.low = low;
	}
	public int getHigh() {
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	// kiểm tra xem nhiệt độ hôm nay có nằm trong khoảng bình thường không
	public boolean within(TemperatureRange that) { 
		return (this.low >= that.low) && (this.high <= that.high);
	}
	
}
