package baiTapTuLuyen;

public class ArrayMark {
	public boolean knitting(int[] arr) {
		int[] result = new int[2];
		for (int i = 0; i <= arr.length - 2; ++i) {
			System.arraycopy(arr, i, result, 0, 2);
			if (result[0] * result[1] > 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int[] arr = { 1, -2, -3, -5, 3, -6 };
		System.out.println(new ArrayMark().knitting(arr));
	}
}
