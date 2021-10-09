package bai47;

public interface ITaxiVehicle {
	public double fare(double numberOfMiles);
	public boolean lowerPrice(double numberOfMiles, double amount);
	public boolean cheaperThan(double numberOfMiles, ATaxiVehicle that);
}
