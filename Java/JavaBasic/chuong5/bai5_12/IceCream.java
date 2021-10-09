package bai5_12;

public class IceCream extends AAnItem {
	private String flavor;
	private String packages;
	// constructor
	public IceCream(String branchName, double weight, double price, String flavor, String packages) {
		super(branchName, weight, price);
		this.flavor = flavor;
		this.packages = packages;
	}
	// getter and setter
	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public String getPackages() {
		return packages;
	}

	public void setPackages(String packages) {
		this.packages = packages;
	}
	
}
