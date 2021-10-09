package bai5_12;

public class ConsShopingList implements IShopingList {
	private AAnItem first;
	private IShopingList rest;

	public ConsShopingList(AAnItem first, IShopingList rest) {
		this.first = first;
		this.rest = rest;
	}

	public int howMany() {
		return 1 + this.rest.howMany();
	}

	public IShopingList brandList() {
		return this.rest.brandList().sortName(this.first);
	}

	public IShopingList sortName(AAnItem that) {
		return this.first.compareString(that) > 0 ? new ConsShopingList(that, this.rest.sortName(this.first))
				: new ConsShopingList(this.first, this.rest.sortName(that));
	}

	public double highestPrice() {
		return Math.max(this.first.getPrice(), this.rest.highestPrice());
	}

	public String getName() {
		return this.first.getName() + "\n" + this.rest.getName();
	}
}
