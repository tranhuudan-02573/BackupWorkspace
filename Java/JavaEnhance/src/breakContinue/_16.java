package breakContinue;

public class _16 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i == 51) {
				break;
			}
			System.out.print(i + " ");
		}

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}

	}
}
