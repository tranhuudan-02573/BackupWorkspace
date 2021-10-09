package OutPut;

public class _2 {
	public static void main(String[] args) {

		CEO[] softwareCEOs = { new CEO("Steve Jobs", 3.1234), new CEO("Scott McNealy", 45.5678),
				new CEO("Jeff Bezos", 567.982323), new CEO("Larry Ellison", 6789.0),
				new CEO("Bill Gates", 78901234567890.12) };
		System.out.println("SALARIES:");
		for (CEO ceo : softwareCEOs) {
			System.out.printf("%15s: $ %,8.2f%n", ceo.getName(), ceo.getSalary());
		}

	}

}
