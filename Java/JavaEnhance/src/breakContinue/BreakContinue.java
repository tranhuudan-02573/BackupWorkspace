package breakContinue;

import junit.framework.TestCase;

public class BreakContinue extends TestCase {
	public void test() {
		int out, in = 0;
		for (out = 0; out < 10; out++) {
			for (in = 0; in < 20; in++) {
				if (in > 10)
					break;
			}
			System.out.println("inside the outer loop: out = " + out + ", in = " + in);
		}
		System.out.println("end of the outer loop: out = " + out + ", in = " + in);
	}
}
