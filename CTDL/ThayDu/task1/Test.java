package task1;

public class Test {
	public static boolean seachFirst() {
		boolean result = false;
		int[] array = { 10, 5, 9, 3, 8, 5, 8, 5 };
		int matchValue = 8;
		for (int i = 0; i < array.length; i++) {
			if (matchValue == array[i]) {
				System.out.println(i);
				result = true;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		seachFirst();
	}
}
