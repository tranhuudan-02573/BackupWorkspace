package bai47;

public abstract class ATaxiVehicle implements ITaxiVehicle {// các đội xe
	protected int idNum;// số xe
	protected int passengers;// hành khách
	protected int pricePerMile;// giá đi 
	// contructor
	public ATaxiVehicle(int idNum, int passengers, int pricePerMile) {
		super();
		this.idNum = idNum;
		this.passengers = passengers;
		this.pricePerMile = pricePerMile;
	}
	public abstract double fare(double numberOfMiles);
	// so sánh xem giá vé đó có nhỏ hơn số tiền tính theo số lượng không
	public boolean lowerPrice(double numberOfMiles, double amount) {
		return this.fare(numberOfMiles) < amount;
	}
	// kiểm tra xem giá vé của xe nào rẻ hơn được tính cùng quãng đường đi
	public boolean cheaperThan(double numberOfMiles, ATaxiVehicle that) {
		return this.fare(numberOfMiles) < that.fare(numberOfMiles);
	}
}
