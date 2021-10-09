package bai5_7;

public class MTList implements IList {

	public int howMany() {
		return 0;
	}

	public IList brandList() {
		return new MTList();
	}

	public IList sortName(AAnItem that) {
		return new ConsList(that, this.brandList());
	}

	public String getName() {
		return "";
	}

	public double highestPrice() {
		return 0.0;
	}
}
