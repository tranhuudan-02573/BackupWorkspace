package bai5_12;

public class MTShopingList implements IShopingList {

	public int howMany() {
		return 0;
	}

	public IShopingList brandList() {
		return new MTShopingList();
	}

	public IShopingList sortName(AAnItem that) {
		return new ConsShopingList(that, this.brandList());
	}

	public double highestPrice() {
		return 0.0D;
	}

	public String getName() {
		return "";
	}
}
