package baiTapTuLuyen;

public class Contain {

	public static boolean contain(int[] arr1, int[] arr2) {
		if (arr2.length > arr1.length) {
			return false;
		}
		int len = arr1.length - arr2.length;
		int[] arr3 = new int[arr2.length];

		for (int i = 0; i <= len; i++) {
			System.arraycopy(arr1, i, arr3, 0, arr2.length);
			if (check(arr3, arr2)) {
				return true;
			}
		}

		return false;
	}

	private static boolean check(int[] arr1, int[] arr3) {
		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i] != arr1[i]) {
				return false;

			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 5 };
		int[] arr2 = { 1, 2,2 };

		System.out.println(contain(arr1, arr2));
	}

}
