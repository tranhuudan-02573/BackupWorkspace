package bai46;

public interface IItems {
	public double unitPrice();
	public boolean lowerPrice(double amount) ;
	public boolean cheaperThan(AItems that);
}
