package bai48;

public interface IBook {
	public double salePrice();
	public boolean cheaperThan(ABook that) ;
	public boolean sameAuthor(ABook that);
	
}
