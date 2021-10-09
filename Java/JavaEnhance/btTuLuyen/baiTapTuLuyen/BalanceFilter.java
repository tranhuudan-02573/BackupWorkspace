package baiTapTuLuyen;

public class BalanceFilter {
	public static int[] filter(int n, int balance) {
		int[] res = new int[balance];

		for (int i = 1; i <= n; i++) {

			res[i % balance]++;

		}
		return res;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("dư " + i + " gồm: " + arr[i] + " số");
		}
	}

	public static void main(String[] args) {
		display(filter(1, 5));
	}
}
