package Bits;

import java.util.Scanner;

public class Bits {
	// Note: It's acceptable to use int instead of short
	// throughout this program.
	static final short READY = 1;
	static final short PROCESSING = 2;
	static final short RECOVERING = 4;
	static final short ERROR = 8;

	static final String READY_STRING = "ready to receive requests";
	static final String PROCESSING_STRING = "processing a request";
	static final String RECOVERING_STRING = "error recovery in progress";
	static final String ERROR_STRING = "unrecoverable error occurred";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int status = sc.nextInt();

		if ((status & READY) == READY) {
			System.out.println(READY_STRING);
		}
		
		if ((status & PROCESSING) == PROCESSING) {
			System.out.println(PROCESSING_STRING);
		}
		if ((status & RECOVERING) == RECOVERING) {
			System.out.println(RECOVERING_STRING);
		}
		if ((status & ERROR) == ERROR) {
			System.out.println(ERROR_STRING);
		}
	}
}
