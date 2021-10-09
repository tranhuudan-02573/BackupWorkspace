package baiTapTuLuyen;

public class CommaNum {
	public static StringBuilder checkNum(int num) {
		StringBuilder s = new StringBuilder(num + "");
		int check = num > 0 ? 0 : 1;
		for (int i = s.length() - 3; i > check; i -= 3) {
			s.insert(i, ',');
		}
		return s;

	}

	public static void main(String[] args) {
		System.out.println(checkNum(100000000));
		System.out.println(checkNum(99));
		System.out.println(checkNum(-10000000));
	}
}
