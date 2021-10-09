package bai47;

public class Van extends ATaxiVehicle {// xe oto
	private boolean access;// phụ thu mỗi khách 	
	// getter and setter 
	public boolean isAccess() {
		return access;
	}
	public void setAccess(boolean access) {
		this.access = access;
	}
	// contructor
	public Van(int idNum, int passengers, int pricePerMile, boolean access) {
		super(idNum, passengers, pricePerMile);
		this.access = access;
	}
	// tính tiền mà khách phải trả
	public double fare(double numberOfMiles) {
		return this.pricePerMile * numberOfMiles + this.passengers*20000;
	}


}
