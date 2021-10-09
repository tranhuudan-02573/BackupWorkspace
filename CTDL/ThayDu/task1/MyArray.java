package task1;

import java.util.Arrays;

public class MyArray {
	private static int[] array;

	public MyArray(int[] array) {
		MyArray.array = array;
	}

	// UPDATE the value at index i by newValue
	public void update(int i, int newValue) {
		// TODO
		if (i >= array.length || i < 0)
			return;
		array[i] = newValue;

	}

	// CHECK whether there exist a value at index i in the array
	public boolean find(int i) {
		// TODO
		return !(i >= array.length || i < 0);
	}

	// Method mirror that outputs the contents of an array in a //reverse order like
	// a mirror
	// Example: input [1, 2, 3] ==> output: [1, 2, 3, 3, 2, 1]

	// input [1, 2, 3] ==> [1, 2, 3, 3, 2, 1]

	public int[] mirror() {
		// TODO
		int[] arr = new int[array.length * 2];
		for (int i = 0; i < array.length; i++) {
			arr[i] = array[i];
			arr[arr.length - i - 1] = array[i];
		}

		return arr;
	}

	public static int count(int value) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (value == array[i])
				count++;
		}
		return count;
	}

	// GET the element which its occurence is the most in the array.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}
	// Output: 10
	public int getMode() {
		// TODO
		int save = 0, output = 0;
		for (int i = 0; i < array.length; i++) {
			int count = count(array[i]);
			if (count > save) {
				save = count;
				output = array[i];
				
			}
		}

		return output;
	}

	// GET unique elements in the array.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}
	// Output: 12, 9, 2
	public int[] getUniqueElements() {
		// TODO
		int length = 0;
		for (int i = 0; i < array.length; i++) {
			int count = count(array[i]);
			if (count == 1)
				length++;
		}
		int[] arr = new int[length];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			int count = count(array[i]);
			if (count == 1) {

				arr[index] = array[i];
				index++;
			}
		}

		return arr;
	}

	// GET distinct elements in the array.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}
	// Output: 12, 10, 9, 45, 2
	public int[] getDistinctElements() {
		// TODO
		int[] result = new int[array.length];
		int index = 0;
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j <= i; j++) {
				if (j == i) {
					result[index] = array[i];
					index++;
				}
				if (array[i] == array[j]) {

					break;
				}
			}
		}
		int[] output = new int[index];
		System.arraycopy(result, 0, output, 0, index);

		return output;
	}

	public static int[] getDistinctElements(int[] arr) {
		// TODO
		int[] result = new int[arr.length];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j <= i; j++) {
				if (j == i) {
					result[index] = arr[i];
					index++;
				}
				if (arr[i] == arr[j]) {

					break;
				}
			}
		}
		int[] output = new int[index];
		System.arraycopy(result, 0, output, 0, index);

		return output;
	}

	// Common items that belong to two different sets
	public static int[] getIntersectionElements(int[] array1, int[] array2) {
		// TODO
		int[] result = new int[Math.max(getDistinctElements(array1).length, getDistinctElements(array2).length)];
		int index = 0;
		for (int i = 0; i < getDistinctElements(array1).length; i++) {
			for (int j = 0; j < getDistinctElements(array2).length; j++) {
				if (getDistinctElements(array1)[i] == getDistinctElements(array2)[j]) {
					result[index] = getDistinctElements(array1)[i];
					index++;
				}
			}
		}
		int[] output = new int[index];
		System.arraycopy(result, 0, output, 0, index);

		return output;
	}

	// DISPLAY the elements of the array. Using loop to print the elements in the
	// array (without using Arrays.toString(...)
	public String toString() {
		// TODO
		String res = "[";
		for (int i = 0; i < array.length - 1; i++) {
			res += "" + array[i] + ",";
		}
		return res += array[array.length - 1] + "]";
	}

	public static void main(String[] args) {
		int[] array = { 12, 10, 9, 45, 2, 10, 10, 45 };
		int[] array2 = { 12, 10, 12, 10, -5 };
		MyArray myArray = new MyArray(array);
//		MyArray myArray3 = new MyArray(array3);

		System.out.println("method find: " + myArray.find(5));
		System.out.println("method getUniqueElements: " + Arrays.toString(myArray.getUniqueElements()));
		myArray.update(0, -5);
		System.out.println("method getMod: " + myArray.getMode());
		System.out.println("method mirror: " + Arrays.toString(myArray.mirror()));
		System.out.println("method getDistinctElements: " + Arrays.toString(myArray.getDistinctElements()));

		System.out
				.println("method getIntersectionElements: " + Arrays.toString(getIntersectionElements(array, array2)));
		System.out.println("method toString: " + myArray.toString());
	}
}
