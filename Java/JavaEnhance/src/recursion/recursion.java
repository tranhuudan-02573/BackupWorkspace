package recursion;

import java.util.Scanner;

public class recursion  {

	public static void main(String[] args) {

		// recursion = the process in which a method calls itself continuously
		// a method that calls itself is called a recursive method
		// useful for factorials, transversing trees, and simplifying a complex task

		Scanner scan = new Scanner(System.in);
		System.out.println("How far do you want to walk (meters)?: ");
		int distance = scan.nextInt();

		takeAStep(0, distance);

	}

	static void takeAStep(int i, int distance) {
//		if (i < distance) {
//			i++;
//			System.out.println("*you take a step* : " + i + " meter/s");
//			takeAStep(i, distance);
//		} else {
//			System.out.println("You are done walking!");
//		}
		for(int j =i;j<=distance;j++) {
			System.out.println("*you take a step* : " + j + " meter/s");
			if(j==distance) {
				System.out.println("You are done walking!");
			}
		}

	}

}
