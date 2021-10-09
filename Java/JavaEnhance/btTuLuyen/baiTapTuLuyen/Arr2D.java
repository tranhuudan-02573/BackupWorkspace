package baiTapTuLuyen;

public class Arr2D {
	public int maxSum(int[][] arr) {
		int max;
		int tong = 0;

		for (int j = 0; j < arr[0].length; j++) {
			tong += arr[0][j];

		}
		max = tong;
		System.out.println("dong1: " + max);
		int rowPosition = 0;
		for (int i = 1; i < arr.length; i++) {
			tong = 0;
			for (int j = 0; j < arr[i].length; j++) {
				tong += arr[i][j];
			}
			System.out.println("dong2: " + tong);
			if (tong > max) {
				max = tong;
				rowPosition = i;

			}
		}
		return rowPosition;
	}

	public void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 2, 3, 4 } };
		System.out.println(new Arr2D().maxSum(arr));
		new Arr2D().display(arr);
	}
}
