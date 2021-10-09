package bai43;

import junit.framework.TestCase;

public class VehicleTest extends TestCase{
	public void testAVehicle() {
		AVehicle vehicle1 = new Subways("red", 50, 20);
		AVehicle vehicle2 = new Limos("Black", 8, 1898);
		AVehicle vehicle3 = new Cars("white", 6, "66-D4098.98");
	}

}
