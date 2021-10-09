package bai5_4;

public class Father extends Person {

	public Father(Parents parent) {
		super(parent);
	}
	// toString
	public String toString() {
		return "\nname Father: " + super.toString();
	}

}
