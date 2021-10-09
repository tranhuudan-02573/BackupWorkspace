package bai17;

public class TemperatureRange { // phạm vi nhiệt độ
	private int low; // thấp 
	private int high; // cao
	// contructor
	public TemperatureRange(int low, int high) {
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
	
	
}
