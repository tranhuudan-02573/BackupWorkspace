package bai15;

public class Estate { // bất động sản
	private String kind; // loại nhà
	private int theNumberOfRoom; // số phòng
	private double price; // giá bán
	private Address address; // địa chỉ
	// contructor
	public Estate(String kind, int theNumberOfRoom, double price, Address address) {
		super();
		this.kind = kind;
		this.theNumberOfRoom = theNumberOfRoom;
		this.price = price;
		this.address = address;
	}
	// getter and setter
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getTheNumberOfRoom() {
		return theNumberOfRoom;
	}
	public void setTheNumberOfRoom(int theNumberOfRoom) {
		this.theNumberOfRoom = theNumberOfRoom;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
		
}
