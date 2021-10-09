package bai47;

public class Cab extends ATaxiVehicle {// xe taxi
	// contructor
	public Cab(int idNum, int passengers, int pricePerMile) {
		super(idNum, passengers, pricePerMile);
	}
	// tính tiền vé
	public double fare(double numberOfMiles) {
		return this.pricePerMile * numberOfMiles;
	}
	

}
