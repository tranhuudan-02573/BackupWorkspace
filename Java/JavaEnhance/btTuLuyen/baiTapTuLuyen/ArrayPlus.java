package baiTapTuLuyen;

public class ArrayPlus {
	static int[] arrayPlus(int[] arr1, int[] arr2) {
		int[] arr3;
		int maxLen = (arr1.length > arr2.length) ? arr1.length : arr2.length;
		arr3 = new int[maxLen];
		System.arraycopy(arr1, 0, arr3, maxLen - arr1.length, arr1.length);
		for (int i = maxLen - 1, j = arr2.length - 1; j > -1; i--, j--) {
			arr3[i] += arr2[j];
		}
		return arr3;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2 };
		int[] arr3 = arrayPlus(arr1, arr2);
		for (int i : arr3)
			System.out.print( i + " " );
		
	}

}
