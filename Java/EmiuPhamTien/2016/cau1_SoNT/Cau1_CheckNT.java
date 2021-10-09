package cau1_SoNT;

import java.util.Scanner;

public class Cau1_CheckNT {
	/*
	 * Số nguyên tố là số chia hết cho 1 và chính nó =>Số <2 không phải số nguyên tố
	 * =>Sô chắn chia hết cho 2 nên cũng k phải là số nguyên tố
	 */
	public static boolean checkNgT(int n) {
		if (n < 2) {
			return false;
		}
		if (n > 2) {
			if (n % 2 == 0) {
				return false;
			}
		}
		for (int i = 3; i <= Math.sqrt(n) + 1; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	/*
	 * Đếm số chữ số của 1 số
	 */
	public static int countNum(int num) {
		int count = 0;
		num = Math.abs(num);
		if (num == 0) {
			count = 0;
		}
		while (num > 0) {
			num /= 10;
			count++;
		}
		return count;
	}

	/*
	 * Kiểm tra good bad
	 */
	public static String checkGoodBad(int n) {
		if (checkNgT(n)) {
			return "Good\n" + countNum(n);
		} else
			return "Bad";
	}

	public static void main(String[] args) {
		/*
		 * Để lặp lại hàm test vĩnh viễn
		 */
		while (true) {
			/*
			 * Dùng try catch để bắt lỗi nếu người dùng nhập ký tự đặc biệt hay chuỗi
			 */
			try {
				System.out.print("Nhap n: ");
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				sc.nextLine();
				if (n < 100000) {
					System.out.println(checkGoodBad(n));
					System.out.println("------------------------");
				} else {
					/*
					 * Kiểm tra nếu người dùng nhập >=100000 thì yêu cầu người dùng nhập lại
					 */
					System.out.println("Số nhập phải nhỏ hơn 100000");
					System.out.println("Mời nhập lại!");

				}
			} catch (Exception e) {
				System.out.println("Lỗi cú pháp!!!");
				System.out.println("Mời nhập lại!");
				System.out.println("------------------------");
			}
		}
	}
}
