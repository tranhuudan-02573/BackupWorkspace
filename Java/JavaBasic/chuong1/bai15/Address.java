package bai15;

public class Address { // địa chỉ
	private int houseNumber; // số nhà
	private String stressName; // tên đường
	private String city; // tên thành phố
	// contructor
	public Address(int houseNumber, String stressName, String city) {
		this.houseNumber = houseNumber;
		this.stressName = stressName;
		this.city = city;
	}
	// getter and setter
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStressName() {
		return stressName;
	}
	public void setStressName(String stressName) {
		this.stressName = stressName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
