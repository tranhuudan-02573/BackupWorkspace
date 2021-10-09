package task4;

import java.util.Arrays;

public class Task6 {
	static int[] first = { 1 };

	public static void printPascalTriangle(int row) {
		for (int i = 1; i <= row; i++) {
			System.out.println(Arrays.toString(getPascalTriangle(i)));
		}
	}

	public static int[] getPascalTriangle(int n) {
		if (n == 1)
			return new int[] { 1 };
		return generateNextRow(getPascalTriangle(n - 1));
	}

	public static int[] generateNextRow(int[] prevRow) {
		int[] rus = new int[prevRow.length + 1];
		rus[0] = 1;
		rus[rus.length - 1] = 1;
		for (int i = 1; i < rus.length - 1; i++) {
			rus[i] = prevRow[i - 1] + prevRow[i];
		}
		return rus;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2 };
		System.out.println(Arrays.toString(generateNextRow(a)));
		System.out.println(Arrays.toString(getPascalTriangle(5)));
		printPascalTriangle(4);
	}

}
