package bai46;

public class IceCream extends AItems{// kem
	private String type;// loại 
	// contructor
	public IceCream(String name, int price, double weight, String type) {
		super(name, price, weight);
		this.type = type;
	}
	// getter and setter 
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}


	

	
	

}
