package Array;

public class DiffArray {
	public static void main(String[] args) {

		int n, h, m = 0, i, j, x, y;
		// Change below values or use runtime input.
		n = 7; // Number of row.
		x = 1; // Increament per row.
		y = 2; // Increament each value on a row.
		h = n / 2; // A half.
		for (i = 0; i < n; ++i) {
			// Leading spaces.
			if (i < h) {
				m = i;
				System.out.println(m);
			} else if ((i >= h)) {
				m = (n - i - 1);
				System.out.println(m);
			}
			for (j = 0; j < m; ++j) {
				System.out.print("   ");
			}
			// Numbers.
			m = n - m * 2;
			for (j = 0; j < m; ++j) {
				System.out.printf("%-3d", j * y + (i + 1) * x);
			}
			if (i < h) {
				m = i;
			} else if ((i >= h)) {
				m = (n - i - 1);
			}
			for (j = 0; j < m; ++j) {
				System.out.print("   ");
			}
			System.out.print("|");
			// New line
			System.out.print("\n");
		}
	}
}
