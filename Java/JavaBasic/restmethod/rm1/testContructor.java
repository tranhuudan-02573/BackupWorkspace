package rm1;

import junit.framework.TestCase;

public class testContructor   extends TestCase{
public void testC() {
	 Toy t1= new Toy("baba",7,2);
	 Toy t2= new Toy("va",7,4);
	 Toy t3= new Toy("ka",8,2);
	 
	 IInventory e1= new MTInventory();
	 IInventory l1 = new ConsInventory(t1,e1);
	 IInventory l2 = new ConsInventory(t2,l1);
	 IInventory l3 = new ConsInventory(t3,l2);
	
	 System.out.println(l3.raisePrice(9.5));
	 
}
public void testCa() {
	 Toy t1= new Toy("bba",7,1);
	 Toy t2= new Toy("v",7,2);
	 Toy t3= new Toy("k",8,5);
	 
	 IInventory e1= new MTInventory();
	 IInventory l1 = new ConsInventory(t1,e1);
	 IInventory l2 = new ConsInventory(t2,l1);
	 IInventory l3 = new ConsInventory(t3,l2);
//	 System.out.println(l3.raisePriceMutable(9.1));
}
	
}
