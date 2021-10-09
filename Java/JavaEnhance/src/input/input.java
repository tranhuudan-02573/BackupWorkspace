package input;

import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Hello " + sc1.next());

		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String address = sc.next();
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);

		Scanner sc2 = new Scanner(System.in);
		int a = sc2.nextInt();
		int b = sc2.nextInt();
		System.out.println("a + b = " + (a + b));

		Scanner sc3 = new Scanner(System.in);
		char c = (char) (sc3.next().charAt(1) + 1);
		System.out.println(c);
	}
}
