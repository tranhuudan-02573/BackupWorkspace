package task4;

import java.util.Arrays;

public class Array1DUtils {
	// ----------------FILL YOUR FULL NAME AND ID--------------------------
	/*
	 * Your full name: Id:
	 */
	// ------------------------DO TEST-------------------------------------

	/*
	 * QUESTION 1: 2 POINT Write small program to reverse array of character (1.5
	 * point) Example: ['l','a','n'] => ['n','a','l'] Test your program with your
	 * name (0.5 point)
	 */

	/*
	 * QUESTION 2: 2 POINT Write small program to insert a element with index and
	 * value in array of int (1.5 point) Example: ['1','2','3'] insert element
	 * index=0 , value=0 => ['0','1','2','3'] Test your program (0.5 point)
	 */
	public static char[] reverse(char[] ch) {
		char[] c = new char[ch.length];
		int n = 0;
		for (int i = ch.length - 1; i >= 0; i--) {
			c[n] = ch[i];
			n++;
		}
		return c;

	}

	public static int[] insert(int a, int i, int[] array) {
		int[] arr = new int[array.length + 1];
		System.arraycopy(array, 0, arr, 0, i);
		System.arraycopy(array, i, arr, i + 1, array.length - i);

		arr[i] = a;

		return arr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch = { 'a', 'b', 'c' };
		int[] arr = { 1, 2, 3 };
		System.out.println(Arrays.toString(reverse(ch)));
		System.out.println(Arrays.toString(insert(5, 1, arr)));
	}

}
