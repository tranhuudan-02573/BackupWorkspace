package baiTapTuLuyen;

import java.security.Principal;

public class Pascal {
	public static int[][] createPascal(int[] arr) {
		int[][] arr1 = new int[arr.length][];
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = new int[i + 1];
		}
		for(int i = 0;i<arr.length;i++) {
			for(int j =i,value = arr[i];j>-1;j--,value--) {
				arr1[i][j] = value;
			}
		}
		

		return arr1;
	}
	public static void prinPascal(int[][] arr) {
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[] arr = {6,3,1,2};
		prinPascal(createPascal(arr));
	}
}
