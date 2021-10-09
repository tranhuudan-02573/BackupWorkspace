package bai5_4;

public class Mother extends Person {

	public Mother(Parents parent) {
		super(parent);
	}
	// toString
	public String toString() {
		return "name Mother: " + super.toString();
	}

}
