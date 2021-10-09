package task4;

public class Fibonacci {
	public static int getFibo(int n) {
		if (n < 0) {
			throw new IllegalAccessError();

		} else if (n == 0 || n == 1) {
			return n;
		} else
			return getFibo(n - 1) + getFibo(n - 2);
	}

	public static void prinFibo(int n) {
		if (n == 0) {
			System.out.print(n + " ");
		} else {
			prinFibo(n - 1);
			System.out.print(getFibo(n) + " ");
		}

	}

	public static void main(String[] args) {
		System.out.println(getFibo(4));
		prinFibo(10);
	}
}
