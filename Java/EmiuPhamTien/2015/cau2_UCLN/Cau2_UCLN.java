package cau2_UCLN;

public class Cau2_UCLN {

	public static int uscln(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		if (a == 0 || b == 0) {
			return a + b;
		}
		while (a != b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}
		return a;
	}

	public static void main(String[] args) {
		int a = 42;
		int b = 56;
		System.out.println("UCLN của " + a + " và " + b + " là: " + uscln(a, b));
	}
}
