package baiTapTuLuyen;

import java.util.Iterator;
import java.util.Random;

public class RandomArr {
	public static int[] randomArr(int[] arr, int qty) {
		if (qty > arr.length || qty <= 0)
			return null;
		else {
			Random rd = new Random();
			int[] end = new int[qty];
			int[] arr1 = new int[qty];
			for (int i = 0; i < qty; i++) {
				arr1[i] = rd.nextInt(arr.length - 1);
				for (int j = 0; j < i; j++) {
					if (arr1[i] == arr1[j]) {
						i--;
					}
				}
				end[i] = arr[arr1[i]];
			}
			return end;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int qty = 3;
		int[] end = randomArr(arr, qty);
		for (int i = 0; i < qty; i++) {
			System.out.print(end[i] + " ");
		}

	}
}
