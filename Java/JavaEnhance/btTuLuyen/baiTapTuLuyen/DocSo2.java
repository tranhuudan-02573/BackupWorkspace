package baiTapTuLuyen;

import java.util.Scanner;

public class DocSo2 extends DocSo1 {

	static Scanner sc = new Scanner(System.in);

	static void test() {

		while (true) {
			try {
				System.out.println("nhap mot so bat ki co gia tri tu 0 den 999:");
				int s = sc.nextInt();
				System.out.println("So duoc doc la: " + readNumber(s));
			}

			catch (ArrayIndexOutOfBoundsException e) {
				System.out.print("Vui long ");
			}
		}

	}

	public static void main(String[] args) {
		test();
	}

}


