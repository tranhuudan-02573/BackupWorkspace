package QuanLiSV;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("1.them");
		System.out.println("2.sua");
		System.out.println("3.xoa");
		Scanner s = new Scanner(System.in);
		int opt = s.nextInt();
		switch (opt) {
		case 1: {
			add();
		}
		case 2: {
			change();
		}
		case 3: {
			delete();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opt);
		}
	}

	private static void delete() {
		// TODO Auto-generated method stub
		
	}

	private static void change() {
		// TODO Auto-generated method stub

	}

	private static void add() {
		// TODO Auto-generated method stub

	}
}
