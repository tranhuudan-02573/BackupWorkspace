package baiTapTuLuyen;

public class SinX {
	public static double sin(double x, double gamaValue) {
		double res = 0, g;
		int n = 0;
		int sign = 1;
		x = x % (2 * Math.PI);
		do {
			g = gama(x, n++);
			res += sign * g;
			sign *= (-1);

		} while (g > gamaValue);
		return res;
	}

	public static double gama(double x, int n) {
		return Math.pow(x, 2 * n + 1) / fact(2 * n + 1);

	}

	public static long fact(int n) {
		long res = 1;
		for (int i = 1; i <= n; i++) {
			res *= i;
		}
		return res;
	}

	public static void main(String[] args) {
		double x = 2 * Math.PI + Math.PI / 2;
		double gamaValue = 0.000000000000000001;
		System.out.println(SinX.sin(x, gamaValue));
		System.out.println(Math.sin(x));
	}
}
