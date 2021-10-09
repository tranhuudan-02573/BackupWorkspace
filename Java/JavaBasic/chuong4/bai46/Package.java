package bai46;

public class Package extends Juice{// đóng gói nước ép
	private String method;// phương pháp đóng gói 
	// contructor
	public Package(String name, int price, double weight, String flavor, String method) {
		super(name, price, weight, flavor);
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
