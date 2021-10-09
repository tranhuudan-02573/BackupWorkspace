package Array;

import java.util.Scanner;

public class NumberTriangle1 {
	public static void main(String[] args) {
		int num;
		System.out.print("Số dòng: ");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		for (int r = 1; r <= num; r++) {
			for (int sp = num - r; sp > 0; sp--) {
				System.out.print(" ");
			}
			for (int c = 1; c <= r; c++) {
//				System.out.print(c);
				System.out.print(r);
			}
			for (int k = 2; k <= r; k++) {
				System.out.print(r);
			}
			System.out.println();
		}
	}
}
