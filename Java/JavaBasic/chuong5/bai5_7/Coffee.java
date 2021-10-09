package bai5_7;

public class Coffee extends AAnItem {
	private String label;
	// constructor
	public Coffee(String label, String branchName, double weight, double price) {
		super(branchName, weight, price);
		this.label = label;
	}
	// getter and setter
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
}
