package task5;

import java.io.*;

public class Partern1_1 {
	// Print Pascal's Triangle in Java
	/*
	 * Độ phức tạp về thời gian: O (N 2 )
	 * 
	 * Cách tiếp cận # 2:
	 * 
	 * Mục nhập thứ i trong dòng số dòng là Hệ số nhị thức C (dòng, i) và tất cả các
	 * dòng bắt đầu bằng giá trị 1. Ý tưởng là tính C (dòng, i) bằng cách sử dụng C
	 * (dòng, i-1) .
	 * 
	 * C (dòng, i) = C (dòng, i-1) * (dòng - i + 1) / i
	 * 
	 */
	// Pascal function
	public static void printPascal(int n) {
		for (int line = 1; line <= n; line++) {
			for (int j = 0; j <= n - line; j++) {

				// for left spacing
				System.out.print(" ");
			}

			// used to represent C(line, i)
			int C = 1;
			for (int i = 1; i <= line; i++) {

				// The first value in a line is always 1
				System.out.print(C + " ");
				C = C * (line - i) / i;
			}
			System.out.println();
		}
	}

	// Driver code
	public static void main(String[] args) {
		int n = 4;
		printPascal(n);
	}
}
