package thuatToanTimKiem;

public class JumpSearch {
	// Iterative
	public int jumpSearchIterative(int[] a, int target) {
		int blockSize = (int) Math.sqrt(a.length);
		int start = 0;
		int next = blockSize;

		while (start < a.length && target > a[next - 1]) {
			start = next;
			next = next + blockSize;

			if (next >= a.length)
				next = a.length;
		}

		for (int i = start; i < next; i++) {
			if (target == a[i])
				return i;
		}

		return -1;

	} // method ends

}
