package bai5_1;

public class House {
	private String kind;
	private int numberOfRoom;
	private int price;
	private String street;
	private String city;
	// constructor
	public House(String kind, int numberOfRoom, int price, String street, String city) {
		super();
		this.kind = kind;
		this.numberOfRoom = numberOfRoom;
		this.price = price;
		this.street = street;
		this.city = city;
	}
	// getter and setter
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getNumberOfRoom() {
		return numberOfRoom;
	}
	public void setNumberOfRoom(int numberOfRoom) {
		this.numberOfRoom = numberOfRoom;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	// toString
	public String toString() {
		return "\nkind: " + this.kind + "\nnumberOfRoom: " + this.numberOfRoom 
				+ "\nprice: " + this.price + "\nstreet: " + this.street + "\ncity: " + this.city;
	}
	
}
