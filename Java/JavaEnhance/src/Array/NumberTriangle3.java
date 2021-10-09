package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberTriangle3 {
	public static void main(String[] args) {
		int num, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập n: ");
		num = sc.nextInt();
		System.out.println();
		n = num;
		// vẽ phần tam giác ngược
		for (int r = 1; r <= num; r++) {
			// phần 1
			for (int sp = 1; sp <= r; sp++) {
				System.out.print(" ");
			}
			// phần 2
			for (int c = 1; c <= n; c++) {
				System.out.print("a");
			}
			// phần 3
			for (int c = num - r; c >= 1; c--) {
				System.out.print("b");
			}
			n--;
			System.out.println();
		}

		// vẽ tam giác khuyết đỉnh
		for (int r = 2; r <= num; r++) {
			// phần 1
			for (int sp = num - r + 1; sp >= 1; sp--) {
				System.out.print(" ");
			}
			// phần 2
			for (int c = 1; c <= r; c++) {
				System.out.print("d");
			}
			// phần 3
			for (int c = r - 1; c >= 1; c--) {
				System.out.print("e");
			}
			System.out.println();
		}

	}
}
