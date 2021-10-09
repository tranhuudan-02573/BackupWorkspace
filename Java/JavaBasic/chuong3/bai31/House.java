package bai31;

public class House { // nhà
	private String kind; // lọai nhà
	private int theNumberRoom; // số phòng  
	private double price; // số tiền
	private Aaddress add; // địa chỉ
	// contructor
	public House(String kind, int theNumberRoom, double price, Aaddress add) {
		super();
		this.kind = kind;
		this.theNumberRoom = theNumberRoom;
		this.price = price;
		this.add = add;
	}
	// getter and setter
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getTheNumberRoom() {
		return theNumberRoom;
	}
	public void setTheNumberRoom(int theNumberRoom) {
		this.theNumberRoom = theNumberRoom;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Aaddress getAdd() {
		return add;
	}
	public void setAdd(Aaddress add) {
		this.add = add;
	}
	// so sánh nhà này có nhiều phòng hơn nhà kia hay không
	public boolean hasMoreRooms(House other) { 
		return this.theNumberRoom> other.theNumberRoom;
	}
	// so sánh thành phố này có nằm trong địa chỉ cần đến hay không
	public boolean inThisCity(String city) { 
	    return this.add.inThisCity(city);
	}
	// kiểm tra xem nhà này có giống với nhà kia hay không
	public boolean sameCity(House other) { 
		return this.add.equals(other.add);
	}
}
