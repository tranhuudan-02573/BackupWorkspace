package bai25;

public class JetFuel { // nhiên liệu
	private int quantitySold; // chất lượng đã bán
	private String qualityLevel; // chất lượng nhiên liệu
	private int basePrice; // giá bán trên 1gallon
	// contructor
	public JetFuel(int quantitySold, String qualityLevel, int basePrice) {
		super();
		this.quantitySold = quantitySold;
		this.qualityLevel = qualityLevel;
		this.basePrice = basePrice;
	}
	// getter and setter
	public int getQuantitySold() {
		return quantitySold;
	}
	public void setQuantitySold(int quantitySold) {
		this.quantitySold = quantitySold;
	}
	public String getQualityLevel() {
		return qualityLevel;
	}
	public void setQualityLevel(String qualityLevel) {
		this.qualityLevel = qualityLevel;
	}
	public int getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}
	// tính tiền 
	public double totalCost() { 
		return (this.quantitySold * this.basePrice);
	}
	// thành tiền nếu họ đủ điều kiện đcược giảm giá
	public double discountPrice() {
		if (this.totalCost() > 100000) {
			return (this.totalCost()*0.9);
		}
		else return this.totalCost();
	}
	
	
}
