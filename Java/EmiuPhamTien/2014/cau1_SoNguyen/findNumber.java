package cau1_SoNguyen;

import java.util.Random;
import java.util.Scanner;

public class findNumber {

	public static int[] createArr(int n) {
		Random rd = new Random();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(n);
		}
		return arr;
	}

	public static void findNumber(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == x) {
					System.out.println(arr[i] + "\t" + arr[j]);
				}
			}
		}
	}

	public static void printArrray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhập x: ");
			int x = sc.nextInt();
			int n = 10;
			int[] arr = createArr(n);
//		int[] arr = {1,2,3,4,5,6,7,8,9,10};
			System.out.println("Mảng mới tạo:");
			printArrray(arr);
			System.out.println("Các cặp số:");
			findNumber(arr, x);
			
		} catch (Exception e) {
			System.out.println("x phải là sô nguyên");
		}
	}
}
