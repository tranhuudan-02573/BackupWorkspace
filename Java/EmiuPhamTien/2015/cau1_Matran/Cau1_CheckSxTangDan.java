package cau1_Matran;

public class Cau1_CheckSxTangDan {

	// Cách 2
	public static boolean checkEventMainDiagonal2(int[][] arr) {
		// tang dan
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i][i] > arr[j][j]) {
					return false;
				}
			}
		}
		return true;
	}

	// Cách 1
	public static boolean checkEventMainDiagonal(int[][] arr) {
		// tang dan
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i][i] > arr[i + 1][i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] arr = { { 2, 5, 7 }, { 6, 6, 5 }, { 1, 6, 6 } };
		System.out.println(checkEventMainDiagonal2(arr));
	}
}
