package OOP1;

import junit.framework.TestCase;

public class SuperMarketTest extends TestCase {
	Date d1 = new Date(6, 2, 2020);

	AItem f1 = new Food("rau", 30.5, "babc", 0.05, d1);

	AItem hw1 = new HouseWare("tu lanh", 565.4, "bbbc", 0.2);

	IItems i1 = new MTItems();
	IItems i2 = new ConsItems(f1, i1);
	IItems i3 = new ConsItems(hw1, i2);

	Producers p1 = new Producers("babc", "24 pham van dong", 0564765643, i2);
	Producers p2 = new Producers("bbbc", "24 hung vuong", 05645465643, i3);

	ISuperMarket s1 = new MTSuperMarket();
	ISuperMarket s2 = new ConsSuperMarket(p1, s1);
	ISuperMarket s3 = new ConsSuperMarket(p2, s2);

	public void testMarket() {

		System.out.println("\nConstructor:");
		System.out.println(p2);
		System.out.println(p1);

	}

	public void testListProducts() {

		System.out.println("\nlistProduct:");
		System.out.println(p2.listProducts());

	}

	public void testSortByName() {
//
//		assertEquals(i1.sortByName(), new MTItems());
//		assertEquals(i2.sortByName(), new ConsItems(f1, new MTItems()));
//		assertEquals(i3.sortByName(), new ConsItems(f1, new ConsItems(hw1, new MTItems())));
		System.out.println("sortByName:");
		System.out.println(i3.sortByName());

	}

	public void testIsSupplied() {
		assertTrue(p1.isSupplied(f1));
		assertFalse(p2.isSupplied(hw1));
	}

	public void testSameProduct() {
		assertTrue(p1.sameProduct(p2, hw1));

	}

	public void testMinPrice() {
		assertEquals(s3.minprice(), 565.4);
	}

	public void testDomestic() {
		assertEquals(p2.domestic(), new ConsItems(hw1, new MTItems()));

	}

}
