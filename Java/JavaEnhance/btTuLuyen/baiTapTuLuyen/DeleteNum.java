package baiTapTuLuyen;

public class DeleteNum {
	public int[] delete(int[] arr, int x) {
		int c;
		for (int i = c = 0; i < arr.length; i++) {
			if (arr[i] != x) {
				c++;
			}
		}
		int[] result = new int[c];
		for (int i = c = 0; i < arr.length; i++) {
			if (arr[i] != x) {
				result[c] = arr[i];
				c++;
			}
		}
		return result;

	}

	public void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 4, 6, 7, 4, 6, 6, 4 };
		new DeleteNum().display(new DeleteNum().delete(arr, 4));

	}
}
