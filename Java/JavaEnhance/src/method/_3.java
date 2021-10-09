package method;

import java.util.Scanner;

public class _3 {
	public static int max3(int a, int b, int c) {
		if(a >= b && a >= c) {
			return a;
		}
		if(b >= c) {
			return b;
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.print(max3(a, b, c));
	}
}
