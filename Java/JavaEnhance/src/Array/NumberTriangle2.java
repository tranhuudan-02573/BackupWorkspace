package Array;

import java.util.Scanner;

public class NumberTriangle2 {
	public static void main(String[] args) {
		int num;
		System.out.print("Nhập số dòng của hình: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for (int r = 1; r <= num; r++) {
			for (int sp = 1; sp <= num - r; sp++) {
				System.out.print("  ");
			}
			for (int c = 1; c <= 2 * r - 1; c++) {
				System.out.print(" " + c);
			}
			System.out.println();
		}
	}
}
