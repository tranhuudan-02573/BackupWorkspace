package bai43;

public class Subways extends AVehicle{// tàu điện ngầm
	private int averageTime;// thời gian trung bình tàu đến nơi 
	// contructor
	public Subways(String color, int chair, int averageTime) {
		super(color, chair);
		this.averageTime = averageTime;
	}
	// getter and setter
	public int getAverageTime() {
		return averageTime;
	}
	public void setAverageTime(int averageTime) {
		this.averageTime = averageTime;
	}

	
	

}
