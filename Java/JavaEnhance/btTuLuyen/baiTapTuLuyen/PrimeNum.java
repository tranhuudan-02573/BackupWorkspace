
package baiTapTuLuyen;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNum {

	public static boolean checkSoNguyenTo(int n) {
		if (n < 2)
			return false;
		if (n == 2)
			return true;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int[] find(int n, int m) {
		int[] t = new int[m];

		int i = 0;
		while (i < m) {
			if (checkSoNguyenTo(n)) {
				t[i] = n;
				i++;
			}
			n++;

		}
		return t;
	}

	void phantichthuasonguyento(int n) {
		for (int i = 2; i <= n; i++) {
			while (checkSoNguyenTo(i) && (n % i == 0)) {
				System.out.print(" " + i);
				n /= i;
			}
		}
	}

	public static void main(String[] args) {
		PrimeNum a = new PrimeNum();
		System.out.println(Arrays.toString(a.find(10, 5)));
		System.out.println(a.checkSoNguyenTo(4));
		a.phantichthuasonguyento(12);
	}

}
