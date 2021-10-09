package bai46;

public class Coffee extends AItems{// cà phê
	private String type;// loại 
	// contructor
	public Coffee(String name, int price, double weight, String type) {
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
