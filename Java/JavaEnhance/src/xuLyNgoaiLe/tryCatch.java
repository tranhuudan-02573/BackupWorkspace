package xuLyNgoaiLe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Numerator: ");
			int numerator = scanner.nextInt();
			System.out.print("Denominator: ");
			int denominator = scanner.nextInt();
			int result = numerator / denominator;
			System.out.printf("\nResult: %d / %d = %d\n", numerator, denominator, result);
		} // end try
		catch (InputMismatchException inputMismatchException) {
			System.err.println("Exception: " + inputMismatchException);
			scanner.nextLine(); // discard input
			System.out.println("You must enter integers.\n");
		} // end catch
		catch (ArithmeticException arithmeticException) {
			System.err.println("Exception: " + arithmeticException);
			System.out.println("Zero is an invalid denominator");
		} // end catch
	}

}
