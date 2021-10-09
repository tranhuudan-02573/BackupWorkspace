package doWhile;

public class _17 {
	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while (i <= 5);

		int i1 = 1;
		do {
			if (i1 % 10 == 0) {
				System.out.print(i1 + " ");
			}
			i1++;
		} while (i1 <= 1000);
	}
}
