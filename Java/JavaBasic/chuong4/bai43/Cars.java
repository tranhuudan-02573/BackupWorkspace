package bai43;

public class Cars extends AVehicle {// xe oto
	private String number;// bản số xe
	// contructor
	public Cars(String color, int chair, String number) {
		super(color, chair);
		this.number = number;
	}
	// getter and setter
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	
	
	

	
	
	

}
