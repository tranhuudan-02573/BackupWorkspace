package Code;

public class FiboNum {
	public static int fibonacci(int n) {
		if (n < 0) {
			return -1;
		} else if (n == 0 || n == 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

}
