package input;

import java.util.Scanner;

public class _15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = n; i >= -n; i--) {
			System.out.print(i + " ");
		}

		Scanner sc1 = new Scanner(System.in);
		int n1 = sc1.nextInt();
		int answer = 0;
		for (int i = 0; i <= n1; i++) {
			if (i % 2 == 0) {
				answer += i;
			}
			if (i % 5 == 0) {
				answer *= i;
			}
		}
		System.out.println(answer);

		Scanner sc2 = new Scanner(System.in);
		int a = sc2.nextInt();
		int b = sc2.nextInt();
		for (int i = a; i <= b; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i * 5 + j + " ");
			}
			System.out.println();
		}

		Scanner sc3 = new Scanner(System.in);
		int n2 = sc3.nextInt();
		int answer1 = 0;
		for (int i = 1; i <= n2; i++) {
			if (n2 % i == 0) {
				answer1++;
			}
		}
		System.out.println(answer1);

		Scanner sc4 = new Scanner(System.in);
		int a1 = sc4.nextInt();
		int b1 = sc4.nextInt();
		int answer2 = 1;
		for (; b1 > 0; b1--) {
			answer2 *= a1;
		}
		System.out.print(answer2);

		Scanner sc5 = new Scanner(System.in);
		int a2 = sc5.nextInt();
		int b2 = sc5.nextInt();
		for (int i = a2; i <= b2; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
