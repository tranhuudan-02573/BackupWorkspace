package bai24;

public class Coffee { 
	private String kind; // loại cà phê 
	private int price; // giá tiền
	private int weight; // trọng lượng
	// contructor
	public Coffee(String kind, int price, int weight) {
		this.kind = kind;
		this.price = price;
		this.weight = weight;
	}
	// getter and setter
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	// tính toán khuyến mãi dựa trên trọng lượng họ mua được
	public double sale() { 
		if (this.weight < 5000) {
			return this.price;
		}
		if (this.weight < 20000) {
			return 0.9 * this.price;
		}
		return 0.75 * this.price;
	}
}
