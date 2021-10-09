package doWhile;

public class _18 {
	public static void main(String[] args) {
		int a = 15;
		int b = 6;
		while (a != b) {
			if (a > b)
				a = a - b;
			else if (a < b)
				b = b - a;
		}
		System.out.println("GCD is " + a);
		// 3

		for (;;) { // infinite loop
			System.out.println("GCD is ");
		}
	}

}
