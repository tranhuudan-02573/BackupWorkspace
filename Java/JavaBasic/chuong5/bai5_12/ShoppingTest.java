package bai5_12;

import junit.framework.TestCase;

public class ShoppingTest extends TestCase {

	public void testHowMany() {
		AAnItem ic1 = new IceCream("Hanoi", 300.0D, 10000.0, "orange", "medium");
		AAnItem j1 = new Juice("Saigon", 400.0D, 500000.0, "apple", "medium");
		AAnItem c1 = new Coffee("Hanoi", "Highlands", 30.0, 100000.0D);
		IShopingList empty = new MTShopingList();
		ConsShopingList l1 = new ConsShopingList(ic1, empty);
		ConsShopingList l2 = new ConsShopingList(j1, l1);
		ConsShopingList l3 = new ConsShopingList(c1, l2);
		assertEquals(l3.howMany(), 3);
	}

	public void testBrandName() {
		AAnItem ic1 = new IceCream("Hanoi", 300.0, 10000.0, "orange", "medium");
		AAnItem j1 = new Juice("Saigon", 400.0, 500000.0, "apple", "medium");
		AAnItem c1 = new Coffee("Thai", "Highlands", 30.0, 100000.0);
		IShopingList empty = new MTShopingList();
		ConsShopingList l1 = new ConsShopingList(ic1, empty);
		ConsShopingList l2 = new ConsShopingList(j1, l1);
		ConsShopingList l3 = new ConsShopingList(c1, l2);
		assertEquals(l3.brandList().getName(), "Hanoi\nHighlands\nSaigon\n");
	}

	public void testHighestPrice() {
		AAnItem ic1 = new IceCream("Hanoi", 300.0D, 10000.0D, "orange", "medium");
		AAnItem j1 = new Juice("Saigon", 400.0D, 500000.0D, "apple", "medium");
		AAnItem c1 = new Coffee("Hanoi", "Highlands", 30.0D, 100000.0D);
		IShopingList empty = new MTShopingList();
		ConsShopingList l1 = new ConsShopingList(ic1, empty);
		ConsShopingList l2 = new ConsShopingList(j1, l1);
		ConsShopingList l3 = new ConsShopingList(c1, l2);
		assertEquals(l3.highestPrice(), 500000.0D, 0.001);
	}
}
