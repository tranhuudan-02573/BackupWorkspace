package task4;

public class Task4 {
	public static int getSn1(int n) {
		if (n == 1)
			return 1;
		return (int) (Math.pow(-1, n + 1)) * n + getSn1(n - 1);
	}

	public static int factorial(int n) {
		// TODO Auto-generated method stub
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}

	public static int getSn2(int n) {
		if (n == 1)
			return 1;
		return factorial(n) + getSn2(n - 1);	
	}

	public static int getSn3(int n) {
		if (n == 1)
			return 1;
		return n * n + getSn3(n - 1);
	}

	public static double sup4(int n) {
		// TODO Auto-generated method stub
		if (n == 1)
			return 2;
		return 2 * n * sup4(n - 1);
	}

	public static double getSn4(int n) {
		if (n == 0)
			return 1.0;
		return 1 / (sup4(n) + getSn4(n - 1));
	}

	public static void main(String[] args) {
		System.out.println(getSn1(3));
		System.out.println(getSn2(3));
		System.out.println(getSn3(3));
		System.out.println(getSn4(3));
	}

}
