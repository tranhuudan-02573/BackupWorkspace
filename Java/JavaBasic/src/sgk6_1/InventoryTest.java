package sgk6_1;

import junit.framework.TestCase;


public class InventoryTest extends TestCase {
	Toy doll = new Toy("doll", 17.95, 5);
	Toy robot = new Toy("robot", 22.05, 3);
	Toy gun = new Toy("gun", 15.0, 4);
	
	Inventory i1 = new MTInventory();
	Inventory i2 = new ConsInventory(gun, i1);
	Inventory i3 = new ConsInventory(robot, i2);
	Inventory i4 = new ConsInventory(doll, i3);
	public void testContructor() {
		System.out.println("testContructor");
	System.out.println(i4);
		
	
		
	}
	public void testReplaceName() {
		System.out.println("testReplaceName");
		
		System.out.println(i4.replaceName());
	}
	public void testAveragePrice() {
		System.out.println("testAveragePrice");
		
		System.out.println(i4.averagePrice());
	}
	public void testEliminate() {
		System.out.println("testEliminate");
		
		System.out.println(i4.eliminate("doll"));
	}
	
	
	

}
