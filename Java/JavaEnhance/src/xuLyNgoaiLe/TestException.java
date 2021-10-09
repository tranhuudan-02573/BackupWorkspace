package xuLyNgoaiLe;

import java.util.*;

public class TestException {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Numerator: ");
		int numerator = scanner.nextInt();
		System.out.print("Denominator: ");
		int denominator = scanner.nextInt();

		
		if (denominator == 0) {
			   // error handling
			} else {
			   int result = numerator/denominator;
			   System.out.printf("\nResult: %d / %d = %d\n",
			                numerator, denominator, result );
			}
		
	}
	
}
