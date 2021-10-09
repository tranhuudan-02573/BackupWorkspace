package bai31;

public class Aaddress { // địa chỉ
	private int houseNumber; // số nhà 
	private String stressName; // tên đường 
	private String city; // tên thành phố
	// contructor	
	public Aaddress(int houseNumber, String stressName, String city) {
		super();
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
	// kiểm tra xem 2 thành phố có cùng nằm trong cùng 1 địa chỉ không
	public boolean inThisCity(String thatCity) {
		return this.city.equals(thatCity);
	}	
	// so sánh thành phố trong địa chỉ này có giống thành phố trong địa chỉ kia hay không
	public boolean sameCity(Aaddress that) { 
			return this.city.equals(that.city);
	}
}
