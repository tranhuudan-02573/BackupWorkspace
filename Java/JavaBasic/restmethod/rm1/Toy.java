package rm1;

public class Toy {
	private String name;
	private double price;
	private int availbale;
	
	// getter and setter 
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getAvailbale() {
		return availbale;
	}


	public void setAvailbale(int availbale) {
		this.availbale = availbale;
	}

	// constructor
	public Toy(String name, double price, int availbale) {
		super();
		this.name = name;
		this.price = price;
		this.availbale = availbale;
	}


	public boolean isName(String toyname) {
		return this.name.equals(toyname);
	}


	public boolean isPriceBelow(double threshold) {
		// TODO Auto-generated method stub
		return this.price < threshold;
	}

	// immustable ko thẻ update
	public Toy copyWithRaisePrice(double rate) {
		// TODO Auto-generated method stub
		return new Toy( this.name, this.price * (1 + rate), this.availbale);
	}
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Toy))
			return false;
		else {
			Toy that = (Toy) obj;
			return this.name.equals(that.name) && this.price == that.price && this.availbale  == that.availbale;
		}
	}

	// mutable có thể update
	public void setNewPrice(double rate) {
		// TODO Auto-generated method stub
		this.price = this.price * (1 + rate);
	}


	
	


}
