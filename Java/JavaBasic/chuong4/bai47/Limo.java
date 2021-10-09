package bai47;

public class Limo extends ATaxiVehicle {// xe khách 
	private int minRental;// chi phí thuê xe tối thiểu 
	// getter and setter
	public int getMinRental() {
		return minRental;
	}
	public void setMinRental(int minRental) {
		this.minRental = minRental;
	}
	// contructor
	public Limo(int idNum, int passengers, int pricePerMile, int minRental) {
		super(idNum, passengers, pricePerMile);
		this.minRental = minRental;
	}
	// tính tiền phải trả theo 2 hình thức
	public double fare(double numberOfMiles) {
		if (this.pricePerMile * numberOfMiles < minRental)
			return this.minRental;
		else return this.pricePerMile * numberOfMiles; 
	}

}
