package SGK;

public class Specification {// hình dáng hộp sữa
	private double baseDiametter;// đường kính đáy
	private double height;// chiều cao của hộp sữa 
	// contructor
	public Specification(double baseDiametter, double height) {
		super();
		this.baseDiametter = baseDiametter;
		this.height = height;
	}
	// getter and setter 
	public double getBaseDiametter() {
		return baseDiametter;
	}
	public void setBaseDiametter(double baseDiametter) {
		this.baseDiametter = baseDiametter;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	// tính thể tích của hộp sữa 
	public double volumn() {
		return this.baseDiametter*this.baseDiametter*this.height*Math.PI;
	}
	
}
