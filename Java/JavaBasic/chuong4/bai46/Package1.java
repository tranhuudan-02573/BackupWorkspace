package bai46;

public class Package1 extends IceCream{// đóng gói kem
	private String method;// phương pháp đóng gói  
	// contructor
	public Package1(String name, int price, double weight, String type, String method) {
		super(name, price, weight, type);
		this.method = method;
	}
	// getter and setter
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}

	
	

	


}
