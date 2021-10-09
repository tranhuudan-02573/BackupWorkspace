package baiTapTuLuyen;

public class Num {
	public int digits(int n) {
		// TODO Auto-generated constructor stub
		int count = 0;
		while (n > 0) {
			n /= 10;
			count++; // tăng biến count lên 1
		}
		return count;

	}

	public int reverse(int n) {
		int result = 0;
		while (n != 0) {
			int digit = n % 10;
			result = result * 10 + digit;
			n /= 10;
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(new Num().digits(12345));
		System.out.println(new Num().reverse(12345));
	}
}
