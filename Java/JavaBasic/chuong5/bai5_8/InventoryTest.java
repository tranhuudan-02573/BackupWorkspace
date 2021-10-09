package bai5_8;

import junit.framework.TestCase;

public class InventoryTest extends TestCase {

	public void testAveragePrice() {
		Toy t1 = new Toy("robot", 500000.0, true);
		Toy t2 = new Toy("car", 300000.0, true);
		Toy t3 = new Toy("robot", 600000.0, true);
		MTInventory empty = new MTInventory();
		ConsInventory l1 = new ConsInventory(t3, empty);
		ConsInventory l2 = new ConsInventory(t2, l1);
		ConsInventory l3 = new ConsInventory(t1, l2);
		assertEquals(l3.averagePrice(), 466666.666D, 0.001D);
	}

	public void testEliminate() {
		Toy t1 = new Toy("robot", 500000.0, true);
		Toy t2 = new Toy("car", 300000.0, true);
		Toy t3 = new Toy("robot", 600000.0, true);
		MTInventory empty = new MTInventory();
		ConsInventory l1 = new ConsInventory(t3, empty);
		ConsInventory l2 = new ConsInventory(t2, l1);
		ConsInventory l3 = new ConsInventory(t1, l2);
		assertEquals(l3.eliminate("robot").getName(), "robot\nrobot\n");
	}

	public void testReplaceName() {
		Toy t1 = new Toy("robot", 500000.0, true);
		Toy t2 = new Toy("robot", 300000.0, true);
		Toy t3 = new Toy("car", 600000.0, true);
		MTInventory empty = new MTInventory();
		ConsInventory l1 = new ConsInventory(t3, empty);
		ConsInventory l2 = new ConsInventory(t2, l1);
		ConsInventory l3 = new ConsInventory(t1, l2);
		l3.replaceName();
		assertEquals(t1.getName(), "r2d2");
		assertEquals(t2.getName(), "r2d2");
	}
}
