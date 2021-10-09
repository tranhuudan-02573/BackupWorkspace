package task1;

import java.util.Arrays;

public class Array1DUtils {

	public static String print1DArray(int[] array) {
		String res = "[";
		for (int i = 0; i < array.length - 1; i++) {
			res += "" + array[i] + ",";
		}
		return res += array[array.length - 1] + "]";
	}

	public static void updateValue(int[] array, int index, int value) {
		array[index] = value;

	}

	public static int sum(int[] array) {
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			result += array[i];
		}
		return result;
	}

	public static int sumForEach(int[] array) {
		int result = 0;
		for (int a : array) {
			result += a;
		}
		return result;
	}

	public static double average(int[] array) {
		return sum(array) * 1.0 / array.length;
	}

	public static boolean isContaint(int[] array, int target) {
		boolean result = false;
		for (int a : array) {
			if (a == target) {
				result = true;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int[] arr = { 23, 24, 35 };
		System.out.println(Array1DUtils.print1DArray(arr));
		Array1DUtils.updateValue(arr, 0, 25);
		Array1DUtils.updateValue(arr, 1, 31);
		System.out.println(Array1DUtils.print1DArray(arr));
		System.out.println(Array1DUtils.sum(arr));
		System.out.println(Array1DUtils.sumForEach(arr));
		System.out.println(Array1DUtils.average(arr));
		System.out.println(Array1DUtils.isContaint(arr, 30));
	}

}
