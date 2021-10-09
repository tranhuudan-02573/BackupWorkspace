package bai26;

public class Quadratic { // phương trình bậc 2 
	private double a; // hệ số bậc 2  
	private double b; // hệ số bậc 1
	private double c; // hệ số tự do
	// contructor
	public Quadratic(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	// getter and setter
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	// tính denlta
	public double  computeDenta(){ 
		return (this.b * this.b) - (4 * this.a * this.c);
	}
	// kiểm tra xem phương trình đó có bao nhiêu nghiệm
	public String whatKind() { 
		double denta = this.computeDenta();
		if (this.a == 0)
			return "degenerate";
		if (denta < 0)
			return "none";	
		if (denta == 0)
			return "oneSolution";
		return "twoSolution";
	}
}	
