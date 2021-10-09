package xuLyNgoaiLe;

class Fraction {
	   private int numerator, denominator;

	   public Fraction (int n, int d) throws ArithmeticException {
	      if (d==0) throw new ArithmeticException();
	      numerator = n; denominator = d;
	   }
	}

	public class TestException2 {
	   public static void main(String [] args) {
	      Fraction f = new Fraction (2,0);
	   }
	}


