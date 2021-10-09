package baiTapTuLuyen;

import java.util.Scanner;

public class ArrayDx {
	public boolean Dx(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i][j] != arr[j][i])
					return false;
			}
		}
		return true;

	}

	public void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 2, 2, 5 }, { 3, 5, 2 } };
		System.out.println(new ArrayDx().Dx(arr));
		new ArrayDx().display(arr);
	}

}
