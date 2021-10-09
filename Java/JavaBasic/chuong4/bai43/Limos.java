package bai43;

public class Limos extends AVehicle{// xe khách 
	private int yearOrigin;// năm sản xuất
	// contructor
	public Limos(String color, int chair, int yearOrigin) {
		super(color, chair);
		this.yearOrigin = yearOrigin;
	}
	// getter and setter
	public int getYearOrigin() {
		return yearOrigin;
	}
	public void setYearOrigin(int yearOrigin) {
		this.yearOrigin = yearOrigin;
	}
	

}
