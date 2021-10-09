package bai46;

public class Juice extends AItems{// nước ép 
	private String flavor;// hương vị
	// contructor
	public Juice(String name, int price, double weight, String flavor) {
		super(name, price, weight);
		this.flavor = flavor;
	}
	// getter and setter
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}


	
	
	
	
}
