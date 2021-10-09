package task5;

import java.io.*;

public class Partern1 {
	// Print Pascal's Triangle in Java
//	công thức nCr:

//		 n ! / (n - r)! NS ! 
	/*
	 * Sau khi sử dụng công thức nCr, biểu diễn bằng hình ảnh sẽ trở thành:
	 * 
	 * 0C0 1C0 1C1 2C0 2C1 2C2 3C0 3C1 3C2 3C3
	 * 
	 * Thuật toán:
	 * 
	 * Lấy một số hàng được in, giả sử nó là n Thực hiện lặp lại bên ngoài i từ 0
	 * đến n lần để in các hàng. Thực hiện lặp bên trong cho j từ 0 đến (N - 1). In
	 * một khoảng trống duy nhất ”“ Đóng vòng lặp bên trong (vòng lặp j) // nó cần
	 * cho khoảng cách bên trái Thực hiện lặp bên trong cho j từ 0 đến i. In nCr của
	 * i và j. Đóng vòng lặp bên trong. In ký tự dòng mới (\ n) sau mỗi lần lặp bên
	 * trong.
	 */
	public int factorial(int i) {
		if (i == 0)
			return 1;
		return i * factorial(i - 1);
	}

	public static void main(String[] args) {
		int n = 4, i, j;
		Partern1 g = new Partern1();
		for (i = 0; i <= n; i++) {
			for (j = 0; j <= n - i; j++) {

				// for left spacing
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {

				// nCr formula
				System.out.print(" " + g.factorial(i) / (g.factorial(i - j) * g.factorial(j)));
			}

			// for newline
			System.out.println();
		}
	}
}
