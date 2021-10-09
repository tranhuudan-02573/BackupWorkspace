package breakContinue;

import junit.framework.TestCase;

public class Continue extends TestCase{
	public void test(){
	   int out,in=0;
      outer:
	   for (out = 0 ;out<10; out++){
		for (in =0; in<20; in++){
			if (in>10) break outer;
		}
		System.out.println("inside the outer loop: out = " +
						out + ", in = " + in);
     }
	  System.out.println("end of the outer loop: out = " +
						out + ", in = " + in)	;
	}
}

